
public class StringSplit_Poster {

	public static void main (String args[]) {
		String posterPath = "/artwork/panam_english.com/E75JV_148x222_pos.png";
		String[] posterPathSplit = posterPath.split("/");
		System.out.println(posterPathSplit[posterPathSplit.length-1]);
		
	}
}
