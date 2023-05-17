public class Product {

    // Only for availableProducts collection
    private int availablePieces = 0;

    // General Fields
    private String id;
    private int modelYear;
    private String manufacturer;
    private double price;

    public Product(int availablePieces) {
        this(availablePieces,  "123", 2017, "LG", 399.99);
    }

    public Product(int availablePieces, String id, int modelYear, String manufacturer, double price) {
        this.availablePieces = availablePieces;
        this.id = id;
        this.modelYear = modelYear;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "availablePieces=" + availablePieces +
                ", id='" + id + '\'' +
                ", modelYear=" + modelYear +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }

    // GETTERS

    public int getAvailablePieces() {
        return availablePieces;
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
