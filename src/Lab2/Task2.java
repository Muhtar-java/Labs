package Lab2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Task2 {
    public static final void swap (int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static int Middle(int[] a){
        for(int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i])
                    swap(a, j, i);
            }
        }
        return a[a.length/2];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int [] a = new int[size];
        for(int i = 0; i < size; i++)
            a[i] = in.nextInt();
        System.out.println(Middle(a));
    }
}
