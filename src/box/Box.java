package box;

public class Box {
    double length;
    double width;
    double height;

    public Box(double length,double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setDimension(double length,double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }

    public void showVolume() {
        System.out.println(getVolume());
    }
}
