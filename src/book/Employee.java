package book;

import java.util.Random;

class Employee {
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

    // static block
    static {
        var generator = new Random();
        nextId = generator.nextInt(1000);
    }

    // блок инициалзиции обьекта

    {
        id = nextId;
        nextId++;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        this("Employee #" + nextId, salary);
    }

    public Employee() {
        // поле name инициализируется пустой строкой
        // salary не установлено явно (равно 0)
        // поле id инициализируется в блоке инициализации
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
