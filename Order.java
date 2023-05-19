import java.time.LocalDate;
public class Order extends Sale {
    private LocalDate OrderArrivalDate;
    private boolean orderExecuted;

    public Order(Product product, String fullName, int phone, LocalDate date,
                 double finalCost, LocalDate orderArrivalDate, boolean orderExecuted) {
        super(product, fullName, phone, date, finalCost);
        OrderArrivalDate = orderArrivalDate;
        this.orderExecuted = orderExecuted;
    }

    // GETTERS

    public LocalDate getOrderArrivalDate() {
        return OrderArrivalDate;
    }

    public boolean isOrderExecuted() {
        return orderExecuted;
    }

    // SETTERS

    public void setOrderArrivalDate(LocalDate orderArrivalDate) {
        OrderArrivalDate = orderArrivalDate;
    }

    public void setOrderExecuted(boolean orderExecuted) {
        this.orderExecuted = orderExecuted;
    }
}