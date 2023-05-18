public class Fridge extends HomeAppliance {

    enum TypesOf {
        ONEDOOR,
        TWODOOR
    }
    private TypesOf model;
    private String maintenanceStorage;
    private String freezerStorage;

    public Fridge(int availablePieces, TypesOf fridgeModel, String id, int modelYear, String manufacturer, double price, double discount, String energyClass, String maintenanceStorage, String freezerStorage) {
        super(availablePieces, id, modelYear, manufacturer, price, discount, energyClass);
        this.model = fridgeModel;
        this.maintenanceStorage = maintenanceStorage;
        this.freezerStorage = freezerStorage;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nModel: " + model +
                "\nMaintenance Storage: " + maintenanceStorage +
                "\nFreezerStorage: " + freezerStorage;
    }

    // GETTERS


    public TypesOf getModel() {
        return model;
    }

    public String getMaintenanceStorage() {
        return maintenanceStorage;
    }

    public String getFreezerStorage() {
        return freezerStorage;
    }

    // SETTERS
    public void setModel(TypesOf model) {
        this.model = model;
    }

    public void setMaintenanceStorage(String maintenanceStorage) {
        this.maintenanceStorage = maintenanceStorage;
    }

    public void setFreezerStorage(String freezerStorage) {
        this.freezerStorage = freezerStorage;
    }
}
