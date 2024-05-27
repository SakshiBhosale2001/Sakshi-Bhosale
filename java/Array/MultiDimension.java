package Array;

import java.util.Scanner;

public class MultiDimension {public static void main(String[] args)
    {
        int a[][]=new int[2][2];
        int b[][]=new int[2][3];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter elements of array a[2][2] ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements of array b[2][3] ");
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                    b[i][j] = sc.nextInt();

            }
        }

        System.out.println("Array a[][]  ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("\n Array b[][]");
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {

                    System.out.print(b[i][j]+"\t");
            }
            System.out.println();

        }
    }
}
