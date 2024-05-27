package NumberPrograms;

import java.util.Scanner;

public class PrimeNumber {
    static int s=0;
    static void num(int n)
    {
        System.out.println("--------------------By Method-----------------");
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                s=1;
            }

        }
        if(s==0) {
            System.out.println("Prime number");

        }
        else
            System.out.println("Not a prime");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("----------------without method ----------------------");
        if(n==0||n==1)
            System.out.println("Not Prime");
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                s=1;
            }

        }
        if(s==0) {
            System.out.println("Prime number");

        }
        else
            System.out.println("Not a prime");
        num(n);
    }
}
