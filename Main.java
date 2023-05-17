import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> availableProducts = new ArrayList<>();
        initAvailableProducts(availableProducts);
        ArrayList<Order> orders = new ArrayList<>();
        ArrayList<Sale> sales = new ArrayList<>();
        // MENU
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\n Inventory App\n");
            System.out.println("1. Available Products");
            System.out.println("2. Orders");
            System.out.println("3. Sales");
            System.out.println("0. Exit");
            System.out.print("Enter Selection: ");

            int choice = input.nextInt();
            input.nextLine();

            switch(choice) {
                case 1 -> {
                    System.out.println("\nAVAILABLE PRODUCTS\n");
                    showAvailableProducts(availableProducts);
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
                default -> System.out.println("Invalid Menu Option");
            }

        }
    }
    public static void initAvailableProducts(ArrayList<Product> availableProducts) {
        // Creates availableProducts ArrayList & 2 models for each type, adds them to ArrayList
        // Create & add Tvs
        Tv lcd_tv = new Tv(32, Tv.TvModels.LCD, "a321", 2017, "LG", 299.99,
                15, "42'", "1440p", Tv.TvPorts.HDMI);
        Tv led_tv = new Tv(12, Tv.TvModels.LED, "a321", 2015, "LG", 199.99,
                10, "42'", "1080p", Tv.TvPorts.DVI);
        availableProducts.add(lcd_tv);
        availableProducts.add(led_tv);
        // Create & add VideoPlayers
        VideoPlayer bluray = new VideoPlayer(5, VideoPlayer.VideoPlayerModels.BLUERAY, "b32",
                2014, "Sony", 49.99, 50, "1080p", VideoPlayer.PlaybackFormat.BDR);
        VideoPlayer dvd = new VideoPlayer(5, VideoPlayer.VideoPlayerModels.DVD, "b32",
                2014, "Sony", 49.99, 50, "1080p", VideoPlayer.PlaybackFormat.DVDRW);
        availableProducts.add(bluray);
        availableProducts.add(dvd);
        // Create & add Cameras
        Camera dslr = new Camera(3, Camera.CameraModels.DSLR, "c1", 2020, "Sony",
                699, 5, "20mp", true, true, "10'");
        Camera action = new Camera(6, Camera.CameraModels.ACTION, "c321", 2019, "GoPro",
                299, 15, "5mp", true, true, "10'");
        availableProducts.add(dslr);
        availableProducts.add(action);
        // Create & add Gaming Consoles
        GamingConsole ps4 = new GamingConsole(5, GamingConsole.GamingConsoleModels.PS4, "d64",
                2012, "Sony", 199, 40, "Intel", "NVIDIA",
                "Surround", "1TB");
        GamingConsole ps5 = new GamingConsole(2, GamingConsole.GamingConsoleModels.PS5, "d68",
                2020, "Sony", 699, 5, "Intel", "NVIDIA",
                "Surround", "3TB");
        availableProducts.add(ps4);
        availableProducts.add(ps5);
        // Create & add fridges
        Fridge twodoor = new Fridge(10, Fridge.FridgeModels.TWODOOR, "e22", 2019,
                "Bosch", 599, 10, "A", "10kg", "5kg");
        Fridge onedoor = new Fridge(10, Fridge.FridgeModels.ONEDOOR, "e12", 2019,
                "Bosch", 499, 10, "A", "10kg", "5kg");
        availableProducts.add(twodoor);
        availableProducts.add(onedoor);
        // Create & add Washers
        Washer washer = new Washer(14, Washer.WasherModels.STANDARD, "f42", 2019,
                "LG", 199, 10, "A", "10kg", "150");
        Washer washer2 = new Washer(4, Washer.WasherModels.STANDARD, "f99", 2021,
                "LG", 399, 10, "A", "30kg", "300");
        availableProducts.add(washer);
        availableProducts.add(washer2);
    }


    public static void showAvailableProducts(ArrayList<Product> availableProducts) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Image & Sound");
        System.out.println("2. Gaming");
        System.out.println("3. House Appliances");
        System.out.println("Select category: ");
        int category = scanner.nextInt();
        System.out.println(availableProducts + "\n\n"); // for testing

        // Print picked category's types
        // We can do that by removing items that don't belong to the category picked
        // and then printing every models type
        // Problem: we have 2 models for each type so types will be printed twice)
        // Solution: Create a type list
        // Must add category field to every model

        // REMOVE IRRELEVANT CATEGORIES
        for (Iterator<Product> iter = availableProducts.iterator(); iter.hasNext();) {
            Product product = iter.next();
            if (product.getCategory() != category) {
                iter.remove();
            }
        }

        System.out.println(availableProducts + "\n\n"); // for testing

//         Create a new arrayList of types
//         Loop through new availableProducts, if type not in typeList add product type to list
//         Print types
//         Must add type field & getType to every model
//        ArrayList<String> types = new ArrayList<>();
//        for (Product product : availableProducts) {
//            if (product.getType() != )
//        }

        System.out.print("Select type: ");
        int type = scanner.nextInt();

    }



}
