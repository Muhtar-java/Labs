package Task1;

public class Circle {
    private double radius;

    public Circle() {
        radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
    public double getCircumference() {
        return 2*radius*Math.PI;
    }
}
