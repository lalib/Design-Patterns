package adapter;

/**
 * developed by BURHAN ARAS
 */
public class AudioPlayer implements MediaPlayer {

	private static final String MP3 = ".mp3";
	
	MediaAdapter mediaAdapter = null;

	@Override
	public void play(String fileName) {

		if(fileName.endsWith(MP3)){
			System.out.println("Playing "+fileName);
		}else{
			mediaAdapter = new MediaAdapter();
			mediaAdapter.play(fileName);
		}
	}

}
