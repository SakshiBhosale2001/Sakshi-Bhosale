package JavaMisc;

import java.util.Scanner;

public class Recursion {
    public static void main(String [] args){
        char[] c={'B','D','O','P','Q','R'};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String in Capital Only : ");
        String s=sc.next();
        int count=0;
        char[] s1=s.toCharArray();
        for(int i:s1)
        {
            for(int j=0;j<c.length;j++)
            {
                if (i == c[j])
                {
                    count +=1;
                }
            }
            if(i=='B')
            {
                count +=1;
            }
        }
        System.out.println("Count : "+count);
    }
}
