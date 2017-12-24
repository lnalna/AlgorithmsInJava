package sorting;

/**
 * Created by nik on 24.12.17.
 */
public class Sample {

    public static int[] a = {1,10,8,20,25,12,3,15,2};

    public static boolean less(int v, int w) {
        return (v-w) < 0;
    }

    public static void exch(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        //Selection.sort(a);
        Insertion.sort(a);

        for(int i = 0; i < a.length ; i++)
            System.out.println(a[i]);
    }
}
