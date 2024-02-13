package pkg;


public class MediaProject {
	
	// Enumerator for the Genres
	public enum Genre {
		ROCK,POP,JAZZ,CLASSICAL,HIP_HOP,ELECTRONIC,CHILDREN
	}
	
	// Protected Strings
	protected String title;
    protected double price;
    protected int year;
    protected Genre genre;
    
    
    public MediaProject(String title, double price, int year, Genre genre) {
    	this.title = title;
    	this.price = price;
    	this.year = year;
    	this.genre = genre;
    }
    
    
    // Below are the get and set methods. To use these in the other file us .setTitle("Example Title");
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
	
}
