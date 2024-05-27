package NumberPrograms;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to check whether it is Neon or not : ");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        if(num>0)
        {
            num=num*num;
            while(num>0)
            {
                int r=num%10;
                sum+=r;
                num=num/10;
            }
            if(temp==sum)
            {
                System.out.println("Number is Neon Number");
            }
            else
                System.out.println("Number is not a Neon Number");
        }
        else
            System.out.println("Please enter a Positive Number ");
    }
}
