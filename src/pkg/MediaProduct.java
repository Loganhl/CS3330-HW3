package pkg;


public class MediaProduct {
	
	// Protected Strings
	protected String type;
	protected String title;
    protected double price;
    protected int year;
    protected Genre genre;
    
    public MediaProduct(String type, String title, double price, int year, Genre genre) {
    	this.type = type;
    	this.title = title;
    	this.price = price;
    	this.year = year;
    	this.genre = genre;
    }
    
    // Copy constructor
    public MediaProduct(MediaProduct product) {
    	this.type = product.type;
    	this.title = product.title;
    	this.price = product.price;
    	this.year = product.year;
    	this.genre = product.genre;
    	
    }
    
    public String toString() {
        return "Type: " + type + ", Title: " + title + ", Price: " + price + ", Year: " + year + ", Genre: " + genre;
    }
	
}
