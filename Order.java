
public class Order {

    // If an item is not available we create an order.
    private static int nextOrderId = 1;
    private final int orderId;
    private Product item;
    private String fullName;
    private String phone;
    private String orderDate;
    private String arrivalDate;
    private double cost;
    private boolean orderExecuted;
    public Order(int orderId, Product item, String fullName, String phone, String orderDate, String arrivalDate, double cost, boolean orderExecuted) {
        this.orderId = nextOrderId++;
        this.item = item;
        this.fullName = fullName;
        this.phone = phone;
        this.orderDate = orderDate;
        this.arrivalDate = arrivalDate;
        this.cost = cost;
        this.orderExecuted = orderExecuted;
    }

    // GET
    public int getOrderId() {
        return orderId;
    }
    public Product getItem() {
        return item;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhone() {
        return phone;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public double getCost() {
        return cost;
    }

    public boolean isOrderExecuted() {
        return orderExecuted;
    }

    // SET

    public void setItem(Product item) {
        this.item = item;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setOrderExecuted(boolean orderExecuted) {
        this.orderExecuted = orderExecuted;
    }

}
