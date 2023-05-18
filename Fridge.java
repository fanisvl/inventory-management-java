public class Fridge extends HomeAppliance {

    enum FridgeModels {
        ONEDOOR,
        TWODOOR
    }
    private FridgeModels model;
    private String maintenanceStorage;
    private String freezerStorage;

    public Fridge(int availablePieces, FridgeModels fridgeModel, String id, int modelYear, String manufacturer, double price, double discount, String energyClass, String maintenanceStorage, String freezerStorage) {
        super(availablePieces, id, modelYear, manufacturer, price, discount, energyClass);
        this.model = fridgeModel;
        this.maintenanceStorage = maintenanceStorage;
        this.freezerStorage = freezerStorage;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "model=" + model +
                ", maintenanceStorage='" + maintenanceStorage + '\'' +
                ", freezerStorage='" + freezerStorage + '\'' +
                '}';
    }

    // GETTERS


    public FridgeModels getModel() {
        return model;
    }

    public String getMaintenanceStorage() {
        return maintenanceStorage;
    }

    public String getFreezerStorage() {
        return freezerStorage;
    }

    // SETTERS
    public void setModel(FridgeModels model) {
        this.model = model;
    }

    public void setMaintenanceStorage(String maintenanceStorage) {
        this.maintenanceStorage = maintenanceStorage;
    }

    public void setFreezerStorage(String freezerStorage) {
        this.freezerStorage = freezerStorage;
    }
}
