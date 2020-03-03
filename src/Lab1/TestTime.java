package Lab1;

public class TestTime {
    public static void main(String[] args) {
        Time d1 = new Time(23,9,28);
        String s = "15:02:23";
        Time d2 = d1.Parse(s);
        Time d3 = d1.Sub(d2);
        System.out.println(d3);
        d3.PlusSec(237);
        Time d4 = new Time(54,124,1293);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
    }
}
