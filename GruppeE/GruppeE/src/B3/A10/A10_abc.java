package B3.A10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class A10_abc {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 100) + 1;

        //Liste anlegen
        ArrayList<Integer> list = new ArrayList<>();
        //Zahlen in Liste speichern
        for (int i = 0; i < n; i++) {
            list.add(Integer.valueOf((int) (Math.random() * 1000) + 1));
        }

        //Nicht verlangte Funktion zu übersicht
        printList(list);

        // Prüfe Anzahl der Elemente und gebe Mitte aus
        if (list.size() % 2 != 0) {
            System.out.println("In der Mitte der Liste liegt: " + list.get(list.size() / 2));
        } else {
            System.out.println("Anzahl der Elemente ist gerade");
        }

        //Gib wenn beinhaltet den Index von 500 aus
        Integer fiveHundred = Integer.valueOf(500);

        if (list.indexOf(fiveHundred) != -1) {
            System.out.println("500 liegt in der Liste auf Position: " + list.indexOf(fiveHundred));
        } else {
            System.out.println("500 nicht vorhanden");
        }

        //gib Maximum der Liste aus
        System.out.println("Das Maximum der Liste ist (über Collections): " + max_a(list));
        System.out.println("Das Maximum der Liste ist (über forEach): " + max_b(list));
        System.out.println("Das Maximum der Liste ist (über for): " + max_c(list));
    }


    //Bestimme Maximum einer Liste über Integer
    static Integer max_a(ArrayList<Integer> list) {
        Integer max = Collections.max(list);
        return max;
    }


    //Bestimme Maximum einer Liste über forEach
    static int max_b(ArrayList<Integer> list) {
        int max = 0;
        for (Integer i : list) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    //Bestimme Maximum einer Liste über for
    static int max_c(ArrayList<Integer> list) {
        Integer max = Integer.valueOf(0);
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }

    //Nicht verlangte Funktion zu übersicht
    public static void printList(ArrayList<Integer> list) {
        list.forEach(t -> {
            System.out.print(t + " ");
        });
        System.out.print('\n');
    }
}


