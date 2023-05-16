public class Fridge extends HomeAppliance {

    public static final ProductModel[] models = {ProductModel.ONEDOOR,
                                                ProductModel.TWODOOR};
    private String maintenanceStorage;
    private String freezerStorage;

    public Fridge(int availablePieces, ProductModel productModel, String id, int modelYear, String manufacturer, double price, double discount, String energyClass, String maintenanceStorage, String freezerStorage) {
        super(availablePieces, productModel, id, modelYear, manufacturer, price, discount, energyClass);
        this.maintenanceStorage = maintenanceStorage;
        this.freezerStorage = freezerStorage;
    }

// GETTERS

    public String getMaintenanceStorage() {
        return maintenanceStorage;
    }

    public String getFreezerStorage() {
        return freezerStorage;
    }

    // SETTERS

    public void setMaintenanceStorage(String maintenanceStorage) {
        this.maintenanceStorage = maintenanceStorage;
    }

    public void setFreezerStorage(String freezerStorage) {
        this.freezerStorage = freezerStorage;
    }
}
