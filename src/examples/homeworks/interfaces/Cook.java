package examples.homeworks.interfaces;

public class Cook implements Worker, Driver{
    @Override
    public void work() {
        System.out.println("cook worker");
    }

    @Override
    public void drive() {
        System.out.println("cook drives");
    }
}
