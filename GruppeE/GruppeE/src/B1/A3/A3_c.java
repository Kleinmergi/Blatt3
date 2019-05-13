package B1.A3;

public class A3_c {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.err.println("Fehler");
            return;
        }
        else{
                if(args[0].indexOf("x") >= 0){
                    System.out.print(args[0].indexOf("x"));
                }
        }
    }
}

