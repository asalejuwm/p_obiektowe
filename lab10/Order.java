import java.util.Comparator;
public class Order implements Comparable<Order> {
    private String productName;
    private int quantity;
    private double unitPrice;

    public Order(String productName, int quantity, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public int compareTo(Order other){
        return Comparator.comparingDouble(Order::getUnitPrice).reversed().thenComparingInt(Order::getQuantity).compare(this,other);
    }

    @Override
    public String toString() {
        return "Order{" + "productName='" + productName + '\'' + ", quantity=" + quantity + ", unitPrice=" + unitPrice + '}';
    }
}
