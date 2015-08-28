package builder;

/**
 * developed by BURHAN ARAS
 */
public abstract class PhoneBuilder {
	
	protected Phone phone;
	
	public void createNewPhone(){
		setPhone(new Phone());
	}
	
	public abstract void buildTradeMark();
	public abstract void buildScreen();
	public abstract void buildCPU();
	public abstract void buildMemory();
	public abstract void buildOS();

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

}
