package B1.A2;

public class A2_e {
    public static void main(String[] args) {
        int counter = 0;

        for(int j = 0; j < 1E6; j++ ) {
          if(Math.random() > 0.99){
              counter++;
          }
        }

        System.out.print(counter);
    }
}
