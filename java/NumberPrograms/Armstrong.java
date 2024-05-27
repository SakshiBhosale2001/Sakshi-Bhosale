package NumberPrograms;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count,r,sum,temp;
       sum=0;
       count=0;
       temp=n;
        while(n!=0) {
            count = count + 1;
            n = n / 10;
        }
        n=temp;
        while(n>0)
        {
            r=n%10;
            sum+=Math.pow(r,count);
            n=n/10;
        }
        if(sum==temp)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
    }
}
