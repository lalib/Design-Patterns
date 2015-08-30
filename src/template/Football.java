package template;

/**
 * developed by BURHAN ARAS
 */
public class Football extends Game {

	@Override
	public void init() {
		System.out.println("Football game initialized.");
	}

	@Override
	public void startPlay() {
		System.out.println("Football game started.");

	}

	@Override
	public void endPlay() {
		System.out.println("Football game finished.");

	}

}
