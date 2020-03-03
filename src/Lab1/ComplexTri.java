package Lab1;

public class ComplexTri extends ComplexNumber{
    double r;
    double f;
    public ComplexTri(double r, double f){
        this.r = r;
        this.f = f;
    }
    public ComplexTri(){
        this.r = 1;
        this.f = 0;
    }
    public boolean isEqual(ComplexTri ob2) {
        if (Math.atan((this.r * (Math.sin(this.f) +  Math.cos(this.f)))) != Math.atan(ob2.r * (Math.sin(ob2.f) +  Math.cos(ob2.f))))
            return false;
        else
            return true;
    }

    public boolean isNotEqual(ComplexTri ob2) {
        if (Math.atan((this.r * (Math.sin(this.f) + Math.cos(this.f)))) == Math.atan(ob2.r * (Math.sin(ob2.f) +  Math.cos(ob2.f))))
            return false;
        return true;
    }

    public boolean isGreater(ComplexTri ob2) {
        if (Math.atan((this.r * (Math.sin(this.f) + Math.cos(this.f)))) <= Math.atan(ob2.r * (Math.sin(ob2.f) +  Math.cos(ob2.f))))
            return false;
        return true;
    }

    public boolean isGreaterOrEq(ComplexTri ob2) {
        if (Math.atan((this.r * (Math.sin(this.f) + Math.cos(this.f)))) < Math.atan(ob2.r * (Math.sin(ob2.f) + Math.cos(ob2.f))))
            return false;
        return true;
    }

    public ComplexTri Mult(ComplexTri ob2) {
        ComplexTri c1 = new ComplexTri(this.r * ob2.r,this.f + ob2.f);
        return c1;
    }
    public ComplexTri Div(ComplexTri ob2) {
        ComplexTri c1 = new ComplexTri(this.r / ob2.r,this.f - ob2.f);
        return c1;
    }
    public void finalize() {
        System.out.println("Комплексное число унижтожена!");
    }

    public String toString() {
        return this.r + " (sin(" + this.f + ") + icos(" + f + "))";
    }
    public ComplexTri Parse(String str) {
        int r1 = 0, f1 = 0 ;
        String [] str1 = str.split("\\s+");
        r1 = Integer.parseInt(str1[0]);
        f1 = Integer.parseInt(str1[4]);
        ComplexTri c1 = new ComplexTri(r1, f1);
        return c1;
    }
    public ComplexTri ToNumber(ComplexNumber ob){
        double r = Math.sqrt(Math.pow(ob.x, 2) + Math.pow(ob.y, 2));
        double f = Math.atan(ob.x / ob.y);
        ComplexTri co = new ComplexTri(r,f);
        return co;
    }
}
