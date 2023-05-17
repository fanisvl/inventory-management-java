public class Product {

    // Category and type

    protected int category;
    protected String type;

    // General Fields

    private int availablePieces = 0;
    private String id;
    private int modelYear;
    private String manufacturer;
    private double price;

    // for quick testing
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


    public int getCategory() {
        return category;
    }

    public int getType() {
        return type;
    }

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


    public void setCategory(int category) {
        this.category = category;
    }

    public void setType(int type) {
        this.type = type;
    }

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
