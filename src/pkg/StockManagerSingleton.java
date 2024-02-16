package pkg;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class StockManagerSingleton {
	private String inventoryFilePath;
	//private MediaProduct[] product;
	private ArrayList<MediaProduct> inventory;
	
	public boolean initializeStock() {
		//Reads the iniHal inventory data from a CSV file located at inventoryFilePath. (Hint:Consider using the split() method for tokenizaHon.)
		//Parses the CSV file to create media product objects and adds them to the inventory.
		//Returns true if the iniHalizaHon is successful, false otherwise (file does not exist, or file empty).
		
		try {
			//Sets the file and count variable.
            File file = new File(inventoryFilePath);
            Scanner scanner = new Scanner(file);
            int count = 0;
            
            // Error testing to ensure information is being passed.
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            } else {
                System.out.println("Inventory file is empty.");
                scanner.close();
                return false;
            }

            //Adds to the count integer to create an array the sized of the file being read.
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                count++;
            }

            scanner.close();
            
            scanner = new Scanner(file);
            
            //Skipping first line.
            if (scanner.hasNextLine()) {
                scanner.nextLine(); 
            }
            
            //product = new MediaProduct[count];
            inventory = new ArrayList<MediaProduct>();
            
            //Adding values to the object.
            for (int i = 0; i < count; i++) {
                String[] parts = scanner.nextLine().split(",");
                
                String type = parts[0];
                String title = parts[1];
                double price = Double.parseDouble(parts[2]);
                int year = Integer.parseInt(parts[3]);
                Genre genre = Genre.valueOf(parts[4].toUpperCase());
                
                switch (type) {
                	case "Vinyl":
                		inventory.add(new VinylRecordProduct(title, price, year, genre));
                		break;
                	case "CD":
                		inventory.add(new CDRecordProduct(title, price, year, genre));
                		break;
                	case "Tape":
                		inventory.add(new TapeRecordProduct(title, price, year, genre));
                		break;
                }

                //product[i] = new MediaProduct(title, price, year, genre);
            }

            scanner.close();

            
            //Print Testing, This can be Removed.
            //for (MediaProduct p : inventory) {
            //    System.out.println(p);
            //}
            return true;
	        
		} catch (Exception e){
			System.out.println(e);
			return false;
		}
		
	}
	
	
	//Sets inventoryFilePath to the filepath provided.
	public void setInventoryFilePath(String inventoryFilePath) {
        this.inventoryFilePath = inventoryFilePath;
    }
	
//	public boolean updateItemPrice(MediaProduct product, double newPrice) {
//		//Updates the price of the given media product to the newPrice.
//		//Returns true if the update is successful, false otherwise
//	}
//
//	public boolean addItem(MediaProduct product) {
//		//Adds a new media product to the inventory.
//		//Returns true if the addiHon is successful, false otherwise.
//	}
//	
//	public boolean removeItem(MediaProduct product) {
//		//Removes the given media product from the inventory.
//		//Returns true if the removal is successful, false otherwise.
//	}
//	
//	public boolean saveStock() {
//		//Saves the updated inventory back to the CSV file located at inventoryFilePath.
//		//Overwrites the existing file with the updated inventory data.
//		//Returns true if the saving is successful, false otherwise (file does not exist, or file empty).
//	}
//	
	public ArrayList<MediaProduct> getMediaProductBelowPrice(int maxPrice) {
		//Gets the media products that are below the given maxPrice.
		//This creates a new ArrayList of media products that is below the maxPrice. Beware of not leaking any informaHon.
		ArrayList<MediaProduct> filteredList = new ArrayList<>();
        for (MediaProduct product : inventory) {
            if (product.price < maxPrice) {
                filteredList.add(new MediaProduct(product));
            }
        }
        return filteredList;
	}
	
	public void printListOfMediaProduct(ArrayList<? extends MediaProduct> inventory) {
		//Prints the given media product list.
        if (inventory.isEmpty()) {
            System.out.println("No products to display.");
        } else {
            for (MediaProduct product : inventory) {
                System.out.println(product.toString());
            }
        }
	}
			
	public ArrayList<VinylRecordProduct> getVinylRecordList() {
	    ArrayList<VinylRecordProduct> vinylRecords = new ArrayList<>();
	    for (MediaProduct product : inventory) {
	        if (product instanceof VinylRecordProduct) {
	            vinylRecords.add((VinylRecordProduct) product);
	        }
	    }
	    return vinylRecords;
	}
	
	public ArrayList<CDRecordProduct> getCDRecordsList() {
	    ArrayList<CDRecordProduct> cdRecords = new ArrayList<>();
	    for (MediaProduct product : inventory) {
	        if (product instanceof CDRecordProduct) {
	            cdRecords.add((CDRecordProduct) product);
	        }
	    }
	    return cdRecords;
	}
	
	public ArrayList<TapeRecordProduct> getTapeRecordList() {
	    ArrayList<TapeRecordProduct> tapeRecords = new ArrayList<>();
	    for (MediaProduct product : inventory) {
	        if (product instanceof TapeRecordProduct) {
	            tapeRecords.add((TapeRecordProduct) product);
	        }
	    }
	    return tapeRecords;
	}
}


