package pkg;

public class TapeRecordProduct extends MediaProduct{

	public TapeRecordProduct(String type, String title, double price, int year, Genre genre) {
		super(type, title, price, year, genre);
	}
	
	//Copy constructor
	public TapeRecordProduct(TapeRecordProduct product) {
		super(product);
	}

}
