public class Main {
    public static void main(String[] args) {
        Order order = new Order(123, "Alice", "Laptop");
        order.registerObserver(new Customer("Alice", "alice@example.com"));
        order.registerObserver(new LogisticsSystem());

        order.updateStatus(OrderStatus.PROCESSING);
        order.updateStatus(OrderStatus.SHIPPED);
        order.updateStatus(OrderStatus.DELIVERED);
}
}