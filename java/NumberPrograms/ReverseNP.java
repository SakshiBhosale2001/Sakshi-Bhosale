package NumberPrograms;

import java.util.Scanner;

public class ReverseNP {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        Reverse(num);
    }
    static void  Reverse(int n)
    {
        int num=n;
        if(n<0)
        {
            n=n*(-1);
        }
            int r,reverse=0;
            while(n>0)
            {
                r=n%10;
                reverse=(reverse*10)+r;
                n/=10;
            }
            if (num<0)
            {
                reverse=(-1)*reverse;
            }

        System.out.println(reverse);
    }
}
