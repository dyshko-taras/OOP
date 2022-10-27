package test;

import box.Box;
import examples.homeworks.Employee;
import examples.homeworks.Monster;
import examples.homeworks.MyMath;
import examples.homeworks.Rect;
import examples.lessons.Person;
import examples.lessons.Test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArrayList employees = getEmployees();
        employees.add("34");
        employees.remove(3);
        for (int i = 0; i < employees.getSize(); i++)  {
            System.out.println(employees.get(i));
        }
    }


    private static MyArrayList getEmployees() {
        MyArrayList employees = new MyArrayList();
        employees.add("0");
        employees.add("1");
        employees.add("2");
        employees.add("3");
        employees.add("4");
        employees.add("5");
        employees.add("6");
        employees.add("7");
        return employees;
    }
}

