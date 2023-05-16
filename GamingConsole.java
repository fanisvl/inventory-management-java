public class GamingConsole extends Product{
    enum GamingConsoleModels {
        PS4,
        PS5,
        XBOXSERIESX
    }

    private GamingConsoleModels model;
    private double discount;
    private String processor;
    private String graphics;
    private String sound;
    private String storage;

    public GamingConsole(int availablePieces, GamingConsoleModels model, String id, int modelYear, String manufacturer, double price, double discount, String processor, String graphics, String sound, String storage) {
        super(availablePieces, id, modelYear, manufacturer, price);
        this.model = model;
        this.discount = discount;
        this.processor = processor;
        this.graphics = graphics;
        this.sound = sound;
        this.storage = storage;
    }

// GETTERS
    public GamingConsoleModels getModel() {
        return model;
    }

    public double getDiscount() {
        return discount;
    }

    public String getProcessor() {
        return processor;
    }

    public String getGraphics() {
        return graphics;
    }

    public String getSound() {
        return sound;
    }

    public String getStorage() {
        return storage;
    }
    // SETTERS
    public void setModel(GamingConsoleModels model) {
        this.model = model;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
}
