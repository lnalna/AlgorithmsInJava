package sorting;

import static sorting.Sample.exch;
import static sorting.Sample.less;

public class Selection {

    public static void sort(int[] a) {
        //Sorting a by ascending
        int N = a.length;
        for(int i = 0; i < N; i++) {
            int min = i;
            for(int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }
}
