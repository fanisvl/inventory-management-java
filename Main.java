import java.util.ArrayList;
// ALTERNATIVE TO APP.java
public class Main {
    public static void main(String[] args) {
        ArrayList<Product> availableProducts = new ArrayList<>();

        // Create & add Tvs
        Tv lcd_tv = new Tv(32, Tv.TvModels.LCD, "a321", 2017, "LG", 299.99,
                15, "42'", "1440p", Tv.TvPorts.HDMI);
        Tv led_tv = new Tv(12, Tv.TvModels.LED, "a321", 2015, "LG", 199.99,
                10, "42'", "1080p", Tv.TvPorts.DVI);
        availableProducts.add(lcd_tv);
        availableProducts.add(led_tv);
        // Create & add VideoPlayers
        VideoPlayer bluray = new VideoPlayer(5, VideoPlayer.VideoPlayerModels.BLUERAY, "b32",
                2014, "Sony", 49.99, 50, "1080p", VideoPlayer.PlaybackFormat.BDR);
        VideoPlayer dvd = new VideoPlayer(5, VideoPlayer.VideoPlayerModels.DVD, "b32",
                2014, "Sony", 49.99, 50, "1080p", VideoPlayer.PlaybackFormat.DVDRW);
        availableProducts.add(bluray);
        availableProducts.add(dvd);
    }
}
