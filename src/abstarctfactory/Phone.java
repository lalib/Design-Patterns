package abstarctfactory;

/**
 * developed by BURHAN ARAS
 */
public class Phone {

	private Display screen;
	private CPU processor;
	private OperatingSystem operatingSystem;
	public Display getScreen() {
		return screen;
	}
	public void setScreen(Display screen) {
		this.screen = screen;
	}
	public CPU getProcessor() {
		return processor;
	}
	public void setProcessor(CPU processor) {
		this.processor = processor;
	}
	public OperatingSystem getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(OperatingSystem operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	@Override
	public String toString() {
		return "Phone [screen=" + screen + ", processor=" + processor
				+ ", operatingSystem=" + operatingSystem + "]";
	}
	
	
	
}
