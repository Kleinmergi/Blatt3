package B3.A11;

import java.util.stream.IntStream;

public class A11_f {
    public static void main(String[] args) {
        System.out.print( "10! = "+
                IntStream
                        .rangeClosed(1,10)
                        .reduce((i,j) ->  i*j)
                        .getAsInt()
        );
    }
}
