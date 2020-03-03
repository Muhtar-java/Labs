package Lab2;

import java.util.Scanner;

public class Task1 {
    public static double formula(double a, double b, double c){
            double y = a + Math.pow(b, c);
            return y;
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        double a = s1.nextDouble();
        double b = s1.nextDouble();
        double c = s1.nextDouble();
        System.out.println(formula(a,b,c));
    }
}
