package NumberPrograms;

import java.util.Scanner;

public class TechNumber
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to check");
        int x=sc.nextInt();
        String s=String.valueOf(x);
        int len=s.length();
        if(len%2==0)
        {
            int n1= (int) (x%Math.pow(10,(len/2)));
            int n2=(int)(x/Math.pow(10,(len/2)));
            int temp=n1+n2;
            if(Math.pow(temp,2)==x)
                System.out.println(x+" is Tech Number ");
            else
                System.out.println(x+" is not a Tech number");
        }
        else
            System.out.println(x+" is not a Tech number");
    }
}
