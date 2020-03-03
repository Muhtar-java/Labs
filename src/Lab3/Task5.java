package Lab3;

import java.util.Scanner;

import static javax.print.attribute.standard.MediaSizeName.D;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] c = s.replaceAll("\\D","").toCharArray();
        System.out.println(c.length);
    }
}
