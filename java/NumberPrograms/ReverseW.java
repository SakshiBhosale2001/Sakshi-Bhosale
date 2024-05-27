package NumberPrograms;

import java.util.Scanner;

public class ReverseW {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int reverse=0,r;
        System.out.println("Enter number to reverse : ");
        int num=sc.nextInt();
        while(num>0)
        {
            r=num%10;
            reverse=(reverse*10)+r;
            num=num/10;
        }
        System.out.println(reverse);
    }
}
