package Task5;

public class Cylinder {
    private Circle base;
    private double height;
    public Cylinder() {
        base = new Circle();
        height = 5.0;
    }
    public Cylinder(double radius){
        base = new Circle(radius);
        height = 5.0;
    }
    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height, String color){
        base = new Circle(radius, color);
        this.height = height;
    }
    public double getRadius() { return base.getRadius(); }
    public String getColor(){ return base.getColor();}
    public double getHeight(){ return height;}
    public void setBase(Circle base) { this.base = base; }
    public Circle getBase() { return base; }
    public void setHeight(double height) { this.height = height; }
    public String toString() { return "Cylinder[radius = " + base.getRadius() + " ,color = " + base.getColor() + " ,height = " + height + "]"; }
}
