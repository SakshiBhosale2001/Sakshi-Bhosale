package NumberPrograms;
import java.lang.Math;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class Random1 {
    public static void main(String[] args)
    {
        //generating through random class
        Random r=new Random();
        int x=r.nextInt(300);
        System.out.println(x);      //similarly for all type


        //generating through ThreadLocalRandom class between 0to 900
        int d=ThreadLocalRandom.current().nextInt();
        System.out.println(d);

        System.out.println(Math.random());  //generate only in range 0.0 to 1.0
        // to generate in specific range
        int min=100000;
        int max=900000;
        System.out.println(Math.random()*(max-min+1)+min);//generate double value
        int b=(int)(Math.random()*(max-min+1)+min);
        int a=(int)(Math.random()*(max-min+1)+min);
        //String c=String.valueOf(a)+String.valueOf(b);
        System.out.println(a);
    }
}
