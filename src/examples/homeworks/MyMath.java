package examples.homeworks;

    public class MyMath {

        public static String makeReadable(int seconds) {
            String HH = String.valueOf(seconds / 3600);
            String MM = String.valueOf(seconds % 3600 / 60);
            String SS = String.valueOf(seconds % 3600 % 60);
            if (HH.length() == 1) HH = "0" + HH;
            if (MM.length() == 1) MM = "0" + MM;
            if (SS.length() == 1) SS = "0" + SS;
            return String.format("%d:%d:%d",HH,MM,SS);
        }

        public static final double PI = 3.14;

        public static double length(double radisus) {
            return 2 * PI * radisus;
        }

        public static double area(double radius) {
            return radius * radius * PI;
        }

        public static int sum(int ... numbers) {
            int sum = 0;
            for (int number:
                 numbers) {
                sum += number;
            }
            return sum;
        }

         public static int multiple(int a, int b) {
            return a * b;
        }
         public static double multiple(double a, double b) {
            return a * b;
        }
         public static double multiple(double a) {
            return multiple(a,a);
        }

         public static int multiple(int a) {
            return multiple(a,a);
        }



}
