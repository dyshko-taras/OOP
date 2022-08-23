package examples.homeworks;

public class Monster {
    private int eyes;
    private int hands;
    private int legs;

    public Monster(int eyes, int hands, int lengs) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = lengs;
    }

    public Monster(int parts) {
        this(parts,parts,parts);
    }

    public Monster() {
        this(2);
    }

    public void showInfo() {
        System.out.println("Eyes - " + eyes + "\n" +
                "Hands - " + hands + "\n" +
                "Legs - " + legs + "\n");
    }

    public void voice(int repeat, String sound) {
        for (int i = 0; i < repeat; i++) {
            System.out.println(sound);
        }
    }


    public void voice(int repeat) {
        voice(repeat,"Rrrrrrrrrrr");
    }

    public void voice() {
        voice(2);
    }




}
