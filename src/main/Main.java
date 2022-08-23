package main;

import examples.lessons.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("",25);
        person.setAge(-23);
        person.setName("Eren Eger");
        System.out.println(person.getName() + " " + person.getAge());
        System.out.println();


//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        int dimension = a * b;
//
//        int [] array = new int[dimension];
//
//        for (int i = 0; i < dimension; i++) {

    }

}

