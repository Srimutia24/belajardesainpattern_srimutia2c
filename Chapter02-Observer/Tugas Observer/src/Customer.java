class Customer implements OrderObserver {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void receiveOrderNotification(Order order) {
        System.out.println("Dear " + name + ",");
        System.out.println("Your order #" + order.getId() + " has been updated to status: " + order.getStatus());
        System.out.println("Product: " + order.getProduct());
        System.out.println("Please check your email for more details.");
    }
}
