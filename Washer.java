public class Washer extends HomeAppliance {
    enum TypesOf {
        STANDARD
    }

    private TypesOf model;
    private String capacity;
    private String rotations;

    public Washer(int availablePieces, TypesOf washerModel, String id, int modelYear, String manufacturer, double price, double discount, String energyClass, String capacity, String rotations) {
        super(availablePieces, id, modelYear, manufacturer, price, discount, energyClass);
        this.model = washerModel;
        this.capacity = capacity;
        this.rotations = rotations;
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nModel: " + model +
                "\nCapacity: " + capacity +
                "\nRotations: " + rotations;
    }

    // GETTERS
    public String getCapacity() {
        return capacity;
    }

    public String getRotations() {
        return rotations;
    }

    public TypesOf getModel() {
        return model;
    }

    // SETTERS
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public void setRotations(String rotations) {
        this.rotations = rotations;
    }

    public void setModel(TypesOf model) {
        this.model = model;
    }
}
