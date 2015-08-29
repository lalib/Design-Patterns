package decorator;

/**
 * developed by BURHAN ARAS
 */
public abstract class Decorator implements Widget {
	
	private Widget widget;

	public Decorator(Widget widget) {
		this.widget = widget;
	}
	
	@Override
	public void draw(){
		widget.draw();
	}

}
