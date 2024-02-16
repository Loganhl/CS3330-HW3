package pkg;

public class VinylRecordProduct extends MediaProduct {

	public VinylRecordProduct(String type, String title, double price, int year, Genre genre) {
		super(type, title, price, year, genre);
	}
	
	//Copy constructor
	public VinylRecordProduct(VinylRecordProduct product) {
		super(product);
	}
}
