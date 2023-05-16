public class Camera extends ImageSound{
    enum CameraModels {
        COMPACT,
        DSLR,
        ACTION
    }

    private CameraModels model;
    private String megaPixel;
    private boolean opticalZoom;
    private boolean digitalZoom;
    private String screenSize;

    public Camera(int availablePieces, CameraModels cameraModel, String id, int modelYear, String manufacturer, double price, double discount, String megaPixel, boolean opticalZoom, boolean digitalZoom, String screenSize) {
        super(availablePieces, id, modelYear, manufacturer, price, discount);
        this.model = cameraModel;
        this.megaPixel = megaPixel;
        this.opticalZoom = opticalZoom;
        this.digitalZoom = digitalZoom;
        this.screenSize = screenSize;
    }

    // GETTERS


    public CameraModels getModel() {
        return model;
    }

    public String getMegaPixel() {
        return megaPixel;
    }

    public boolean isOpticalZoom() {
        return opticalZoom;
    }

    public boolean isDigitalZoom() {
        return digitalZoom;
    }

    public String getScreenSize() {
        return screenSize;
    }

    // SETTERS

    public void setModel(CameraModels model) {
        this.model = model;
    }

    public void setMegaPixel(String megaPixel) {
        this.megaPixel = megaPixel;
    }

    public void setOpticalZoom(boolean opticalZoom) {
        this.opticalZoom = opticalZoom;
    }

    public void setDigitalZoom(boolean digitalZoom) {
        this.digitalZoom = digitalZoom;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
}
