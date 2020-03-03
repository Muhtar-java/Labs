package Lab2;

import java.util.Scanner;

public class Task6 {
    public static void ans(double a, double b, double c){
        double D = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(D))/(a*2);
        double x2 = (-b - Math.sqrt(D))/(a*2);
        System.out.println("X1 = " + x1 + " ,X2 = " + x2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        ans(a,b,c);
    }
}
