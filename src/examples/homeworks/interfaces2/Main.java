package examples.homeworks.interfaces2;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.makeOrder(new Waiter() {
            @Override
            public void bringOrder(String dish) {
                System.out.println("I'm bringing " + dish);
            }
        },"a cake.");
    }
}
