package NumberPrograms;

import java.util.Scanner;

public class Armstrong2
{
    static boolean armstrong(int n)
    {
        int count=0;
        int r=0;
        int temp,sum=0;
        temp=n;
        while(temp>0)
        {
            temp=temp/10;
            count=count+1;
        }
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum+=Math.pow(r,count);
            n=n/10;
        }
        //System.out.println(temp);
        if(sum==temp)
            return true;
        else {
            return false;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number : ");
        int n=sc.nextInt();
        if(armstrong(n))
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}


