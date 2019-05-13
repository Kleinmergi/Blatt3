package B2.A7;

public class A7_b {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("");

        for(int i = 0; i < args.length; i++){
            s.insert(0,args[i]);
        }

        s.reverse();
        s = new StringBuilder(s.toString().replace('-','_'));
        System.out.println(s);
    }
}
