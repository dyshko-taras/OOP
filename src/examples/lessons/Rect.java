package examples.lessons;

public class Rect {

    private double length;
    private double width;

    void setDimens(double length,double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getArea() {
        return length * width;
    }

    void showPerimeter() {
        System.out.println(getPerimeter());
    }
    void showArea() {
        System.out.println(getArea());
    }

}
