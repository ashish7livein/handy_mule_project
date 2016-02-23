package com.ashish.application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DeleteExpiredArticlesInHeimdall  {

      public static Connection getConnection(String url, String username, String password) throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        Class.forName(driver); // load MySQL driver
        Connection conn = DriverManager.getConnection(url, username, password);
        return conn;
      }
    
      public static void main (String args[]) {
         Connection connection1 = null; 
         Connection connection2 = null; 
         try {
                String liferay_sql = "select articleId from JournalArticle where status=3 and structureId=\"PACKAGESTRUCTURE\"";
                String heimdall_sql = "delete from AssetStatus where assetId=?and polling='Y'";
                //"jdbc:mysql://localhost:3306/lportal_6p1","root", "root"
                //"jdbc:mysql://localhost:3306/heimdall_v2","root", "root"
                connection1 = getConnection(args[0], args[2], args[3]);
                connection2 = getConnection(args[1], args[2], args[3]);
                Statement statement1 = connection1.createStatement();
                ResultSet rs = statement1.executeQuery(liferay_sql);
                while (rs.next()) {
                    String articleId = rs.getString("articleId");
                    if(articleId.contains("EN") || articleId.contains("FR")) {
                        String assetId = articleId.substring(0, articleId.length()-2);//Package assetId of Asset Metadata XML
                        PreparedStatement statement2 = connection2.prepareStatement(heimdall_sql);
                        statement2.setString(1, assetId);
                        int result = statement2.executeUpdate();
                        if (result == 1) {
                            System.out.println("Deleted assetId: " + assetId + " from AssetStatus table");
                        }
                    }
                 }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    connection1.close();
                    connection2.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
}
