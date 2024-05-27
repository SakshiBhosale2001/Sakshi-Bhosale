package NumberPrograms;

import java.util.Scanner;

public class SunnyNumber2
{
    public static boolean number1(int n1)
    {
        double sqrt=(Math.sqrt(n1));
        return (sqrt-Math.floor(sqrt)==0);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Starting number : ");
        int x=sc.nextInt();
        System.out.println("Enter a Ending number : ");
        int y=sc.nextInt();
        for(int i=x;i<=y;i++)
        {
            if(number1(i+1))
                System.out.println(i);
            else
                System.out.print("");
        }
    }
}
