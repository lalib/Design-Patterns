package builder;

/**
 * developed by BURHAN ARAS
 */
public class Phone {

	private String tradeMark;
	private String screen;
	private String cpu;
	private String operatingSystem;
	private String memory;
	public String getTradeMark() {
		return tradeMark;
	}
	public void setTradeMark(String tradeMark) {
		this.tradeMark = tradeMark;
	}
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}


	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	@Override
	public String toString() {
		return "Phone [tradeMark=" + tradeMark + ", screen=" + screen
				+ ", cpu=" + cpu + ", operatingSystem=" + operatingSystem
				+ ", memory=" + memory + "]";
	}

	
	
	
}
