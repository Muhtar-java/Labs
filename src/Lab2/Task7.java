package Lab2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        if(a > b)
            System.out.println(Math.pow(a,b) + a - b);
        if(a == b)
            System.out.println(Math.pow(a-b,a+b));
        if(a < b)
            System.out.println(Math.pow(a+b,a-b));
    }
}
