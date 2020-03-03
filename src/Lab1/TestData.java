package Lab1;

public class TestData {
    public static void main(String[] args) {
        Data d1 = new Data(2019,9,28);
        String s = "2018/02/23";
        Data d2 = d1.Parse(s);
        Data d3 = d1.Sub(d2);
        System.out.println(d3);
        d3.PlusDay(237);
        Data d4 = new Data(2018,25,67);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
    }
}
