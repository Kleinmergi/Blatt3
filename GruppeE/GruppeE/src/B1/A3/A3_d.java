package B1.A3;

public class A3_d {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.err.println("Fehler");
            return;
        }
        else{
            if(args[0].equals(args[1]) == true){
                System.out.print("Zeichenketten sind gleich");
            }else{
                System.out.print("Zeichenketten sind nicht gleich");
            }
        }
    }
}
