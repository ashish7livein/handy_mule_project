import org.apache.commons.io.FilenameUtils;



public class FilenameUtilsTest {

	public static void main (String args[]) {
		String posterPath = "/artwork/panamenglish.com/E75JV_162x302_pos.png";
		System.out.println(FilenameUtils.getBaseName(posterPath));
		System.out.println(FilenameUtils.getName(posterPath));
	}
}
