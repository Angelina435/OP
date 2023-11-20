
public class Order {
    private int orderId;
    private String products;
    private String deliveryAddress;
    private double cost;

    private Order(int orderId, String products, String deliveryAddress, double cost) {
        this.orderId = orderId;
        this.products = products;
        this.deliveryAddress = deliveryAddress;
        this.cost = cost;
    }

    public static class Builder {
        private int orderId;
        private String products;
        private String deliveryAddress;
        private double cost;

        public Builder(int orderId) {
            this.orderId = orderId;
        }

        public Builder setProducts(String products) {
            this.products = products;
            return this;
        }

        public Builder setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        public Builder setCost(double cost) {
            this.cost = cost;
            return this;
        }

        public Order build() {
            return new Order(orderId, products, deliveryAddress, cost);
        }
    }

    public int getOrderId() {
        return orderId;
    }

    public String getProducts() {
        return products;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public double getCost() {
        return cost;
    }
}
