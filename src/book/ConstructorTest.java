package book;

import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args) {
        var staff = new Employee[3];

        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        for (Employee e :
                staff) {
            System.out.printf("\nName - %s\nId - %d\nSalary - %,.1f\n", e.getName(),e.getId(),e.getSalary());
        }

    }
}

