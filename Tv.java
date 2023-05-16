public class Tv extends ImageSound{
    public static final ProductModel[] models = {ProductModel.LCD,
                                                ProductModel.LED,
                                                ProductModel.PLASMA};
    enum TvPorts{
        HDMI,
        DVI,
        Composite
    }
    private String dimensions;
    private String resolution;
    private TvPorts ports;

    public Tv(int availablePieces, ProductModel productModel, String id, int modelYear, String manufacturer, double price, double discount, String dimensions, String resolution, TvPorts ports) {
        super(availablePieces, productModel, id, modelYear, manufacturer, price, discount);
        this.dimensions = dimensions;
        this.resolution = resolution;
        this.ports = ports;
    }

    // GETTERS
    public String getDimensions() {
        return dimensions;
    }

    public String getResolution() {
        return resolution;
    }

    public TvPorts getPorts() {
        return ports;
    }

    // SETTERS
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setPorts(TvPorts ports) {
        this.ports = ports;
    }
}
