package inheritance;

public class Cat extends CatFamily{
    public Cat() {
        super(4,4,false);


    }

    

    @Override
    public void setName(String name) {
        super.setName("Cat");
    }
}
