package NumberPrograms;

import java.util.Scanner;

public class ReverseF {
    public static void main(String[] args)
    {
        int r,reverse=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to reverse : ");
        int num=sc.nextInt();
        for(;num>0;num=num/10)
        {
            r=num%10;
            reverse=(reverse*10)+r;
            //num=num/10;

        }
        System.out.println(reverse);
    }
}
