public class HomeAppliance extends Product {

    enum HomeApplianceTypes {
        FRIDGE,
        WASHER
    }
    private double discount;
    private String energyClass;


    public HomeAppliance(int availablePieces, String id, int modelYear, String manufacturer, double price, double discount, String energyClass) {
        super(availablePieces, id, modelYear, manufacturer, price);
        this.discount = discount;
        this.energyClass = energyClass;
    }

    @Override
    public String toString() {
        return "HomeAppliance{" +
                "discount=" + discount +
                ", energyClass='" + energyClass + '\'' +
                '}';
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
