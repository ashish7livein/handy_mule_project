import java.util.ArrayList;
import java.util.Locale;
import java.util.Stack;
import java.util.Vector;


public class Test {

	public static void main(String[] args) {
		/*  String[] codes = java.util.Locale.getISOLanguages();
		  for (String isoCode: codes) {
		   Locale locale = new Locale(isoCode);
		   System.out.println(isoCode.toUpperCase() + "(\"" + locale.getDisplayLanguage(locale) + "\"),");
		  }*/
		for(LanguageCode code : LanguageCode.values()) 	{
			System.out.println(code.name()+ "      "+code.getLanguageCode()+"      "+LanguageCode.valueOf("ENGLISH"));
		}
		
		String parenthesis = "(((()))())";
		Stack<Integer> stack  = new Stack<Integer>();
		Vector<Integer> arrList = new Vector<Integer>();
		arrList.setSize(10);
		for (int index = 0; index< parenthesis.length();index++) {
			if(parenthesis.charAt(index)=='(') {
				stack.push(index);
			}else
				if(parenthesis.charAt(index)==')') {
					Integer openingIndex = stack.pop();
					arrList.add(openingIndex,index);
					System.out.println(openingIndex+","+index);
				}
		}
		
		for (int index=0; index<arrList.size();index++) {
			if(arrList.get(index)!=null);
			System.out.println(index+","+arrList.get(index));
		}
		
	 }
}
