
public class Sale extends Order {

    // If an item is available we create a sale.

    private static int nextSaleId = 1;
    private final int saleId;

    public Sale(int orderId, Product item, String fullName, String phone, String orderDate, String arrivalDate, double cost, boolean orderExecuted, int saleId, String saleDate) {
        super(orderId, item, fullName, phone, orderDate, arrivalDate, cost, orderExecuted);
        this.saleDate = saleDate;
        this.saleId = nextSaleId++;
    }

    private String saleDate;
    public int getSaleId() {
        return saleId;
    }
    public String getSaleDate() {
        return saleDate;
    }
    public void setSaleDate(String date) {
        this.saleDate = date;
    }
}
