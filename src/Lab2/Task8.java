package Lab2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double [] a = new double[5];
        for(int i = 0; i < 5; i++)
            a[i] = in.nextDouble();
        for(int i = 0; i < 5; i++)
            if(a[i] < 0)
                System.out.println(a[i]);
    }
}
