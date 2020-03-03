package Lab2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] a = new int[5];
        for(int i = 0; i < 5; i++)
            a[i] = in.nextInt();
        int sum = 0;
        for(int i = 0; i < 5; i++)
            if(a[i] > 0)
                sum += a[i];
        System.out.println(sum);
    }
}
