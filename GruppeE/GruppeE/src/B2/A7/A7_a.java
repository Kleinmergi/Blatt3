package B2.A7;
import java.awt.*;
import java.lang.String;

public class A7_a {
    public static void main(String[] args) {
        String s = "";

        for(int i = 0; i < args.length; i++) {
            s = s + args[i];
        }

       String[] einzelne = s.split("-");

        for(int j = 0; j < einzelne.length; j++){
            System.out.println(einzelne[j]);
        }
    }
}
