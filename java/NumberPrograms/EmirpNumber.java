package NumberPrograms;

import java.util.Scanner;

public class EmirpNumber {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number to check : ");
        int num=sc.nextInt();
        int count=0;
        if(num==0 || num==1)
            System.out.println("Not prime");
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
              count=1;
            }
        }
        if(count==0)
        {
            String s = String.valueOf(num);
            StringBuilder s1 = new StringBuilder(s);
            int num1 = Integer.parseInt(s1.reverse().toString());
            for(int i=2;i<num1;i++)
            {
                if(num1%i==0)
                {
                    count=1;
                }
            }
            if(count==0)
                System.out.println(num+" is Emirp Number ");
            else
                System.out.println(num+" is not a Emirp Number");
        }
        else
            System.out.println(" Non Prime number can not be Emirp number ...Enter a Prime number");
    }
}
