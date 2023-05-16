public class VideoPlayer extends ImageSound{

    public static final ProductModel[] models = {ProductModel.BLURAY,
            ProductModel.DVD};
    private String resolution;
    private String playbackFormat;

    public VideoPlayer(int availablePieces, ProductModel productModel, String id, int modelYear, String manufacturer, double price, double discount, String resolution, String playbackFormat) {
        super(availablePieces, productModel, id, modelYear, manufacturer, price, discount);
        this.resolution = resolution;
        this.playbackFormat = playbackFormat;
    }

    // GETTERS
    public String getResolution() {
        return resolution;
    }

    public String getPlaybackFormat() {
        return playbackFormat;
    }
    // SETTERS
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setPlaybackFormat(String playbackFormat) {
        this.playbackFormat = playbackFormat;
    }
}
