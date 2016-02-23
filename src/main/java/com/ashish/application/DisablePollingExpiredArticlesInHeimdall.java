package com.ashish.application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;


public class DisablePollingExpiredArticlesInHeimdall  {

      public static Connection getConnection(String url, String username, String password) throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        Class.forName(driver); // load MySQL driver
        Connection conn = DriverManager.getConnection(url, username, password);
        return conn;
      }
    
      public static void main (String args[]) {
         Connection connection1 = null; 
         Connection connection2 = null; 
         Calendar calendar = Calendar.getInstance();
         java.util.Date now = calendar.getTime();
         try {
                String liferay_sql = "select articleId from JournalArticle where status IN (6,0) and structureId=\"PACKAGESTRUCTURE\" and expirationDate <= NOW()"; //This query gets all those journal articles whose expiration date was in the past but the status is INCOMPLETE or APPROVED
                String heimdall_select_sql = "select assetId from AssetStatus where polling='Y'"; //polling with value Y means that the asset is currently being polled
                //"jdbc:mysql://localhost:3306/lportal_6p1","root", "root"
                //"jdbc:mysql://localhost:3306/heimdall_v2","root", "root"
                connection1 = getConnection(args[0], args[2], args[3]);
                connection2 = getConnection(args[1], args[2], args[3]);
                Statement statement1 = connection1.createStatement();
                ResultSet rs1 = statement1.executeQuery(liferay_sql);
                Set<String> expiredAssetIds = new HashSet<String>();
                while (rs1.next()) {
                    String articleId = rs1.getString("articleId");
                    if(articleId.contains("EN") || articleId.contains("FR")) {
                        String assetId = articleId.substring(0, articleId.length()-2); //Package assetId of Asset Metadata XML
                        expiredAssetIds.add(assetId);
                    }
                 }
                 Statement statement2 = connection2.createStatement();
                 ResultSet rs2= statement2.executeQuery(heimdall_select_sql);
                 Set<String> assetStatusAssetIds = new HashSet<String>();
                 while (rs2.next()) {
                     String assetId = rs2.getString("assetId");
                     assetStatusAssetIds.add(assetId);
                 }
                 //retainAll does the INTERSECTION of sets expiredAssetIds and assetStatusAssetIds. The result is stored in expiredAssetIds
                 expiredAssetIds.retainAll(assetStatusAssetIds); 
                 if (expiredAssetIds.size() == 0) {
                     System.out.println(now.toString() + " " + DisablePollingExpiredArticlesInHeimdall.class.getName() + ": No Assets found in AssetStatus table from heimdall_v2 database that need to be disabled for polling");
                 } else {
                   //Now delete all the assetIds that are expired in Chameleon/Liferay and are being polled by Heimdall 
                     StringBuilder builder = new StringBuilder();
                     for( int i = 0 ; i < expiredAssetIds.size(); i++ ) {
                         builder.append("?,");
                     }
                     if (builder.length()>0) {
                         String heimdall_delete_sql = "Update  AssetStatus set polling='N' where polling='Y' and assetId in (" + builder.deleteCharAt( builder.length() -1 ).toString() + ")";
                         PreparedStatement statement3 = connection2.prepareStatement(heimdall_delete_sql);
                         int index = 1;
                         for (String assetIdToDelete : expiredAssetIds) {
                             statement3.setObject(  index++, assetIdToDelete );
                             System.out.println(now.toString() + " " + DisablePollingExpiredArticlesInHeimdall.class.getName() + ": Disabling polling for assetId: " + assetIdToDelete + " from AssetStatus table");
                         }
                         int result = statement3.executeUpdate();
                         if (result > 0) {
                             System.out.println(now.toString() + " " + DisablePollingExpiredArticlesInHeimdall.class.getName() + ": Successfully disabled polling for all the Assets in Heimdall that are expired in Chameleon");
                         }
                     }
                 }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (connection1 != null) {
                        connection1.close();
                    }
                    if (connection2 != null) {
                        connection2.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
}
