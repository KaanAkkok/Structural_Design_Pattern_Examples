package Proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Video video1 = new Video("Cat Video", "Youtube");
		Video video2 = new Video("Dog Video", "Tiktok");
		Video video3 = new Video("Car Video", "Instagram");
		Video video4 = new Video("Girl Video");
		Video video5 = new Video("Game Video");
		
		ProxyVideoDownloader videoDownloader = new ProxyVideoDownloader();
		
		videoDownloader.downloadVideo(video1);
		videoDownloader.downloadVideo(video2);
		videoDownloader.downloadVideo(video3);
		videoDownloader.downloadVideo(video4);
		videoDownloader.downloadVideo(video5);
	}

}
