import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> availableProducts = new ArrayList<>();
        initAvailableProducts(availableProducts);
        ArrayList<Sale> salesList = new ArrayList<>();
        ArrayList<Order> ordersList = new ArrayList<>();

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
                    showAvailableProducts(availableProducts, salesList, ordersList);
                }
                case 2 -> {
                    showOrders(salesList, ordersList);
                }
                case 3 -> {
                    showSales(salesList);
                }
                case 0 -> {
                    System.out.println("\nExiting program..");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Menu Option. Please try again.");
            }
        }
    }

    public static void showAvailableProducts(ArrayList<Product> availableProducts, ArrayList<Sale> saleList, ArrayList<Order> orderList) {
        System.out.println("== Available Products ==");
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        for (Product.TypesOf category : Product.TypesOf.values()) {
            System.out.print(option++ + ". ");
            System.out.println(category);
        }
        System.out.print("\nSelect category: ");
        int category = scanner.nextInt();
        switch (category) {
            case 1 -> { // Image Sound Category

                // Print options and get option
                option = 1;
                for (ImageSound.TypesOf types : ImageSound.TypesOf.values()) {
                    System.out.print(option++ + ". ");
                    System.out.println(types);
                }
                System.out.print("\nSelect type: ");
                int type = scanner.nextInt();
                //

                switch  (type) {
                    case 1 -> { // Tv Type
                        option = 1;
                        for (Tv.TypesOf models : Tv.TypesOf.values()) {
                            System.out.print(option++ + ". ");
                            System.out.println(models);
                        }
                        System.out.print("\nSelect model: ");
                        int model = scanner.nextInt();

                        switch (model) {
                            case 1 -> { // LCD Model
                                for(Product product : availableProducts) {
                                    if( (product instanceof Tv) && ((Tv)product).getModel() == Tv.TypesOf.LCD) {
                                        System.out.println(product);
                                        saleOrOrder(product, saleList, orderList);
                                    }
                                }
                            }
                            case 2 -> { // LED Model
                                for(Product product : availableProducts) {
                                    if( (product instanceof Tv) && ((Tv)product).getModel() == Tv.TypesOf.LED) {
                                        System.out.println(product);
                                        saleOrOrder(product, saleList, orderList);
                                    }
                                }
                            }
                            case 3 -> { // PLASMA Model
                                for(Product product : availableProducts) {
                                    if( (product instanceof Tv) && ((Tv)product).getModel() == Tv.TypesOf.PLASMA) {
                                        System.out.println(product);
                                        saleOrOrder(product, saleList, orderList);
                                    }
                                }
                            }
                        }

                    }
                    case 2 -> { // VideoPlayer Type
                        option = 1;
                        for (VideoPlayer.TypesOf models : VideoPlayer.TypesOf.values()) {
                            System.out.print(option++ + ". ");
                            System.out.println(models);
                        }
                        System.out.print("\nSelect model: ");
                        int model = scanner.nextInt();

                        switch(model) {
                            case 1 -> { // BLURAY Model
                                for(Product product : availableProducts) {
                                    if( (product instanceof VideoPlayer) && ((VideoPlayer)product).getModel() == VideoPlayer.TypesOf.BLURAY) {
                                        System.out.println(product);
                                        saleOrOrder(product, saleList, orderList);
                                    }
                                }
                            }
                            case 2 -> { // DVD Model
                                for(Product product : availableProducts) {
                                    if( (product instanceof VideoPlayer) && ((VideoPlayer)product).getModel() == VideoPlayer.TypesOf.DVD) {
                                        System.out.println(product);
                                        saleOrOrder(product, saleList, orderList);
                                    }
                                }
                            }
                        }
                    }

                    case 3 -> { // Camera Type
                        option = 1;
                        for (Camera.TypesOf models : Camera.TypesOf.values()) {
                            System.out.print(option++ + ". ");
                            System.out.println(models);
                        }
                        System.out.print("\nSelect model: ");
                        int model = scanner.nextInt();

                        switch (model) {

                            case 1 -> { // Compact Model
                                for (Product product : availableProducts) {
                                    if ((product instanceof Camera) && ((Camera) product).getModel() == Camera.TypesOf.COMPACT) {
                                        System.out.println(product);
                                        saleOrOrder(product, saleList, orderList);
                                    }
                                }
                            }
                            case 2 -> { // DSLR Model
                                for (Product product : availableProducts) {
                                    if ((product instanceof Camera) && ((Camera) product).getModel() == Camera.TypesOf.DSLR) {
                                        System.out.println(product);
                                        saleOrOrder(product, saleList, orderList);
                                    }
                                }
                            }
                            case 3 -> { // Action Model
                                for (Product product : availableProducts) {
                                    if ((product instanceof Camera) && ((Camera) product).getModel() == Camera.TypesOf.ACTION) {
                                        System.out.println(product);
                                        saleOrOrder(product, saleList, orderList);
                                    }
                                }
                            }
                        }
                    }
                }

            }

            case 2 -> { // Gaming Category
                option = 1;
                for (GamingConsole.TypesOf models : GamingConsole.TypesOf.values()) {
                    System.out.print(option++ + ". ");
                    System.out.println(models);
                }
                System.out.print("\nSelect model: ");
                int model = scanner.nextInt();
                switch (model) {
                    case 1 -> { // PS4 Model
                        for (Product product : availableProducts) {
                            if ((product instanceof GamingConsole) && ((GamingConsole) product).getModel() == GamingConsole.TypesOf.PS4) {
                                System.out.println(product);
                                saleOrOrder(product, saleList, orderList);
                            }
                        }
                    }
                    case 2 -> { // PS5 Model
                        for (Product product : availableProducts) {
                            if ((product instanceof GamingConsole) && ((GamingConsole) product).getModel() == GamingConsole.TypesOf.PS5) {
                                System.out.println(product);
                                saleOrOrder(product, saleList, orderList);
                            }
                        }
                    }
                    case 3 -> { // XBOXSERIESX Model
                        for (Product product : availableProducts) {
                            if ((product instanceof GamingConsole) && ((GamingConsole) product).getModel() == GamingConsole.TypesOf.XBOXSERIESX) {
                                System.out.println(product);
                                saleOrOrder(product, saleList, orderList);
                            }
                        }
                    }

                }
            }

            case 3 -> { // Home Appliances Category
                option = 1;
                for (HomeAppliance.TypesOf types : HomeAppliance.TypesOf.values()) {
                    System.out.print(option++ + ". ");
                    System.out.println(types);
                }
                System.out.print("\nSelect type: ");
                int type = scanner.nextInt();

                switch(type) {
                    case 1 -> { // Fridge Type
                        option = 1;
                        for (HomeAppliance.TypesOf models : HomeAppliance.TypesOf.values()) {
                            System.out.print(option++ + ". ");
                            System.out.println(models);
                        }
                        System.out.print("\nSelect model: ");
                        int model = scanner.nextInt();
                        switch(model) {
                            case 1 -> { // 1 door model
                                for (Product product : availableProducts) {
                                    if ((product instanceof Fridge) && ((Fridge) product).getModel() == Fridge.TypesOf.ONEDOOR) {
                                        System.out.println(product);
                                        saleOrOrder(product, saleList, orderList);
                                    }
                                }
                            }
                            case 2 -> { // 2 door model
                                for (Product product : availableProducts) {
                                    if ((product instanceof Fridge) && ((Fridge) product).getModel() == Fridge.TypesOf.TWODOOR) {
                                        System.out.println(product);
                                        saleOrOrder(product, saleList, orderList);
                                    }
                                }
                            }
                        }
                    }
                    case 2 -> { // Washer type
                        for (Product product : availableProducts) {
                            if ((product instanceof Washer) && ((Washer) product).getModel() == Washer.TypesOf.STANDARD) {
                                System.out.println(product);
                                saleOrOrder(product, saleList, orderList);
                            }
                        }
                    }
                }
            }
            default -> System.out.println("\nInvalid option. Please try again.");
        }
    }

    public static void saleOrOrder(Product product, ArrayList<Sale> saleList, ArrayList<Order> orderList) {
        // Check if a product is available
        // If product = available -> ask to sell -> If 'yes' call newSale
        // If product = unavailable -> ask to order -> If 'yes' call newOrder
        Scanner scanner = new Scanner(System.in);
        if(product.getAvailablePieces() > 0) {
            System.out.println("\n1. Yes");
            System.out.println("2. No");
            System.out.print("Do you want to purchase the product? ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                newSale(product,saleList);
            }
        }
        else {
            System.out.println("\nProduct out of stock");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Do you want to order the product? ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                newOrder(product, orderList);
            }
        }
    }

    public static void newSale(Product product, ArrayList<Sale> saleList) {
        // Get the information needed for a new sale
        // Create a new sale
        // Add it to salesList
        // Update availablePieces of product
        Scanner input = new Scanner(System.in);

        System.out.print("Full name: ");
        String fullName = input.nextLine();
        System.out.print("Phone: ");
        int phone = input.nextInt();
        //
        LocalDate date = LocalDate.now();
        System.out.println("Sale date: " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        double price = product.getPrice();
        System.out.println("Price: " + price);
        double discount = product.discount;
        System.out.println("Discount: " + discount + "%");
        double finalCost = (price - (discount*0.01*price));
        System.out.printf("%s%.2f%s%n", "Final cost: ", finalCost, "EUR");

        Sale sale = new Sale(product, fullName, phone, date, finalCost); // create sale
        saleList.add(sale); // add sale to salesList
        product.setAvailablePieces(product.getAvailablePieces() - 1); // update available pieces
        System.out.println("Sale complete!");

    }
    public static void newOrder(Product product, ArrayList<Order> orderList) {
        // Get the information needed for a new order
        // Create a new order
        // Add it to ordersList
        Scanner input = new Scanner(System.in);

        System.out.print("Full name: ");
        String fullName = input.nextLine();
        System.out.print("Phone: ");
        int phone = input.nextInt();
        LocalDate currentDate = LocalDate.now();
        System.out.println("Order date: " + currentDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        double price = product.getPrice();
        System.out.println("Price: " + price);
        double discount = product.discount;
        System.out.println("Discount: " + discount + "%");
        double finalCost = (price - (discount*0.01*price));
        System.out.printf("%s%.2f%s%n", "Final cost: ", finalCost, "EUR");

        // Get order arrival date
        System.out.print("Estimated Order Arrival Date (dd-mm-yyyy): ");
        input.nextLine(); // Clear input buffer
        String inputArrivalDate = input.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate orderArrivalDate = LocalDate.parse(inputArrivalDate, formatter);
        System.out.println("Entered arrival date: " + orderArrivalDate.format(formatter));

        while (orderArrivalDate.isBefore((LocalDate.now()))) {
            System.out.print("Invalid date. Please enter a future date (dd-mm-yyyy): ");
            inputArrivalDate = input.nextLine();
            orderArrivalDate = LocalDate.parse(inputArrivalDate, formatter);
            System.out.println("Entered arrival date: " + orderArrivalDate);
        }

        boolean orderExecuted = false;

        // create order
        Order order = new Order(product, fullName, phone, currentDate, finalCost, orderArrivalDate, orderExecuted);
        orderList.add(order); // add order to orderList
        System.out.println("Order submitted!");
    }

    public static void showOrders(ArrayList<Sale> salesList, ArrayList<Order> ordersList) {
        // Shows order list
        // User can select an order to view more info
        // If an order is not executed user can execute order and create sale
        System.out.println("== Orders ==");
        if (ordersList.isEmpty()) {
            System.out.println("No orders.");
            return;
        }
        for (Order order : ordersList) {
            System.out.print(order.getId());
            System.out.print(". " + order.getFullName() + "\n");
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Select order: ");
        int selectedOrder = input.nextInt();
        for (Order order : ordersList) {
            if(order.getId() == selectedOrder) {
                System.out.println(order);
                if (!order.isOrderExecuted()) { // If order is not executed ask to execute & create sale
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    System.out.print("Set order to arrived and create sale? ");
                    int choice = input.nextInt();
                    if(choice == 1) {
                        order.setOrderExecuted(true);
                        Sale sale = new Sale(order.getProduct(), order.getFullName(), order.getPhone(),order.getDate(),order.getFinalCost());
                        salesList.add(sale);
                        System.out.println("\nOrder status updated.\n");
                    }
                }
            }
        }
    }
    public static void showSales(ArrayList<Sale> salesList) {
        System.out.println("== Sales ==");
        if (salesList.isEmpty()) {
            System.out.println("No sales.");
            return;
        }
        for (Sale sale : salesList) {
            System.out.println();
            System.out.println(sale);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press Enter to continue");
        scanner.nextLine();
    }

    public static void initAvailableProducts(ArrayList<Product> availableProducts) {
        // Creates availableProducts ArrayList & 2 models for each type, adds them to ArrayList
        // Create & add Tvs
        Tv lcd_tv = new Tv(0, Tv.TypesOf.LCD, "a321", 2017, "LG", 299.99,
                15.0, "42'", "1440p", Tv.TvPorts.HDMI);
        Tv led_tv = new Tv(12, Tv.TypesOf.LED, "a341", 2015, "LG", 199.99,
                10, "42'", "1080p", Tv.TvPorts.DVI);
        Tv plasma_tv = new Tv(1, Tv.TypesOf.LED, "a325", 2015, "LG", 599.99,
                10, "42'", "1080p", Tv.TvPorts.DVI);
        availableProducts.add(lcd_tv);
        availableProducts.add(led_tv);
        availableProducts.add(plasma_tv);
        // Create & add VideoPlayers
        VideoPlayer bluray = new VideoPlayer(5, VideoPlayer.TypesOf.BLURAY, "b32",
                2014, "Sony", 49.99, 50, "1080p", VideoPlayer.PlaybackFormat.BDR);
        VideoPlayer dvd = new VideoPlayer(5, VideoPlayer.TypesOf.DVD, "b32",
                2014, "Sony", 49.99, 50, "1080p", VideoPlayer.PlaybackFormat.DVDRW);
        availableProducts.add(bluray);
        availableProducts.add(dvd);
        // Create & add Cameras
        Camera dslr = new Camera(0, Camera.TypesOf.DSLR, "c1", 2020, "Sony",
                699, 5, "20mp", true, true, "10'");
        Camera action = new Camera(6, Camera.TypesOf.ACTION, "c321", 2019, "GoPro",
                299, 15, "5mp", true, true, "10'");
        Camera compact = new Camera(4, Camera.TypesOf.COMPACT, "c371", 2019, "Sony",
                199, 25, "5mp", false, true, "10'");
        availableProducts.add(dslr);
        availableProducts.add(action);
        availableProducts.add(compact);
        // Create & add Gaming Consoles
        GamingConsole ps4 = new GamingConsole(5, GamingConsole.TypesOf.PS4, "d64",
                2012, "Sony", 199, 40, "Intel", "NVIDIA",
                "Surround", "1TB");
        GamingConsole ps5 = new GamingConsole(2, GamingConsole.TypesOf.PS5, "d68",
                2020, "Sony", 699, 5, "Intel", "NVIDIA",
                "Surround", "3TB");
        GamingConsole seriesx = new GamingConsole(0, GamingConsole.TypesOf.PS5, "d98",
                2020, "Microsoft", 699, 5, "Intel", "NVIDIA",
                "Surround", "3TB");
        availableProducts.add(ps4);
        availableProducts.add(ps5);
        availableProducts.add(seriesx);
        // Create & add fridges
        Fridge twodoor = new Fridge(10, Fridge.TypesOf.TWODOOR, "e22", 2019,
                "Bosch", 599, 10, "A", "10kg", "5kg");
        Fridge onedoor = new Fridge(10, Fridge.TypesOf.ONEDOOR, "e12", 2019,
                "Bosch", 499, 10, "A", "10kg", "5kg");
        availableProducts.add(twodoor);
        availableProducts.add(onedoor);
        // Create & add Washers
        Washer washer = new Washer(14, Washer.TypesOf.STANDARD, "f42", 2019,
                "LG", 199, 10, "A", "10kg", "150");
        availableProducts.add(washer);
    }
}
