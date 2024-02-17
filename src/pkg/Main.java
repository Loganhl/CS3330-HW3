package pkg;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        StockManagerSingleton stockManager = new StockManagerSingleton();

        stockManager.setInventoryFilePath("src/inventory.csv");

        boolean fileReadStatus = stockManager.initializeStock();

        // General statement to show the program ran.
        if (fileReadStatus) {
            System.out.println("Stock initialization successful.");
            
            //print vinyls
            ArrayList<VinylRecordProduct> vinylRecordsList = stockManager.getVinylRecordList();
            System.out.println("\nVinyl Records: ");
            stockManager.printListOfMediaProduct(vinylRecordsList);
            
            //print cds
            ArrayList<CDRecordProduct> cdRecordsList = stockManager.getCDRecordsList();
            System.out.println("\nCD Records: ");
            stockManager.printListOfMediaProduct(cdRecordsList);
            
            //print tapes
            ArrayList<TapeRecordProduct> tapeRecordsList = stockManager.getTapeRecordList();
            System.out.println("\nTape Records: ");
            stockManager.printListOfMediaProduct(tapeRecordsList);

            //create new tape
            TapeRecordProduct tape = new TapeRecordProduct("By The Way", 18.99, 2002, Genre.ROCK);
            
            //add tape to inventory
            stockManager.addItem(tape);
            
            //print tapes to show new item
            ArrayList<TapeRecordProduct> updatedTapeRecordsList = stockManager.getTapeRecordList();
            System.out.println("\nTape Records: ");
            stockManager.printListOfMediaProduct(updatedTapeRecordsList);
            
            //update tape price
            stockManager.updateItemPrice(tape, 23.99);
            
            //print tapes to show updated price
            ArrayList<TapeRecordProduct> updatedTapeRecordsList1 = stockManager.getTapeRecordList();
            System.out.println("\nTape Records: ");
            stockManager.printListOfMediaProduct(updatedTapeRecordsList1);
            
            //remove the tape
            stockManager.removeItem(tape);
            
            //print the tapes one more time to show removed tape
            ArrayList<TapeRecordProduct> updatedTapeRecordsList2 = stockManager.getTapeRecordList();
            System.out.println("\nTape Records: ");
            stockManager.printListOfMediaProduct(updatedTapeRecordsList2);
            
            //printing the list that is below max price
            int maxprice = 15;
            ArrayList<MediaProduct> belowPriceList = stockManager.getMediaProductBelowPrice(maxprice);
            System.out.println("\nMedia Products Below Price " + maxprice + ":");
            stockManager.printListOfMediaProduct(belowPriceList);
            
            stockManager.saveStock();
            
        } else {
            System.out.println("Stock initialization failed. Check the inventory file path.");
        }
        
    }
}