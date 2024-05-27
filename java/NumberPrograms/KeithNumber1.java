package NumberPrograms;

import java.util.ArrayList;
import java.util.Scanner;
class ArrayList1{
    public static ArrayList create(ArrayList s,int num)
    {
        String str=String.valueOf(num);
        while (num > 0)
        {
                for (int i = 0; i < str.length(); i++)
                {
                    String s1 = String.valueOf(num);
                    int r = Math.floorDiv(num, (int) Math.pow(10, (s1.length() - 1)));
                    s.add(r);
                    num = num % (int) Math.pow(10, (s1.length() - 1));
                }
        }
        return  check(s,num);
    }
    public static ArrayList check(ArrayList s,int num)
    {

        int n1=0;
        int j=s.size();
        while(j>=0)
        {
            for ( int i =s.size();i>=0;i--)
            {
                int n = (int) (s.get(i));
                n1 = n1 + n;
                i--;
            }
            j--;
        }

        return s;
    }
}

public class KeithNumber1 extends ArrayList1
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to check :");
        int num=sc.nextInt();
        int temp=num;
        String str=String.valueOf(num);
        ArrayList<Integer> s = new ArrayList<>();
        create(s,num);
        int n1=s.getLast();
        if (n1 == temp) {
           System.out.println(temp + " is a keith number ");
        }
        else if (n1 >= temp) {
                    System.out.println(temp + " is not a keith number ");
        }
    }
}

