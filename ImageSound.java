
public class ImageSound extends Product{

    enum TypesOf{
        TV,
        VIDEOPLAYERS,
        CAMERAS

    }
    private double discount;

    public ImageSound(int availablePieces, String id, int modelYear, String manufacturer, double price, double discount) {
        super(availablePieces, id, modelYear, manufacturer, price);
        super.discount = discount;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDiscount: " + discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
