package NumberPrograms;
import java.util.Scanner;
import java.lang.Long;

public class Automorphic {
    public static void main(String[] args) {
//Automorphic number base on number itself
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Limit upto 100000000000000L only : ");
        Long n = sc.nextLong();
        Double sqr;
        System.out.println("Number  Square  Last Digit");
        for (Long i = 0L; i <= n; i++) {
            sqr = Math.pow(i, 2);
            Long s = Double.valueOf(sqr).longValue();
            String s1 = String.valueOf(s);
            String s2=String.valueOf(i);
            int len1 = s1.length();
            int len2=s2.length();
            Long d=1L;
            // Long[] t = {1L,1L, 10L, 100L, 1000L, 10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L};
            if(len1>=len2 && s1.substring(len1-len2).equals(s2))
            {
                System.out.println(i+"      "+s);
            }

        }
        if ((n * n) > 100000000000000L)
            System.out.println("-----Length exceeds ------\n Enter digit upto 100000000000000L only ");


    }
}
