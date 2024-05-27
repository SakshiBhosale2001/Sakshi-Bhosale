package NumberPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class KeithNumber {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to check :");
        int num=sc.nextInt();
        int temp=num;
        String str=String.valueOf(num);
        ArrayList<Integer> s = new ArrayList<>();
        if(str.length()>=3) {
            while (num > 0) {
                for (int i = 0; i < str.length(); i++) {
                    String s1 = String.valueOf(num);
                    int r = Math.floorDiv(num, (int) Math.pow(10, (s1.length() - 1)));
                    s.add(r);
                    num = num % (int) Math.pow(10, (s1.length() - 1));
                }
            }
            int i = 0;
            while (i <= temp) {
                int n1 = s.get(i) + s.get(i + 1) + s.get(i + 2);
                s.add(n1);
                if (n1 == temp) {
                    System.out.println(temp + " is a keith number ");
                    break;
                } else if (n1 >= temp) {
                    System.out.println(temp + " is not a keith number ");
                    break;
                }
                i++;
            }
        }
        else
            System.out.println("Enter Number 3 digit more than 3 digit  ");
    }
}
