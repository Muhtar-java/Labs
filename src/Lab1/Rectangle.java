package Lab1;

public class Rectangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    private MyPoint v4;
    public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
        v4 = new MyPoint(x4, y4);
    }
    public Rectangle(MyPoint v1, MyPoint v2, MyPoint v3, MyPoint v4) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
    }
    public String toString(){
        return "MyRectangle[v1 =(" + v1.getX() + ", " + v1.getY() + ") ,v2 =(" + v2.getX() + ", " + v2.getY() + "), v3 =("
                + v3.getX() + ", " + v3.getY() + "), v4 =(" + v4.getX() + ", " + v4.getY() + ")]";
    }
    public double getPerimeter(){ return 2*(v1.distance(v2) + v2.distance(v3)); }
    public boolean isEqual(Rectangle t1){
        if(this.getArea() == t1.getArea())
            return true;
        return false;
    }
    public boolean isGreater(Rectangle t1){
        if(this.getArea() > t1.getArea())
            return true;
        return false;
    }
    public double getArea(){
        return v1.distance(v2) * v2.distance(v3);
    }
    public double round(double val, int pl){
        double scale = Math.pow(10,pl);
        return Math.round(val*scale)/scale;
    }
    public boolean isIn(Rectangle r1){
        MyPoint r = new MyPoint((v1.getX() + v3.getX())/2,(v1.getY() + v3.getY())/2);
        double d = r.distance(v1);
        if(d > r.distance(r1.v1) || d > r.distance(r1.v2) || d > r.distance(r1.v3) || d > r.distance(r1.v4))
            return true;
        return false;
    }
}
