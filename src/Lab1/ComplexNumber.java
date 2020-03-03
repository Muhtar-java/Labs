package Lab1;

import org.omg.CORBA.StringHolder;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComplexNumber {
    public int x;
    public int y;

    public ComplexNumber(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ComplexNumber() {
        x = 0;
        y = 0;
    }

    public boolean isEqual(ComplexNumber ob2) {
        if (this.x != ob2.x || this.y != ob2.y)
            return false;
        else
            return true;
    }

    public boolean isNotEqual(ComplexNumber ob2) {
        if (this.x == ob2.x && this.y == ob2.y)
            return false;
        return true;
    }

    public boolean isGreater(ComplexNumber ob2) {
        if (this.x <= ob2.x && this.y <= ob2.y)
            return false;
        return true;
    }

    public boolean isGreaterOrEq(ComplexNumber ob2) {
        if (this.x < ob2.x && this.y < ob2.y)
            return false;
        return true;
    }

    public ComplexNumber Plus(ComplexNumber ob2) {
        ComplexNumber c1 = new ComplexNumber(this.x + ob2.x, this.y + ob2.y);
        return c1;
    }

    public void finalize() {
        System.out.println("Комплексное число унижтожена!");
    }

    public String toString() {
        if(this.y < 0)
            return this.x + " - " + "i" + Math.abs(this.y);
        else
            return this.x + " + " + "i" + this.y;
    }
    public ComplexNumber Parse(String str) {
        int x = 0, y = 0;
        String [] str1 = str.split("\\s+");
        x = Integer.parseInt(str1[0]);
        y = Integer.parseInt(str1[2].replaceAll("\\D",""));
        if(str1[1].charAt(0) == '-')
            y *= -1;
        ComplexNumber c1 = new ComplexNumber(x, y);
        return c1;
    }
}