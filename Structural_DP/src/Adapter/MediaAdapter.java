package Adapter;

public class MediaAdapter implements MediaPlayer{
	
	AdvanceMediaPlayer advanceMusicPlayer;
	
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advanceMusicPlayer = new VlcPlayer();
		}
		else if(audioType.equalsIgnoreCase("mp4")) {
			advanceMusicPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if(audioType.equalsIgnoreCase("vlc")) {
			advanceMusicPlayer.playVlc(fileName);
		}
		else if(audioType.equalsIgnoreCase("mp4")) {
			advanceMusicPlayer.playMp4(fileName);
		}
	}

}
