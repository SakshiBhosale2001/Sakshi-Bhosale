package NumberPrograms;

import java.util.Scanner;

public class SunnyNumber1 {
    public static boolean number1(int n1)
    {
        double sqrt=(Math.sqrt(n1));
        return (sqrt-Math.floor(sqrt)==0);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        int num=sc.nextInt();
        if(number1(num+1))
            System.out.println(num+" is SunnyNumber ");
        else
            System.out.println(num+" is Not a SunnyNumber");
    }
}
