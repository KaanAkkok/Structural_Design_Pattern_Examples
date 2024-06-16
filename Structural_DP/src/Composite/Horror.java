package Composite;

public class Horror implements Movie {
	
	private int id;
    private String name;
    private String releaseDate;
    private double imdb;

    public Horror(int id, String name, String releaseDate, double imdb) {
        this.id = id;
        this.name = name;
        this.imdb = imdb;
        this.releaseDate = releaseDate;
    }
    
	@Override
	public void showMovieInfo() {
		// TODO Auto-generated method stub
		System.out.println("Name of the Movie : "+name);
        System.out.println("Date of the Release : "+releaseDate);
        System.out.println("IMDB Score : "+imdb);
        System.out.println("==================================");
	}
}