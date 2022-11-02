package test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Rect rect = new Rect(4,4);
//        Triangle triangle = new Triangle(4,4,4);
//        rect.showPerimeter();
//        triangle.showPerimeter();
        int[] arr = new int[]{5,3,6,4};
        Arrays.sort(arr);
        long[] a = productFib(800);
        System.out.println(a[0] + " " + a[1] + " " + a[2]);



    }

    public static long[] productFib(long prod) {
        int n = 0;
        for (int i = 0; fib(i) * fib(i+1) < prod; i++) {
            n++;
        }
        return new long[]{fib(n),fib(n+1),(fib(n) * fib(n+1) == prod ? 1 : 0)};
    }

    public static long fib(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        return fib(i - 2) + fib(i - 1);
    }
}

