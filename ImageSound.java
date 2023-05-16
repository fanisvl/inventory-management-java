public class ImageSound extends Product{

    private double discount;

    public ImageSound(int availablePieces, ProductModel productModel, String id, int modelYear, String manufacturer, double price, double discount) {
        super(availablePieces, productModel, id, modelYear, manufacturer, price);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
