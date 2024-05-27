package NumberPrograms;

import java.util.Scanner;

public class Petrson {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is peterson number or not : ");
        int num=sc.nextInt();
        int temp,r,sum=0;
        temp =num;
        while(num>0)
        {
            int rem=0;
          rem=num%10;
          int fact=1;
          for(int i=1;i<=rem;i++)
          {
                fact=fact*i;
          }
          sum+=fact;
          num=num/10;
        }
        if(temp==sum)
        {
            System.out.println("Number is Peterson Number ...");
        }
        else
            System.out.println("Number is Not Peterson Number ...");

    }
}
