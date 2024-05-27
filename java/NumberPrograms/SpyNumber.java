package NumberPrograms;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        int num=sc.nextInt();
        int sum=0,mul=1;
        while(num>0)
        {
            int r=num%10;
            sum+=r;
            if(r!=0) {
                mul *= r;
            }
                num = num / 10;
        }
        if (sum==mul)
        {
            System.out.println("Number is Spy Number ");
        }
        else
            System.out.println("Number is Not spy Number ");
    }
}
