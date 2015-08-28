package abstarctfactory;

/**
 * developed by BURHAN ARAS
 */
public class IPhoneFactory implements PhoneFactory {

	@Override
	public Phone produce() {
		Phone phone = new Phone();
		phone.setScreen(new RetinaDisplay());
		phone.setProcessor(new A4Processor());
		phone.setOperatingSystem(new IOS6());
		
		return phone;
	}

}
