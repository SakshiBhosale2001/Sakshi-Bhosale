package NumberPrograms;

import java.util.Scanner;

public class Pelindrome3 {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        String reverse="";
        String s=sc.next();
        for(int i=(s.length())-1;i>=0;i--)
        {
            reverse=reverse+s.charAt(i);
        }
        if(reverse.equals(s))
            System.out.println("Pelindrome");
        else
            System.out.println("Not Pelindrome");
    }
}
