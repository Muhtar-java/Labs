package Lab1;

public class Fraction {
    private int sign;
    private int intPart;
    private int numerator;
    private int denominator;
    public Fraction (int n, int d, int i, int s){
        intPart = i;
        numerator = n;
        denominator = d;
        sign = s;
        GetMixedView();
    }
    public Fraction(){
        intPart = 0;
        numerator = 0;
        denominator = 1;
        sign = 1;
    }
    public Fraction (int n, int d){
        intPart = 0;
        numerator = n;
        denominator = d;
        sign = 1;
        GetMixedView();
    }
    public Fraction(double a) {
        String s = String.valueOf(a);
        int digitsDec = s.length() - 1 - s.indexOf('.');
        int denom = 1;
        for(int i = 0; i < digitsDec; i++) {
            a *= 10;
            denom *= 10;
        }
        numerator = (int)a%denom;
        denominator = denom;
        intPart = Math.abs((int)a/denom);
        sign = (int)a/Math.abs((int)a);
        GetMixedView();
    }
    public void GetMixedView() {
        GetIntPart();
        Cancellation();
    }
    public void GetIntPart(){
        if(numerator >= denominator)
        {
            intPart += (numerator / denominator);
            numerator %= denominator;
        }
    }
    public void Cancellation(){
        if(numerator != 0) {
            int m = denominator;
            int n = numerator;
            int ost = m%n;
            while (ost != 0){
                m = n;
                n = ost;
                ost = m%n;
            }
            int nod = n;
            if(nod != 1){
                numerator /= nod;
                denominator /= nod;
            }
        }
    }
    public double Explicit(){
        double res = (double)this.sign * (((double)this.intPart * (double)this.denominator + (double)this.numerator) / (double)this.denominator);
        return res;
    }
    public boolean isEqual(Fraction ob2){
        if (this.sign != this.sign || this.intPart != ob2.intPart || this.numerator * this.denominator != ob2.numerator * ob2.denominator)
            return false;
        else
            return true;
    }
    public boolean isNotEqual(Fraction ob2){
        if (this.sign == ob2.sign || this.intPart == ob2.intPart || this.numerator * this.denominator == ob2.numerator * ob2.denominator)
            return false;
        else
            return true;
    }
    public boolean isGreater1(Fraction ob2) {
        if(this.Explicit() <= ob2.Explicit())
            return false;
        return true;
    }
    public boolean isGreater2(Fraction ob2) {
        if(this.Explicit() >= ob2.Explicit())
            return false;
        return true;
    }
    public boolean isGreaterOrEq1(Fraction ob2) {
        if(this.Explicit() < ob2.Explicit())
            return false;
        return true;
    }
    public boolean isGreaterOrEq2(Fraction ob2) {
        if(this.Explicit() > ob2.Explicit())
            return false;
        return true;
    }
    public boolean isEqual(double a){
        if (this.sign != a/Math.abs(a) || this.Explicit() != a)
            return false;
        else
            return true;
    }
    public boolean isNotEqual(double a){
        if (this.sign == a/Math.abs(a) || this.Explicit() == a)
            return false;
        else
            return true;
    }
    public boolean isGreater1(double a) {
        if(this.Explicit() <= a)
            return false;
        return true;
    }
    public boolean isGreater2(double a) {
        if(this.Explicit() >= a)
            return false;
        return true;
    }
    public boolean isGreaterOrEq1(double a) {
        if(this.Explicit() < a)
            return false;
        return true;
    }
    public boolean isGreaterOrEq2(double a) {
        if(this.Explicit() > a)
            return false;
        return true;
    }
    public Fraction Plus(Fraction ob2) {
        Fraction res = new Fraction();
        res.numerator = this.sign * (this.intPart * this.denominator + this.numerator) * ob2.denominator + ob2.sign * (ob2.intPart
            * ob2.denominator + ob2.numerator) * this.denominator;
        res.denominator = this.denominator * ob2.denominator;
        if(res.numerator < 0) {
            res.numerator *= -1;
            res.sign = -1;
        }
        res.GetMixedView();
        return res;
    }
    public Fraction Plus(int a) {
        if( a == 0)
            return this;
        Fraction ob2 = new Fraction(0, 1, Math.abs(a),  a/Math.abs(a));
        Fraction res = new Fraction();
        res = this.Plus(ob2);
        return res;
    }
    public Fraction Plus(Fraction ob,double a) {
        if( a == 0 )
            return this;
        double b = a + ob.Explicit();
        b *= 100;
        b= Math.round(b);
        b /= 100;
        return ob.FromDouble(b);
    }
    public Fraction Sub(Fraction ob,double a) {
        if( a == 0 )
            return this;
        double b = ob.Explicit() - a;
        b *= 100;
        b= Math.round(b);
        b /= 100;
        return ob.FromDouble(b);
    }
    public Fraction Sub(double a, Fraction ob) {
        if( a == 0 )
            return this;
        double b = a - ob.Explicit();
        b *= 100;
        b= Math.round(b);
        b /= 100;
        return ob.FromDouble(b);
    }
    public Fraction Mult(Fraction ob, double a) {
        double b = a * ob.Explicit();
        b *= 100;
        b= Math.round(b);
        b /= 100;
        return ob.FromDouble(b);
    }
    public Fraction Div(Fraction ob, double a) {
        double b = a / ob.Explicit();
        b *= 100;
        b= Math.round(b);
        b /= 100;
        return ob.FromDouble(b);
    }
    public Fraction Div(double a,Fraction ob) {
        double b = ob.Explicit() / a;
        b *= 100;
        b= Math.round(b);
        b /= 100;
        return ob.FromDouble(b);
    }
    public Fraction FromDouble(double a) {
        String s = String.valueOf(a);
        int digitsDec = s.length() - 1 - s.indexOf('.');
        int denom = 1;
        for(int i = 0; i < digitsDec; i++) {
            a *= 10;
            denom *= 10;
        }
        Fraction f1 = new Fraction((int)a%denom,denom,Math.abs((int)a/denom),(int)a/Math.abs((int)a));
        return f1;
    }
    public void finalize(){
        System.out.println("Дробь унижтожена!");
    }
    public String toString(){
        if(this.sign < 0)
            return "-" + this.intPart + " " + this.numerator + "/" + this.denominator;
        else
            return this.intPart + " " + this.numerator + "/" + this.denominator;
    }
}
