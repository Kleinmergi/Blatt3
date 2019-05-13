package B3.A11;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A11_c {
    public static void main(String[] args) {
        //Anlegen eines neuen Streams
        Stream.generate(
                new Random(100)::nextInt)
                .limit(10)
                .sorted()
                .forEach(i -> System.out.println(i));
        }
}
