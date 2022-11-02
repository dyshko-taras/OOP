package examples.lessons;

public class Person {
    private String name;
    private int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println(String.format("My name is %s. I'm %d years old.",name,age));
    }
    public static void getInfo(String name, int age) {
        System.out.println(String.format("My name is %s. I'm %d years old.",name,age));
    }
    public static void getInfo(String name, String age) {
        int numberOfAge = Integer.parseInt(age);
        System.out.println(String.format("My name is %s. I'm %d years old.",name,numberOfAge));
    }

}
