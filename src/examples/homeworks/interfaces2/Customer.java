package examples.homeworks.interfaces2;

public class Customer{
    public void makeOrder(Waiter waiter, String dish) {
        waiter.bringOrder(dish);
    }
}
