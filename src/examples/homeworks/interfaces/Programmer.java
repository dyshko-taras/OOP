package examples.homeworks.interfaces;

public class Programmer implements Worker,Driver{
    @Override
    public void work() {
        System.out.println("Programmer works");
    }

    @Override
    public void drive() {
        System.out.println("Programmer drives");
    }
}
