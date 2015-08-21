
public class StringSize {

	public static void main (String args[]) {
		String a = "AshishKumarASHOK/AshishKumarASHOK/AshishKumarASHOK/AshishKumarASHOK/AshishKumarASHOK/AshishKumarASHOK/AshishKumarASHOK/AshishKumarASHOK/AshishKumarASHOK/AshishKumarASHOK/";
		System.out.println(a.length());
		String b = "a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/u/v"; 
		String[] bArray = b.split("/");
		for (int i=0; i<bArray.length;i++) {
			String categoryPath = "";
			for (int j=0;j<=i;j++) {
				categoryPath += bArray[j]+"/";
			}
			System.out.println(categoryPath.substring(0, categoryPath.length()-1));
		}
		
		
		for (int i=bArray.length; i>0;i--) {
			String categoryPath = "";
			for (int j=0;j<i;j++) {
				categoryPath += bArray[j]+"/";
			}
			System.out.println(categoryPath.substring(0, categoryPath.length()-1));
		}
		String c = "a";
		String[] cArray = c.split("/");
		System.out.println(cArray.length+"\t"+cArray[0]);
	}
}
