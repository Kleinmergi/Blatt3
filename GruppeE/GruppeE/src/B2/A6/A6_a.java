package B2.A6;

import java.util.Random;

public class A6_a {
    public static void main(String[] args) {
        Character c;
        Random r = new Random();

        c = Character.valueOf((char)(r.nextInt()%256));

        System.out.println(Character.getName(c));
        System.out.println(c.charValue());
        if(Character.isLowerCase(c))
        System.out.println("Der zugehörige Großbuchstebe ist: " + Character.toTitleCase(c));
    }
}
