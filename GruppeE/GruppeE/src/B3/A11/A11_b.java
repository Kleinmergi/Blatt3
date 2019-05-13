package B3.A11;

import java.util.Random;
import java.util.stream.IntStream;

public class A11_b {
    public static void main(String[] args) {
        //Anlegen eines neuen Streams
        IntStream stream = new Random().ints(500);
        //auf 10 Elemente beschränken, Sortieren, Ausgeben
        stream
                .limit(10)
                .sorted()
                .forEach(i->System.out.println(i));
    }

}
