package B2.A6;

import java.util.Random;

public class A6_c {
    public static void main(String[] args) {
        double a, x;
        int n;
        Double d, e;

        Random r = new Random();
        a = Math.random();
        n = r.nextInt()%1000;
        x = Math.pow(a,n);

        if(Double.isFinite(x)) System.out.println("Zahl kann normalisiert dargestellt werden");
        else System.out.println("Zahl kann nicht normalisiert dargestellt werden");

        if(Double.isNaN(1/x)) System.out.println("Der reziproke Wert ist keine Zahl");
        else System.out.println("Der reziproke Wert ist eine Zahl");

        if(Double.isInfinite(1/x)) System.out.println("Der reziproke Wert ist unendlich");
        else System.out.println("Der reziproke Wert ist endlich");

        if(Double.isNaN(1/x)) System.out.println("Der reziproke Wert ist keine Zahl");
        else System.out.println("Der reziproke Wert ist eine Zahl");

        d = Double.valueOf(x);
        System.out.println(d.doubleValue());
        e = Double.valueOf(1/x);
        System.out.println((int)e.doubleValue());
    }
}
