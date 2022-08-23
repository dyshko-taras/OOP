package examples.lessons;

import java.util.ArrayList;

public class Rofl {

    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> str = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            str.add(a[i]);
        }
        for(int i = 0; i < b.length; i++) {
            for (int j = 0; j < str.size(); j++) {
                if (b[i] == str.get(j)) {
                    str.remove(j);
                    j--;
                }
            }
        }
        int[] a2 = new int[str.size()];
        for (int i = 0; i < str.size(); i++) {
            a2[i] = str.get(i);
        }
        return a2;
    }
}
