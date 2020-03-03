package Lab2;

import java.util.Scanner;

public class Task4 {
    public static double form(double x, double y){
        double Y = Math.sin(x) + Math.cos(y) - Math.pow(2, Math.sin(x) + Math.cos(y));
        return Y;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.println(form(x,y));
    }
}
