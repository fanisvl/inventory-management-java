public class Tv extends ImageSound{

    enum TypesOf {
        LCD,
        LED,
        PLASMA
    }
    enum TvPorts{
        HDMI,
        DVI,
        Composite
    }



    private TypesOf model;
    private String dimensions;
    private String resolution;
    private TvPorts ports;

    public Tv(int availablePieces, TypesOf tvModel, String id, int modelYear, String manufacturer, double price, double discount, String dimensions, String resolution, TvPorts ports) {
        super(availablePieces, id, modelYear, manufacturer, price, discount);
        this.model = tvModel;
        this.dimensions = dimensions;
        this.resolution = resolution;
        this.ports = ports;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nModel: " + model +
                "\nDimensions: " + dimensions +
                "\nResolution: " + resolution +
                "\nPorts: " + ports;
    }

    // GETTERS

    public TypesOf getModel() {
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


    public void setModel(TypesOf model) {
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
