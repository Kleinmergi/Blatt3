package B3.A11;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class A11_d {
    public static void main(String[] args) {
        int n = new Random().nextInt() % 10000 + 1;
        System.out.print(n + " hat genau "+2*
                IntStream.rangeClosed(2,(int)(Math.sqrt(Math.abs(n))))
                .filter(i-> n % i == 0)
                .count()+
                " echte Teiler.");
    }
}
