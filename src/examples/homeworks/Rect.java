package examples.homeworks;

public class Rect {
    double length;
    double width;

    public void setDimension(double length,double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void showPerimeter() {
        System.out.println(getPerimeter());
    }

    public double getArea() {
        return length * width;
    }

    public void showArea() {
        System.out.println(getArea());
    }
}
