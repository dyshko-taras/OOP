package box;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box() {
        this(10);
    }

    public Box(double size) {
        this(size, size, size);
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;

    }


    public void setDimens(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }


    public void showVolume () {
        System.out.println(getVolume());
    }


    public double getVolume () {
        return length * width * height;
    }


    public void compare(Box another) {
        double volume1 = getVolume();
        double volume2 = another.getVolume();

        if(volume1 > volume2) {
            System.out.println("First box is bigger than another one");
        }
        else if(volume1 < volume2) {
            System.out.println("Another box is bigger than first one");
        } else {
            System.out.println("The boxes is the same");
        }
    }


    public int compare2(Box another) {
        double volume1 = getVolume();
        double volume2 = another.getVolume();
        int result;
        if(volume1 > volume2) {
            result = 1;
        }
        else if(volume1 < volume2) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }


    public Box copyBox() {
        return new Box(this.length, this.width, this.height);
    }


    public Box increase(int num) {
        return new Box(this.length * num, this.width * num, this.height * num);
    }

}
