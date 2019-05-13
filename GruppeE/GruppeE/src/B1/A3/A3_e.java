package B1.A3;

public class A3_e {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.err.println("Fehler");
            return;
        }
        else{
            System.out.println( (args[0].matches( "[0123456789]*")&& args[0].length() == 5 ));
        }
    }
}
