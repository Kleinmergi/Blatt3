package B1.A3;

public class A3_a {
    public static void main(String[] args) {
        if(args.length == 0) System.err.println("Kein Kommandozeilenparameter übergeben");
        else{
            int anzahl = 0;
            while(anzahl < args.length){
                anzahl++;
            }
            System.out.println("Es wurden " + anzahl + " Kommandozeilenparameter übergeben.");
        }
    }
}
