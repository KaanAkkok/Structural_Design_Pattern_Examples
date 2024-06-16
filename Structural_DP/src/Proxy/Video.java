package Proxy;

public class Video {
	
	private String videoName;
	private String address;
	
	public Video(String videoName, String address) {
		this.videoName = videoName;
		this.address = address;
	}
	
	public Video(String videoName) {
		this.videoName = videoName;
	}

	public String getVideoName() {
		return videoName;
	}

	public String getAddress() {
		return address;
	}
}
