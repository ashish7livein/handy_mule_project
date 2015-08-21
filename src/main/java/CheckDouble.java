
public class CheckDouble {

	public static void main (String args[]) {
		long maxVersionCount = 3;
		double latestversion = 38.9;
		double deletionVersionLimit = latestversion -  ((double)maxVersionCount/10);
		System.out.println(deletionVersionLimit);
		System.out.println((double)Math.round(deletionVersionLimit*10)/10);
		deletionVersionLimit = (double)Math.round(deletionVersionLimit*10)/10;
		long totalNumberOfVersions = 300;
		double tempVersion = (double)totalNumberOfVersions/10;
		double lastVersion = latestversion-tempVersion;
		System.out.println("tempVersion:\t"+tempVersion);
		System.out.println("lastVersion:\t"+(double)Math.round(lastVersion*10)/10);
		
		for (double index=deletionVersionLimit; index>=lastVersion;index=index-0.5) {
			System.out.println((double)Math.round(index*10)/10+"\t"+(double)Math.round((index-0.5)*10)/10);
		}
		
		double x=38.6;
		System.out.println((double)Math.round((35.2+0.1)*10)/10);
				
		System.out.println(Integer.MAX_VALUE);
		
	}
}
