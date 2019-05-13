package B1.A2;

public class A2_d {
    public static void main(String[] args) {
        int counter = 0;
        float mw;
        for(int i = 0; i < 100000000; i++) {
            while (Math.abs(Math.random() - 0.5f) <= 0.4) {
                counter++;
            }
        }
        mw = (float)counter/100000000;
        System.out.print(mw);
    }
}
