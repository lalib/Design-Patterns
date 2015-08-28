package adapter;

/**
 * developed by BURHAN ARAS
 */
public class VlcPlayer implements VideoPlayer {

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing " + fileName);
	}

}
