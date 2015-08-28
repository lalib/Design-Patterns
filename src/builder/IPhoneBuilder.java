package builder;

/**
 * developed by BURHAN ARAS
 */
public class IPhoneBuilder extends PhoneBuilder {

	@Override
	public void buildTradeMark() {
		phone.setTradeMark("iPhone 6");
	}

	@Override
	public void buildScreen() {
		phone.setScreen("Retine Display");
	}

	@Override
	public void buildCPU() {
		phone.setCpu("A4");
	}

	@Override
	public void buildMemory() {
		phone.setMemory("2 GB");
	}

	@Override
	public void buildOS() {
		phone.setOperatingSystem("IOS 6");
	}

}
