package template;

/**
 * developed by BURHAN ARAS
 */
public abstract class Game {

	public abstract void init();
	public abstract void startPlay();
	public abstract void endPlay();
	
	public void play(){
		init();
		startPlay();
		endPlay();
	}
}
