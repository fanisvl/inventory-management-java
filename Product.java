public class Product {

    enum TypesOf {
        ImageSound,
        Gaming,
        HomeAppliances
    }

    private int availablePieces = 0;
    private String id;
    private int modelYear;
    private String manufacturer;
    private double price;

    protected double discount; // Saves discount set by Category, to be accessible by Product for availableProductsList

    public Product(int availablePieces, String id, int modelYear, String manufacturer, double price) {
        this.availablePieces = availablePieces;
        this.id = id;
        this.modelYear = modelYear;
        this.manufacturer = manufacturer;
        this.price = price;
    }


    public String toString() {
        return  "\nAvailable Pieces: " + availablePieces +
                "\nId: " + id +
                "\nModel Year: " + modelYear +
                "\nManufacturer: " + manufacturer +
                "\nPrice: " + price;
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
