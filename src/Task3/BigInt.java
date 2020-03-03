package Task3;

import java.math.BigInteger;

public class BigInt {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("2222222222222222222222222222222222222");
        BigInteger b2 = new BigInteger("2222222222222222222222222222222222222");
        BigInteger b3 = new BigInteger("0");
        b3 = b1.add(b2.abs());
        System.out.println(b3.abs());
        b3 = b1.multiply(b2.abs());
        System.out.println(b3.abs());
    }
}
