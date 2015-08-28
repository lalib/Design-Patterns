package builder;

/**
 * developed by BURHAN ARAS
 */
public class BuilderMain {

	public static void main(String[] args) {
		ChineseWorker chineseWorker = new ChineseWorker();
		chineseWorker.setBuilder(new IPhoneBuilder());
		chineseWorker.build();
		
		chineseWorker.setBuilder(new SamsungS6Builder());
		chineseWorker.build();
	}
	
	

}
