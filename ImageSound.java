
import java.sql.Array;
import java.util.Arrays;
public class ImageSound extends Product{
    private double discount;
    protected int category = 1;
    protected final String[] types = {"TV", "Video Players", "Cameras"};

    public ImageSound(int availablePieces, String id, int modelYear, String manufacturer, double price, double discount) {
        super(availablePieces, id, modelYear, manufacturer, price);
        super.category = category;
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
