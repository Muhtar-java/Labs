package Lab1;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(-3,-3,-3,3,3,3,3,-3);
        Rectangle r2 = new Rectangle(-2,2,-2,6,-10,6,-10,2);
        System.out.println(r1.isIn(r2));
    }
}
