package inheritance;

public abstract class Shape {
    private int a;
    private int b;

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract int perimeter();

    public final void  showPerimeter() {
        System.out.println(perimeter());
    }

    public final int getA() {
        return a;
    }

    public final int getB() {
        return b;
    }
}
