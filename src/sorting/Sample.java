package sorting;

/**
 * Created by nik on 24.12.17.
 */
public class Sample {

    public static Comparable[] a = {1,10,8,20,25,12,3,15,2,18,23,37,44,53,62,7,9,11};

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        //Selection.sort(a);
      //  Insertion.sort(a);
        Shell.sort(a);

        for(int i = 0; i < a.length ; i++)
            System.out.println(a[i]);
    }
}
