package B1.A4;

import java.util.Random;

public class A4 {
    public static void main(String[] args) {
        int x = myRandom();
        System.out.println("mySum("+ x +")=" + mySum(x));
        System.out.println("mySum("+ x +")=" + mySecSum(x));
        System.out.println("myGt("+ x +")=" + myGt(x));
    }

    public static int myRandom(){
        Random r = new Random();
        return r.nextInt(10000)+1;
    }

    public static int mySum(int x)
    {
        if(x > 0){
            if(x % 2 != 0){
                return ((x+1)*(x+1)/4);
            }else{
                return(x*x/4);
            }
        }
        else return -1;
    }

    public static int mySecSum(int x){
        int aus = 0;
        for(int i = 0; i <= x; i++){
            aus +=  (i % 2) * i;
        }
        return aus;
    }

    public static int myGt(int x){
        int teiler = x/2;
        while(x % teiler != 0)
        {
            teiler --;
        }
        return teiler;
    }
}
