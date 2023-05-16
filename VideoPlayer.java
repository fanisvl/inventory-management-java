public class VideoPlayer extends ImageSound{

    enum VideoPlayerModels {
        BLUERAY,
        DVD
    }

    enum PlaybackFormat {
        BDR,
        BDRD,
        DVDRW
    }

    private VideoPlayerModels model;
    private String resolution;
    private PlaybackFormat playbackFormat;

    public VideoPlayer(int availablePieces, VideoPlayerModels videoPlayerModel, String id, int modelYear, String manufacturer, double price, double discount, String resolution, PlaybackFormat playbackFormat) {
        super(availablePieces, id, modelYear, manufacturer, price, discount);
        this.model = videoPlayerModel;
        this.resolution = resolution;
        this.playbackFormat = playbackFormat;
    }

    // GETTERS


    public VideoPlayerModels getModel() {
        return model;
    }

    public String getResolution() {
        return resolution;
    }

    public String getPlaybackFormat() {
        return playbackFormat;
    }
    // SETTERS


    public void setModel(VideoPlayerModels model) {
        this.model = model;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setPlaybackFormat(String playbackFormat) {
        this.playbackFormat = playbackFormat;
    }
}
