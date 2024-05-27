package NumberPrograms;

import java.util.Scanner;

public class Armstrong1 {
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
        System.out.println("Set a limit : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            if(armstrong(i))
               System.out.println(i);

        }
    }
}
