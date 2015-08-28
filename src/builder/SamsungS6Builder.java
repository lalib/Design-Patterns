package builder;

/**
 * developed by BURHAN ARAS
 */
public class SamsungS6Builder extends PhoneBuilder {

	@Override
	public void buildTradeMark() {
		phone.setTradeMark("Samsung S6");
	}

	@Override
	public void buildScreen() {
		phone.setScreen("Super Amoled");
	}

	@Override
	public void buildCPU() {
		phone.setCpu("Cortex A5");
	}

	@Override
	public void buildMemory() {
		phone.setMemory("4 GB");
	}

	@Override
	public void buildOS() {
		phone.setOperatingSystem("Android 5");
	}

}
