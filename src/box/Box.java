package box;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double size) {
        this(size,size,size);
    }

    public Box() {
        this(10);
    }

    public Box(Box box) {
        this(box.length, box.width, box.height);
    }

    public void compare(Box box2) {
        if(getVolume() > box2.getVolume()) {
            System.out.println("The first is bigger");
        } else if(getVolume() < box2.getVolume()) {
            System.out.println("The second is bigger");
        } else {
            System.out.println("The boxes are the same");
        }
    }

    public int compare2(Box box2) {
        int result;
        if(getVolume() > box2.getVolume()) {
            result = 1;
        } else if(getVolume() < box2.getVolume()) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }

    public void setDimension(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void copyDimension(Box box) {
        setDimension(box.length, box.width, box.height);
    }

    public Box copy() {
        return new Box(length,width,height);
    }

    public Box increase() {
        return new Box(length * 2,width * 2,height * 2);
    }

    private double getVolume() {
        return length * width * height;
    }

    public void showVolume() {
        System.out.println(getVolume());
    }

    public void showInfo() {
        System.out.print(length + " -- " + width + " -- " + height);
    }
}
