package pkg;


public class Main {

    public static void main(String[] args) {
        StockManagerSingleton stockManager = new StockManagerSingleton();

        stockManager.setInventoryFilePath("src/inventory.csv");

        boolean fileReadStatus = stockManager.initializeStock();

        if (fileReadStatus) {
            System.out.println("Stock initialization successful.");
        } else {
            System.out.println("Stock initialization failed. Check the inventory file path.");
        }
    }
}