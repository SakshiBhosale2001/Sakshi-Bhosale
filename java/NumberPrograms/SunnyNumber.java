package NumberPrograms;

import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        int n=sc.nextInt();
        int n1=n+1;
        int sqr = 0;
        for (int i=0;i<n;i++)
        {
            sqr=i*i;
            if (sqr==n1) {
                System.out.println(n + " is SunnyNumber ");
                break;
            }
        }
        if(sqr!=n1)
         System.out.println(n+" Not a SunnyNumber ");
    }
}
