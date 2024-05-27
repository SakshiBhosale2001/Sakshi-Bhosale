package NumberPrograms;

import java.util.Scanner;

public class Pelindrome {
    public static void main(String[] args){
        int sum=0,i;
        String s;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder temp=new StringBuilder();
        temp=temp.append(n);
        temp.reverse();
        s=temp.toString();
        i=Integer.valueOf(s);
        System.out.println(temp.getClass().getSimpleName());
        if(n==i)
            System.out.println("Pelindrome");
        else
            System.out.println("Not Pelindrome");
    }
}
