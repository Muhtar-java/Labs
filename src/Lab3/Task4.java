package Lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static char[] vowels = new char[]{'а','я','у','ю','и','ы','э','е','о','ё'};

    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);
        for(char d:vowels)
            if(d == c)
                return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        char[] c = s1.replace(" ","").toCharArray();
        List<Character> vowels = new ArrayList<>();
        for(char arr : c)
            if(isVowel(arr))
                vowels.add(arr);
        System.out.println(vowels.size());
    }
}
