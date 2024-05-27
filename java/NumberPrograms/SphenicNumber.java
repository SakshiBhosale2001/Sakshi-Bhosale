package NumberPrograms;

import java.util.Scanner;

public class SphenicNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        int num=sc.nextInt();
        int count=0;
        int[] p=new int[3];
        for(int i=0;i<num;i++)
        {

        }
        for(int i=0;i<num;i++)
        {
            if(num%(i+2)==0)
            {
                p[i]=i+2;
                count+=1;
                int c=0;
                if(i==2 || i==3)
                    c=0;
                for(int j=2;j<i;j++) {
                    if (i % j == 0)
                        c = 1;
                }
                if(c==0)
                {
                    if(count==3)
                    {
                        System.out.println(num+" is Sphenic Number ");
                        break;
                    }
                }
                else if(c==1) {
                    if(i%2==0)
                        count-=1;
                    System.out.println(num+" is not Sphenic Number ");
                    break;
                }
            }
            if (count>3) {
                System.out.println(num+" is not Sphenic Number ");
                break;
            }
        }
    }
}

