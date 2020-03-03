package Lab1;

public class TestFraction {
    public static void main(String[] args) {
        Fraction d1 = new Fraction(2,3,0,1);
        Fraction d2 = new Fraction(4,5,2,-1);
        Fraction d3 = new Fraction(4,3,1,1);
        Fraction d4 = new Fraction(10,6);
        Fraction d5 = new Fraction(3,7);
        Fraction d6 = new Fraction(1.250250);
        double a = 0.33;
        Fraction d7 = d1.Plus(d1, a);
        System.out.println(d7);
        System.out.println(d6);
    }
}
