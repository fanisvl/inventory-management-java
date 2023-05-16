import java.util.ArrayList;
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
        // Create & add Cameras
        Camera dslr = new Camera(3, Camera.CameraModels.DSLR, "c1", 2020, "Sony",
                699, 5, "20mp", true, true, "10'");
        Camera action = new Camera(6, Camera.CameraModels.ACTION, "c321", 2019, "GoPro",
                299, 15, "5mp", true, true, "10'");
        availableProducts.add(dslr);
        availableProducts.add(action);
        // Create & add Gaming Consoles
        GamingConsole ps4 = new GamingConsole(5, GamingConsole.GamingConsoleModels.PS4, "d64",
                2012, "Sony", 199, 40, "Intel", "NVIDIA",
                "Surround", "1TB");
        GamingConsole ps5 = new GamingConsole(2, GamingConsole.GamingConsoleModels.PS5, "d68",
                2020, "Sony", 699, 5, "Intel", "NVIDIA",
                "Surround", "3TB");
        availableProducts.add(ps4);
        availableProducts.add(ps5);
        // Create & add fridges
        Fridge twodoor = new Fridge(10, Fridge.FridgeModels.TWODOOR, "e22", 2019,
                "Bosch", 599, 10, "A", "10kg", "5kg");
        Fridge onedoor = new Fridge(10, Fridge.FridgeModels.ONEDOOR, "e12", 2019,
                "Bosch", 499, 10, "A", "10kg", "5kg");
        availableProducts.add(twodoor);
        availableProducts.add(onedoor);
        // Create & add Washers
        Washer washer = new Washer(14, Washer.WasherModels.STANDARD, "f42", 2019,
                "LG", 199, 10, "A", "10kg", "150");
        Washer washer2 = new Washer(4, Washer.WasherModels.STANDARD, "f99", 2021,
                "LG", 399, 10, "A", "30kg", "300");
        availableProducts.add(washer);
        availableProducts.add(washer2);

    }
}
