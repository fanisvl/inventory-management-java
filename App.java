import java.util.HashMap;
public class App {
    public static void main(String[] args) {
        // Why a hashmap?
        HashMap<ProductModel, Product> availableProducts = new HashMap<>();
        // Fill availableProducts with every model
        // (fulfills requirement of at least models 2 of every type
        // (?) Washer has only one model??? Different energyClass, capacity or rpm count as different models?)
        // Maybe replace with manual creation of Model objects

//        for(ProductModel model : ProductModel.values()) {
//            availableProducts.put(model, new Product(30, model));
//        }

        System.out.println(availableProducts);

        for(ProductModel model : GamingConsole.models) {
            System.out.println(model);
            System.out.println(availableProducts.get(model).getAvailablePieces());
        }
    }
}
