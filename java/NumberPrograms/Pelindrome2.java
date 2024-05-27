package NumberPrograms;

import java.util.Scanner;

public class Pelindrome2 {
    public static void main(String[] args){
        int r,sum=0,temp;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(sum==temp)
            System.out.println("Pelindrome Number");
        else
            System.out.println("Not Pelindrome");
    }
}
