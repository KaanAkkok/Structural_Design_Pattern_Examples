package Proxy;

import java.util.LinkedList;

public class ProxyVideoDownloader implements VideoDownloader {

	private LinkedList<Video> videoCache = new LinkedList<>();
	private VideoDownloader downloader = new RealVideoDownloader();
	
	@Override
	public void downloadVideo(Video video) {
		// TODO Auto-generated method stub
		if(videoCache.contains(video)) {
			System.out.println("---FROM CACHE---");
			downloader.downloadVideo(video);
			System.out.println("=======================================");
		}
		else {
			videoCache.add(video);
			System.out.println("The " + video.getVideoName() + " adding to cache.");
			System.out.println("=======================================");
			downloadVideo(video);
		}
	}

}
