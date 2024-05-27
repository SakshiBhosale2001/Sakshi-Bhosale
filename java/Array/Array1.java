package Array;
import Abstraction.Abstract;

import java.util.*;


 abstract class Std{
     abstract void s(int[] a);
     Scanner sc =new Scanner(System.in);

}

class Extract extends Std{
     public void s(int[] a){
        int d[]=new int[a.length];
        int p[]=new int[a.length];
         for (int i=0;i<=a.length;) {
             d[i]=sc.nextInt();
             p[i]=a[i];
         }
         for (int c : a){
             System.out.println("a[] : "+c+"\n length of a[] : "+a.length);
         }
         for (int c : d){
             System.out.println("d[] : "+c);
         }
         for (int c : p){
             System.out.println("p[] : "+c);
         }

     }

}

public class Array1 {
    public static void main(String[] args){
        Std d=new Extract();

        Scanner sc =new Scanner(System.in);
/*
//        String[] s={"a","b","c"};
//        for (int i=0;i<s.length;i++)
//        {
//            System.out.println(s[i]+"\n");
//        }*/
        int[] b =new int[2];
        for (int i=0;i<b.length;i++)
        {
            b[i]=sc.nextInt();
        }
        for (int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
        //print using for each
      /*  for(String c:s){
            System.out.println(c);       // In a for-each loop, the variable c represents the elements of the array directly, not the index. Here's the corrected version
       }*/
        d.s(b);

    }
}
