public class Washer extends HomeAppliance {
    enum WasherModels {
        STANDARD
    }
    private WasherModels model;
    private String capacity;
    private String rotations;

    public Washer(int availablePieces, WasherModels model, String id, int modelYear, String manufacturer, double price, double discount, String energyClass, String capacity, String rotations) {
        super(availablePieces, id, modelYear, manufacturer, price, discount, energyClass);
        this.model = model;
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

    public WasherModels getModel() {
        return model;
    }

    // SETTERS
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public void setRotations(String rotations) {
        this.rotations = rotations;
    }

    public void setModel(WasherModels model) {
        this.model = model;
    }
}
