package abstarctfactory;

/**
 * developed by BURHAN ARAS
 */
public class SamsungFactory implements PhoneFactory {

	@Override
	public Phone produce() {
		Phone phone = new Phone();
		phone.setScreen(new SuperAmoledDisplay());
		phone.setProcessor(new  CortexA5Processor());
		phone.setOperatingSystem(new AndroidOS());
		
		return phone;
	}

}
