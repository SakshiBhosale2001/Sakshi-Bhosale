package NumberPrograms;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args)
    {
        //without Recursion
        int n1=0,n2=1,n3=0;
        int[] sum=new int[10];
        for(int i=0;i<10;i++)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            sum[i]=n3;
        }
        for(int i:sum)
            System.out.println(i);


    }

}