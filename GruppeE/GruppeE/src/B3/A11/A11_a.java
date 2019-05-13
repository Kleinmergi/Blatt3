package B3.A11;

import java.util.ArrayList;

public class A11_a {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 100) + 1;

        //Liste anlegen
        ArrayList<Integer> list = new ArrayList<>();
        //Zahlen in Liste speichern
        for (
                int i = 0;
                i < n; i++) {
            list.add(Integer.valueOf((int) (Math.random() * 1000) + 1));
        }

        //Lösche alle ungeraden
        list.removeIf(i -> i % 2 != 0);

        list.forEach(I-> {if(I > 900){System.out.print(I.intValue()+"\t");}});

    }

}
