package sorting;

import static sorting.Sample.*;

public class Insertion {

    public static void sort(int[] a) {
        //sorting a by ascending
        int N = a.length;
        for(int i=1; i<N; i++) {
            //insertion a[i] among a[i-1], a[i-2], a[i-3], ...
            for(int j = i; j > 0 && less(a[j],a[j-1]); j--) {
                exch(a, j, j-1);
            }
        }
    }
}
