package examples.homeworks;

public class Employee {
    String name;
    String position;
    int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

     public void showInfo() {
        System.out.println("Name - " + name + "\n" +
                "Position - " + position + "\n" +
                "Salary - " + salary);
    }
}
