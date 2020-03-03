package Lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] c = s.replace(" ","").toCharArray();
        List<Character> sum = new ArrayList<>();
        for(char arr: c)
            if(Character.isUpperCase(arr))
                sum.add(arr);
        System.out.println(sum.size());
    }
}
