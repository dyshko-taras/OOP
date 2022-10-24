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
        String[] employees = getEmployees();
        String[] newArray = new String[employees.length + 1];
        for (String a:
             employees) {
            System.out.println(a);
        }
    }


    private static String[] getEmployees() {
        String[] employees = new String[5];
        employees[0] = "0";
        employees[1] = "1";
        employees[2] = "2";
        employees[3] = "3";
        employees[4] = "4";
        return employees;
    }
}

