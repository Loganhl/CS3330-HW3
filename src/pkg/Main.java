package pkg;


public class Main {

    public static void main(String[] args) {
        StockManagerSingleton stockManager = new StockManagerSingleton();

        stockManager.setInventoryFilePath("src/inventory.csv");

        boolean fileReadStatus = stockManager.initializeStock();

        // General statement to show the program ran.
        if (fileReadStatus) {
            System.out.println("Stock initialization successful.");
        } else {
            System.out.println("Stock initialization failed. Check the inventory file path.");
        }
        
     
    }
}