package Lab1;

public class TestComplex {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(4,6);
        System.out.println(c1);
        String s1 = "-2 - i3";
        ComplexNumber c2 = c1.Parse(s1);
        System.out.println(c2);
        ComplexNumber c3 = c1.Plus(c2);
        System.out.println(c3);
    }
}
