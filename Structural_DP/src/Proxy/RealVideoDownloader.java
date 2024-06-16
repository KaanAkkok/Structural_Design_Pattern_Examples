package Proxy;

public class RealVideoDownloader implements VideoDownloader {
	
	@Override
	public void downloadVideo(Video video) {
		// TODO Auto-generated method stub
		if(video.getAddress() == null) {
			System.out.println("Downloading the " + video.getVideoName() + " ...");
			System.out.println("Retrieving Video Metadata");
		}
		else {
			System.out.println("Connecting to https://" + video.getAddress() + ".com/ ...");
			System.out.println("Downloading the " + video.getVideoName() + " ...");
			System.out.println("Retrieving Video Metadata");
		}
	}
}