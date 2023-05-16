public class Washer extends HomeAppliance {
    private String capacity;
    private String rotations;
    private ProductModel model = ProductModel.STANDARD;

    public Washer(int availablePieces, ProductModel productModel, String id, int modelYear, String manufacturer, double price, double discount, String energyClass, String capacity, String rotations) {
        super(availablePieces, productModel, id, modelYear, manufacturer, price, discount, energyClass);
        this.capacity = capacity;
        this.rotations = rotations;
    }

// GETTERS
    public String getCapacity() {
        return capacity;
    }

    public String getRotations() {
        return rotations;
    }

    public ProductModel getModel() {
        return model;
    }

    // SETTERS
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public void setRotations(String rotations) {
        this.rotations = rotations;
    }

    public void setModel(ProductModel model) {
        this.model = model;
    }
}
