
public class Main {
    public static void main(String[] args) {

        Order order = new Order.Builder(1)
                .setProducts("Product1, Product2")
                .setDeliveryAddress("123 Main St, City")
                .setCost(100.0)
                .build();


        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Products: " + order.getProducts());
        System.out.println("Delivery Address: " + order.getDeliveryAddress());
        System.out.println("Cost: " + order.getCost());
    }
}
