package pkg;


public class MediaProduct {
	
	// Protected Strings
	protected String title;
    protected double price;
    protected int year;
    protected Genre genre;
    
    public MediaProduct(String title, double price, int year, Genre genre) {
    	this.title = title;
    	this.price = price;
    	this.year = year;
    	this.genre = genre;
    }
    
    // Copy constructor
    public MediaProduct(MediaProduct product) {
    	this.title = product.title;
    	this.price = product.price;
    	this.year = product.year;
    	this.genre = product.genre;
    	
    }
    
    public String toString() {
        return "Title: " + title + ", Price: " + price + ", Year: " + year + ", Genre: " + genre;
    }
	
}
