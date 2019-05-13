package B3.A11;

import java.sql.Array;
import java.util.Arrays;

public class A11_g {
    public static void main(String[] args) {
        Arrays.stream(args)
                .filter(p -> !p.equals(""))
                .forEach(p -> {
                                System.out.println(
                                        p
                                                .toUpperCase()
                                                .replaceAll("[0-9]", ""));
                });
    }
}
