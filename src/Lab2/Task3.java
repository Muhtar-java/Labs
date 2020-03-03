package Lab2;

import java.awt.*;

public class Task3 {
    public static void point(int x11, int y11, int x12, int y12, int x21, int y21,int x22, int y22) {
        int a1 = y11 - y12;
        int b1 = x12 - x11;
        int a2 = y21 - y22;
        int b2 = x22 - x21;
        int d = a1 * b2 - b1 * a2;
        int xi = 0;
        int yi = 0;
        if(d != 0){
            int c1 = y12 * x11 - x12 * y11;
            int c2 = y22 * x21 - y21 * x22;
            xi = (b1 * c2 - b2 * c1) / d;
            yi = (a2 * c1 - a1 * c2) / d;
        }
        System.out.println("(" + xi + ", " + yi + ")");
    }

    public static void main(String[] args) {
        int x11 = 1;
        int y11 = -5;
        int x12 = -1;
        int y12 = 1;
        int x21 = 1;
        int y21 = -3;
        int x22 = -1;
        int y22 = -2;
        point(x11,y11,x12,y12,x21,y21,x22,y22);
    }
}
