package Lab2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task5 {
    public static double Max(double a, double b){
        if(a > b)
            return a;
        return b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble(), d = in.nextDouble();
        System.out.println(Max(a,Max(b,Max(c,d))));
    }
}
