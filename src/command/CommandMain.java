package command;

public class CommandMain {

	public static void main(String[] args) {
		Television tv = new Television();
		RemoteController remote = new RemoteController(tv);
		
		remote.click(Keys.ON);
		remote.click(Keys.OFF);
	}

}
