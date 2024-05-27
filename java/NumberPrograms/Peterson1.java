package NumberPrograms;

import java.util.Scanner;

public class Peterson1 {
    public static boolean peterson(int n)
    {
        int fact=1,sum=0,temp=n,r;
        while(n>0) {
            r = n % 10;
            for (int i = 1; i <= r; i++) {
                fact = fact * i;
            }
            sum += fact;
            fact=1;
            n = n / 10;
        }
         return (temp==sum);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number : ");
        int x=sc.nextInt();
        System.out.println("Enter ending number : ");
        int y=sc.nextInt();
        System.out.println("-----------------------------Printing Peterson numbers -------------------------------");
        for(int i=x;i<=y;i++)
        {

            if(peterson(i))
            {
                System.out.println(i);
            }
        }
    }
}
