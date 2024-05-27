package NumberPrograms;

import java.util.Scanner;

public class ReverseR {
    static void Reverse(int n)
    {
        if(n<10)
        {
            System.out.print(n);
        }
        else
        {
            System.out.print(n%10);
            Reverse(n/10);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=sc.nextInt();
        Reverse(num);
    }
}
