package adapter;

/**
 * developed by BURHAN ARAS
 */
public class Mp4Player implements VideoPlayer {

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing " + fileName);
	}

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub

	}

}
