public class Tv extends ImageSound{

    enum TvModels {
        LCD,
        LED,
        PLASMA
    }
    enum TvPorts{
        HDMI,
        DVI,
        Composite
    }

    protected final String type = "TV";

    private TvModels model;
    private String dimensions;
    private String resolution;
    private TvPorts ports;

    public Tv(int availablePieces, TvModels tvModel, String id, int modelYear, String manufacturer, double price, double discount, String dimensions, String resolution, TvPorts ports) {
        super(availablePieces, id, modelYear, manufacturer, price, discount);
        super.type = type;
        this.model = tvModel;
        this.dimensions = dimensions;
        this.resolution = resolution;
        this.ports = ports;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "model=" + model +
                ", dimensions='" + dimensions + '\'' +
                ", resolution='" + resolution + '\'' +
                ", ports=" + ports +
                '}';
    }

    // GETTERS

    public TvModels getModel() {
        return model;
    }

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


    public void setModel(TvModels model) {
        this.model = model;
    }

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
