package adapter;

/**
 * developed by BURHAN ARAS
 */
public class MediaAdapter implements MediaPlayer {

	private static final String MP4 = ".mp4";
	private static final String VLC = ".vlc";
	VideoPlayer videoPlayer = null;

	@Override
	public void play(String fileName) {
		if (fileName.endsWith(MP4)) {
			videoPlayer = new Mp4Player();
			videoPlayer.playMp4(fileName);

		} else if (fileName.endsWith(VLC)) {
			videoPlayer = new VlcPlayer();
			videoPlayer.playVlc(fileName);

		} else {
			System.out.println("This media format is not supported.");
		}

	}

}
