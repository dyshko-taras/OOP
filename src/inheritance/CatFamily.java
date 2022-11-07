package inheritance;

public class CatFamily {

    private int legs;
    private int eyes;
    private boolean canEatPerson;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }

    public CatFamily(int legs, int eyes, boolean canEatPerson) {
        this.legs = legs;
        this.eyes = eyes;
        this.canEatPerson = canEatPerson;
    }
    
    public void eat() {
        System.out.print("I'm eating ");
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void setCanEatPerson(boolean canEatPerson) {
        this.canEatPerson = canEatPerson;
    }

    public int getLegs() {
        return legs;
    }

    public int getEyes() {
        return eyes;
    }

    public boolean isCanEatPerson() {
        return canEatPerson;
    }
}
