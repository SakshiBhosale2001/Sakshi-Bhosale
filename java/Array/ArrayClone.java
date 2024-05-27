package Array;

import java.util.*;

public class ArrayClone {
    public static void main(String[] args){
        int[] temp={1,2,3,4,5};
        int[] b=temp.clone();

        System.out.println("Printing original array:");
        String[] s = new String[temp.length];
        for(int i=0;i< temp.length;i++) {

            s[i] = "0";
            System.out.println(temp[i]);
        }
        for(String i:s)
        {
            System.out.println(i);
        }
        System.out.println("------Printing cloned array------");

        for(int i: b)
            System.out.println(i);

        System.out.println("--------method 2 ---------------");
       // for (int j=0;j<s.length;j++) {
            for (String i : s)
                s = new String[]{new String(Arrays.toString(temp))};
      //  }


        for(String i:s){
            System.out.println(i);
        }

        System.out.println(s.getClass().getName());
    }
}
