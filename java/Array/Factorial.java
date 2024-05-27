package Array;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        int f=1;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            f=f*i;
        }
        System.out.println(f);
    }
}
