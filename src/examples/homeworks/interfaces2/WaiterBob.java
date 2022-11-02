package examples.homeworks.interfaces2;

public class WaiterBob implements  Waiter{
    @Override
    public void bringOrder(String dish) {
        System.out.println("Bob's bringing " + dish);
    }
}
