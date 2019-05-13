package B1.A3;

public class A3_b {
    public static void main(String[] args) {
        if(args.length == 0) System.out.print("Keine Kommandozeilenparameter");
        else{
             System.out.print(args[0].charAt(args[0].length()-1));
            }
    }
}

