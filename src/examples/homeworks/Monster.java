package examples.homeworks;

public class Monster {
    private int eyes;
    private int hands;
    private int legs;

    public Monster(int eyes,int hands, int legs) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }

    public Monster(int count) {
        this(count,count,count);
    }

    public Monster() {
        this(2);
    }

    public void voice(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }

    public void voice(int count) {
        voice(count,"Rrrrrrr...");
    }

    public void voice() {
        voice(1);
    }

}
