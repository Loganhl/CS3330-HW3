package pkg;

public class StockManagerSingleton {
	private String inventoryFilePath;
	
	public boolean initializeStock() {
		//Reads the iniHal inventory data from a CSV file located at inventoryFilePath. (Hint:Consider using the split() method for tokenizaHon.)
		//Parses the CSV file to create media product objects and adds them to the inventory.
		//Returns true if the iniHalizaHon is successful, false otherwise (file does not exist, or file empty).
	}
	
	public boolean updateItemPrice(MediaProduct product, double newPrice) {
		//Updates the price of the given media product to the newPrice.
		//Returns true if the update is successful, false otherwise
	}

	public boolean addItem(MediaProduct product) {
		//Adds a new media product to the inventory.
		//Returns true if the addiHon is successful, false otherwise.
	}
	
	public boolean removeItem(MediaProduct product) {
		//Removes the given media product from the inventory.
		//Returns true if the removal is successful, false otherwise.
	}
	
	public boolean saveStock() {
		//Saves the updated inventory back to the CSV file located at inventoryFilePath.
		//Overwrites the existing file with the updated inventory data.
		//Returns true if the saving is successful, false otherwise (file does not exist, or file empty).
	}
	
	public ArrayList<MediaProduct> getMediaProductBelowPrice(int maxPrice) {
		//Gets the media products that are below the given maxPrice.
		//This creates a new ArrayList of media products that is below the maxPrice. Beware of not leaking any informaHon.
	}
	
	public void printListOfMediaProduct(ArrayList<MediaProduct>productList) {
		//Prints the given media product list.
	}
			
	public ArrayList<VinylRecordProduct> getVinylRecordList(ArrayList<MediaProduct> productList) {
		//Gets the media products as an ArrayList.
		//This creates a new ArrayList of VinylRecordProduct that filters the vinyl records and returns the ArrayList. Beware of not leaking any informaHon.
	}
	
	public ArrayList<CDRecordProduct> getCDRecordsList(ArrayList<MediaProduct> productList) {
		//Gets the media products as an ArrayList.
		//This creates a new ArrayList of CDRecordProduct that filters the CD records and returns the ArrayList. Beware of not leaking any informaHon.
	}
	
	public ArrayList<TapeRecordProduct> getTapeRecordList(ArrayList<MediaProduct> productList) {
		//Gets the media products as an ArrayList.
		//This creates a new ArrayList of TapeRecordProduct that filters the tape records and returns the ArrayList. Beware of not leaking any informaHon.
	}
}
