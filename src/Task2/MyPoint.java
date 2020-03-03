package Task2;

public class MyPoint {
    private int x;
    private int y;
    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){ return y; }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setXY (int x,int y){
        this.x = x;
        this.y = y;
    }
    public int[] getXY ()
    {
        return new int[]{this.x,this.y};
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double distance(MyPoint p) {
        int xDiff = this.x - p.x;
        int yDiff = this.y - p.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double distance() {
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }
}
