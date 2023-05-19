import java.time.LocalDate;

public class Sale {

    // If an item is available we create a sale.
    private static int nextId = 1;
    private int id;
    private Product product;
    private String fullName;
    private int phone;
    private LocalDate date;
    private double finalCost;

    public Sale(Product product, String fullName, int phone, LocalDate date, double finalCost) {
        this.id = nextId++;
        this.product = product;
        this.fullName = fullName;
        this.phone = phone;
        this.date = date;
        this.finalCost = finalCost;
    }

    // GETTERS

    public int getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public String getFullName() {
        return fullName;
    }

    public int getPhone() {
        return phone;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getFinalCost() {
        return finalCost;
    }

    // SETTERS

    public void setId(int id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setFinalCost(double finalCost) {
        this.finalCost = finalCost;
    }
}

