package NumberPrograms;

import java.util.Scanner;

public class TechNumber1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Strating Number : ");
        int x = sc.nextInt();
        System.out.println("Enter a Ending Number : ");
        int y = sc.nextInt();
        for (int i = x; i <= y; i++) {
            String s = String.valueOf(i);
            int len = s.length();
            if (len % 2 == 0) {
                int n1 = (int) (i % Math.pow(10, (len / 2)));
                int n2 = (int) (i / Math.pow(10, (len / 2)));
                int temp = n1 + n2;
                if (Math.pow(temp, 2) == i)
                    System.out.println(i);
                else
                    System.out.print("");
            } else
                System.out.print("");

        }
    }
}
