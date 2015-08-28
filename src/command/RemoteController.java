package command;


public class RemoteController {

	private Television tv = null;
	
	public RemoteController(Television tv) {
		this.tv = tv;
	}

	public void click(Keys key) {
		switch (key) {
		case ON:
			new OpenCommand(tv).execute();
			break;
		case OFF:
			new CloseCommand(tv).execute();
			break;
		default:
			System.out.println("This command is not implemented yet.");
		}
	}
	
}
