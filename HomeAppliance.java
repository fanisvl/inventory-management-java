public class HomeAppliance extends Product {
    private double discount;
    private String energyClass;

    public HomeAppliance(int availablePieces, ProductModel productModel, String id, int modelYear, String manufacturer, double price, double discount, String energyClass) {
        super(availablePieces, productModel, id, modelYear, manufacturer, price);
        this.discount = discount;
        this.energyClass = energyClass;
    }

    // GETTERS
    public double getDiscount() {
        return discount;
    }

    public String getEnergyClass() {
        return energyClass;
    }

    // SETTERS
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setEnergyClass(String energyClass) {
        this.energyClass = energyClass;
    }
}
