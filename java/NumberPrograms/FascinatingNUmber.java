package NumberPrograms;
import java.util.Arrays;
import java.util.Scanner;


public class FascinatingNUmber {
    public static void main(String[] args)
    {
        boolean status=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 3-Digit Number to check : ");
        int n=sc.nextInt();
        String s=String.valueOf(n);
        String[] num={"1","2","3","4","5","6","7","8","9"};
        int len=s.length();

        if(len>=3)
        {
            int n1=n*2;
            int n2=n*3;
            String sum=String.valueOf(n)+String.valueOf(n1)+String.valueOf(n2);
            String[] s1 =sum.split("");

           int count=0;

          for (int i=0;i<num.length;i++)
          {
              count =0;
              for (int j=0;j<s1.length;j++)
              {
                  if(s1[j].equals(num[i]))
                  {
                      count++;
                  }
              }
              if(count!=1) {
                  status=false;
                  break;
              }
          }

          if (status==true)
          {
                System.out.println(n+" is Fascinating number");
          }
          else
              System.out.println(n+" is not Fascinating number");

        }
        else
            System.out.println("Enter 3 or > 3 digit number ");
    }
}
