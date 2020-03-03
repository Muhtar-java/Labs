package Lab1;

public class Triangle {
        private MyPoint v1;
        private MyPoint v2;
        private MyPoint v3;
        public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
            v1 = new MyPoint(x1, y1);
            v2 = new MyPoint(x2, y2);
            v3 = new MyPoint(x3, y3);
        }
        public Triangle(MyPoint v1, MyPoint v2, MyPoint v3) {
            this.v1 = v1;
            this.v2 = v2;
            this.v3 = v3;
        }
        public String toString(){
            return "MyTriangle[v1 =(" + v1.getX() + ", " + v1.getY() + ") ,v2 =(" + v2.getX() + ", " + v2.getY() + "), v3 =(" + v3.getX() + ", " + v3.getY() + ")]";
        }
        public double getPerimeter(){ return v1.distance(v2) + v2.distance(v3) + v3.distance(v1); }
        public double getPerimeter(MyPoint p1, MyPoint p2, int z, int a) {
            MyPoint n1 = new MyPoint(z, a);
            return n1.distance(p1) + p1.distance(p2) + p2.distance(n1);
        }
        public String getType(){
            if(v1.distance(v2) == v2.distance(v3) || v2.distance(v3) == v3.distance(v1) || v3.distance(v1) == v1.distance(v2))
                return "Isosceles";
            if(v1.distance(v2) == v2.distance(v3) && v2.distance(v3) == v3.distance(v1))
                return "Equilateral";
            else
                return "Scalene";
        }
        public boolean isEqual(Triangle t1){
            if(this.getPerimeter() == t1.getPerimeter())
                return true;
            return false;
        }
        public boolean isGreater(Triangle t1){
            if(this.getPerimeter() > t1.getPerimeter())
                return true;
            return false;
        }
        public double getArea(MyPoint p1, MyPoint p2, int x, int y){
            MyPoint p3 = new MyPoint(x,y);
            double per = this.getPerimeter(p1,p2,x,y) / 2;
            return Math.sqrt(per * (per - p1.distance(p2)) * (per - p2.distance(p3)) * (per - p3.distance(p1)));
        }
        public double getArea(){
            double per = this.getPerimeter() / 2;
            return Math.sqrt(per * (per - v1.distance(v2)) * (per - v2.distance(v3)) * (per - v3.distance(v1)));
        }
        public double round(double val, int pl){
            double scale = Math.pow(10,pl);
            return Math.round(val*scale)/scale;
        }
        public boolean isIn(int x, int y){
            double p1 = this.getArea();
            double p2 = this.getArea(v1,v2,x,y);
            double p3 = this.getArea(v1,v3,x,y);
            double p4 = this.getArea(v2,v3,x,y);
            double sum = this.round(p2,1) + this.round(p3,1) + this.round(p4,1);
            if(p1 == sum)
                return true;
            return false;
        }
}