package B2.A6;

import java.util.Random;

public class A6_b {
    public static void main(String[] args) {
        int k;

        Random r = new Random();
        k = r.nextInt();

        System.out.println(k + " = ("+Integer.toBinaryString(k) + ")²" + " = ("+Integer.toOctalString(k) + ")⁸" +" = ("+Integer.toHexString(k) + ")¹⁶" );
        System.out.println(Integer.bitCount(k));
        System.out.println(Integer.numberOfLeadingZeros(k));
        System.out.println(Integer.reverse(k));
    }
}
