public class VideoPlayer extends ImageSound{

    enum TypesOf {
        BLURAY,
        DVD
    }

    enum PlaybackFormat {
        BDR,
        BDRD,
        DVDRW
    }
    private TypesOf model;
    private String resolution;
    private PlaybackFormat playbackFormat;

    public VideoPlayer(int availablePieces, TypesOf videoPlayerModel, String id, int modelYear,
                       String manufacturer, double price, double discount, String resolution,
                       PlaybackFormat playbackFormat) {
        super(availablePieces, id, modelYear, manufacturer, price, discount);
        this.model = videoPlayerModel;
        this.resolution = resolution;
        this.playbackFormat = playbackFormat;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nModel: " + model +
                "\nResolution: " + resolution +
                "\nPlayback Format:" + playbackFormat;
    }

    // GETTERS
    public TypesOf getModel() {
        return model;
    }

    public String getResolution() {
        return resolution;
    }

    public PlaybackFormat getPlaybackFormat() {
        return playbackFormat;
    }
    // SETTERS


    public void setModel(TypesOf model) {
        this.model = model;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setPlaybackFormat(PlaybackFormat playbackFormat) {
        this.playbackFormat = playbackFormat;
    }
}
