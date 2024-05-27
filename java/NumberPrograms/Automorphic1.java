package NumberPrograms;

import java.util.Scanner;
//automorphoic number is when last digit of number is same as its square's last digit & as we change the base of last digit automorphic number changes
public class Automorphic1 {
    public static boolean Automorphic(int num)
    {int count=0;
        int sqr=num*num;
        int temp=num;
        while(num>0)
        {
            count++;
            num=num/10;
        }
        int s=(int)(sqr%(Math.pow(10,count)));

        return (temp==s);

    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Starting number : ");
        int x=sc.nextInt();
        System.out.println("Enter ending number : ");
        int y=sc.nextInt();
        for(int i=x;i<=y;i++) {
            if (Automorphic(i))
                System.out.println(i);
        }
    }
}
