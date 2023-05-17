import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        ArrayList<Sale> sales = new ArrayList<>();
        // Why a hashmap?
        HashMap<ProductModel, Product> availableProducts = new HashMap<>();
        // (fulfills requirement of at least models 2 of every type
        // (?) Washer has only one model??? Different energyClass, capacity or rpm count as different models?)
        // Maybe replace with manual creation of Model objects

        // Fill availableProducts with every model
        for(ProductModel model : ProductModel.values()) {
            availableProducts.put(model, new Product(30, model));
        }

        System.out.println(availableProducts);

//        for(ProductModel model : GamingConsole.models) {
//            System.out.println(model);
//            System.out.println(availableProducts.get(model).getAvailablePieces());
//        }
        // MENU
        Scanner input = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("\n Inventory App\n");
            System.out.println("1. Available Products");
            System.out.println("2. Orders");
            System.out.println("3. Sales");
            System.out.println("0. Exit");
            System.out.print("Enter Selection: ");

            choice = input.nextInt();
            input.nextLine();

            switch(choice) {
                case 1 -> {
                    System.out.println("\nAVAILABLE PRODUCTS\n");

                }
                case 2 -> {
                    System.out.println("ORDERS");
                }
                case 3 -> {
                    System.out.println("SALES");
                }
                case 0 -> {
                    System.out.println("\nExiting program..");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Invalid Menu Option");
                }
            }
        }
    }
}
