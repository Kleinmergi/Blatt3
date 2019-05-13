package B3.A10;

import java.util.TreeSet;

public class A10_df {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 100) + 1;

        //Set anlegen
        TreeSet<Integer> set = new TreeSet<Integer>();

        //Zahlen in Set speichern
        for (int i = 0; i < n; i++) {
            set.add(Integer.valueOf((int) (Math.random() * 1000) + 1));
        }

        //Nicht verlangte Funktion zu Übersicht
        printset(set);

        // Prüfe Anzahl der Elemente
        if (set.size() % 2 == 0) {
            System.out.println("Die Anzahl der Elemente ist gerade");
        } else {

            System.out.println("Die Anzahl der Elemente ist ungerade");
        }

        //Prüfe und gib aus ob set 500 beinhaltet
        Integer fiveHundred = Integer.valueOf(500);
        boolean drin = false;

        for (Integer i : set) {
            if (i.equals(fiveHundred)) {
                drin = true;
            }
        }

        if (drin) {
            System.out.println("500 vorhanden");
        } else {
            System.out.println("500 nicht vorhanden");
        }
        System.out.println("Das Maximum des Sets ist(über forEach): " + max_d(set));
        System.out.println("Das Maximum des Sets ist(über for): " +max_f(set));
        //Nicht verlangte Funktion zu Übersicht
        printset(set);

    }


    static Integer max_d(TreeSet<Integer> set){
        Integer max = 0;
        for(Integer i : set ){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    static Integer max_f(TreeSet<Integer> set){
        Integer max = 0;
        set
                .stream()
                .sorted();
        for(Integer i : set ){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    //Nicht verlangte Funktion zur Übersicht
    private static void printset(TreeSet<Integer> set) {
        set.forEach(t -> System.out.print(t + " "));
        System.out.print('\n');
    }
}
