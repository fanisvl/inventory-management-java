public class ImageSound extends Product{

    private double discount;

    public ImageSound(int availablePieces, String id, int modelYear, String manufacturer, double price, double discount) {
        super(availablePieces, id, modelYear, manufacturer, price);
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "ImageSound{" +
                "discount=" + discount +
                '}';
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
