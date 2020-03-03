package Task5;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(12,21,"blue");
        System.out.println(c1);
        Circle c2 = new Circle(17,"red");
        c1.setBase(c2);
        System.out.println(c1);
    }
}
