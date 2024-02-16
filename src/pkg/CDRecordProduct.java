package pkg;


public class CDRecordProduct extends MediaProduct {
	
	public CDRecordProduct(String type, String title, double price, int year, Genre genre) {
		super(type, title, price, year, genre);
	}
	
	//Copy constructor
	public CDRecordProduct(CDRecordProduct product) {
		super(product);
	}
}
