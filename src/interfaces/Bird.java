package interfaces;

public class Bird extends Animal implements AbleToRun,AbleToFly{
    @Override
    public void eat() {
        System.out.println("bird food");
    }

    @Override
    public void fly() {
        System.out.println("bird flies");
    }

    @Override
    public void run() {
        System.out.println("bird runs");
    }
}

