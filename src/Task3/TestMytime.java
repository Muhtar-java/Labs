package Task3;

public class TestMytime {
    public static void main(String[] args) {
        MyTime t1 = new MyTime(23, 59, 59);
        System.out.println(t1);
        t1.nextSecond();
        System.out.println(t1);
        t1.previousSecond();
        System.out.println(t1);
    }
}
