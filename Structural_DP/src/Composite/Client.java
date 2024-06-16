package Composite;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MovieContainer SciFiContainer = new MovieContainer();
		
		SciFiContainer.addMovie(new SciFi(1, "Dune(2021)", "22 October 2021", 8.0));
		SciFiContainer.addMovie(new SciFi(2, "Dune(2024)", "1 March 2024", 8.7));
		
		MovieContainer horrorContainer = new MovieContainer();
        horrorContainer.addMovie(new Horror(3,"Scream","15 August 1997",7.4));
        
        MovieContainer container = new MovieContainer();
        
        container.addMovie(SciFiContainer);
        container.addMovie(horrorContainer);
        
        container.showMovieInfo();
	}
}