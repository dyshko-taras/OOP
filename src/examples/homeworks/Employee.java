package examples.homeworks;

public class Employee {
    private String name;
    private String position;
    private int salary;

    public Employee(String name,String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void showInfo() {
        System.out.println(String.format("Name: %s.\nPosition: %s.\nSalary: %s.",
                name,position,salary));
    }

}
