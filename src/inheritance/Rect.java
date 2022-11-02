package inheritance;

public class Rect extends Shape{
    public Rect(int a, int b){
        super(a, b);
    }

    @Override
    public int perimeter() {
        return getA() + getA() + getB() + getB();
    }
}
