package B3.A11;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class A11_e {
    public static void main(String[] args) {
        //Berechnung der Summe der uersten 1
        System.out.print(IntStream.iterate(1,i -> i+2).limit(10).sum());
    }
}
