public class Product {

    // Only for availableProducts collection
    private int availablePieces = 0;
    private ProductModel productModel; // enum

    // General Fields
    private String id;
    private int modelYear;
    private String manufacturer;
    private double price;

    public Product(int availablePieces, ProductModel productModel) {
        this(availablePieces, productModel, "123", 2017, "LG", 399.99);
    }

    public Product(int availablePieces, ProductModel productModel, String id, int modelYear, String manufacturer, double price) {
        this.availablePieces = availablePieces;
        this.productModel = productModel;
        this.id = id;
        this.modelYear = modelYear;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    // GETTERS

    public int getAvailablePieces() {
        return availablePieces;
    }
    public ProductModel getProductModel() {
        return productModel;
    }
    public String getId() {
        return id;
    }

    public int getModelYear() {
        return modelYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    // SETTERS

    public void setAvailablePieces(int availablePieces) {
        this.availablePieces = availablePieces;
    }
    public void setProductModel(ProductModel productModel) {
        this.productModel = productModel;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
