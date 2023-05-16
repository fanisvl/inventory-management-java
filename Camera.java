public class Camera extends ImageSound{

    public static final ProductModel[] models = {ProductModel.COMPACT,
            ProductModel.DSLR,
            ProductModel.ACTION};
    private String megaPixel;
    private boolean opticalZoom;
    private boolean digitalZoom;
    private String screenSize;

    public Camera(int availablePieces, ProductModel productModel, String id, int modelYear, String manufacturer, double price, double discount, String megaPixel, boolean opticalZoom, boolean digitalZoom, String screenSize) {
        super(availablePieces, productModel, id, modelYear, manufacturer, price, discount);
        this.megaPixel = megaPixel;
        this.opticalZoom = opticalZoom;
        this.digitalZoom = digitalZoom;
        this.screenSize = screenSize;
    }

    // GETTERS

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
