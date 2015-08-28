package builder;

/**
 * developed by BURHAN ARAS
 */
public class ChineseWorker {

	private PhoneBuilder builder;

	public void build(){
		builder.createNewPhone();
		builder.buildTradeMark();
		builder.buildCPU();
		builder.buildMemory();
		builder.buildOS();
		builder.buildScreen();
		System.out.println("Builded new "+builder.getPhone().toString());
		
	}
	public PhoneBuilder getBuilder() {
		return builder;
	}

	public void setBuilder(PhoneBuilder builder) {
		this.builder = builder;
	}
}
