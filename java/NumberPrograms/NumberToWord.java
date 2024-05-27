package NumberPrograms;

import java.util.Scanner;

public class NumberToWord
{
    static String conversion(int n)
    {
        String[] unique={"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
       String[] tens={"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
       String[] power={"","","","Hundread","Thousand","Lakh","crore"};
       int len=0;
        if(n<20) {
           System.out.println(n);
           return unique[n];
       }
       int t=100;
       if (n<100)
        {
            return  (tens[n/10]+(n%10!=0?" ":"")+unique[n%10]);

        }
       else if (n>100)
       {
           String s=String.valueOf(n);
          // char s1=conversion(n).toCharArray();             //432
           len =s.length();
           System.out.println("Length : "+len);
           while(len<=5)
           {
               switch(len)
               {
                   case 3:
                   {
                       return(unique[n / t] + " " + power[len] + " " + tens[(n % t) / 10] + " " + unique[(n % t) % 10]);
                   }
                   case 4:
                   {
                       return (unique[n / (10 * t)]+" " + power[len]+" " + unique[(n % (10 * t)) / t]+" " + power[len - 1]+" " + tens[(((n % (t * 10)) % t)) / 10]+" " + unique[((n % (t * 10)) % 100) % 10]);
                   }
                   case 5:
                   {//78907
                      return (tens[n / (10000)]+" "+unique[(n/1000)%10]+" " + power[len-1]+" " + unique[(n % (10 * t))/t]+" " + power[len - 2]+" " + tens[(((n % (t * 10)) % t)) / 10]+" " + unique[((n % (t * 10)) % 100) % 10]);
                   }
                   default:
                       break;
               }
           }
       }

        return null;
    }

    public static void main(String[] args)
    {
      System.out.println(54687%10000);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        System.out.println(conversion(n));
    }
}
