package decorator;

/**
 * developed by BURHAN ARAS
 */
public class TextField implements Widget {

	private String text;

	public TextField(String text) {
		this.text = text;
	}

	@Override
	public void draw() {
		System.out.println("new TextBox : " + text);

	}

}
