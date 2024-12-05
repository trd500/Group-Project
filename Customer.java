public class Customer extends Person {
    private String address;

    public Customer(String name, int number, String address) {
        super(name, number);
        this.address = address;
    }

    // Address
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    //*get order status*
    public String getOrderStatus() {
        return "Order status for " + getName() + " is: ";
    }

    // Create order
    public void createOrder(Order order) {
        System.out.println("Order created for: " + getName());
        System.out.println("Order details: " + order.getOrderDetails());
    }

    //Driver rating
    public int addDriverRating(Driver driver, int rating) {
        driver.addRating(rating);
        System.out.println("Customer " + getName() + " rated driver " + driver.getName() + " a " + rating);
        return rating;
    }
}
