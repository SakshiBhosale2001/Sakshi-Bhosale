package Array;

import javax.print.attribute.standard.MediaSizeName;
import java.util.*;

public class ArrayCopy {
    public static void main(String[] args){
        char CopyFrom[]={'B','H','f','D','L','T','P','G','Y','P','U','R'};
        char CopyTo[]=new char[9];
        String[] m={"a","b"};

        System.out.println(m.getClass().getName());


        System.arraycopy(CopyFrom ,1,CopyTo ,0,6);
        System.out.println("CopyTo"+CopyTo);//data type char


        char C[];
        System.out.println(C=(Arrays.copyOf(CopyFrom,CopyFrom.length)));


        System.out.println("-----------Are both equal----------");
        System.out.println(CopyFrom==C);


        String[] temp = new String[]{new String(CopyTo)};

        System.out.println("-----------------------S"+Arrays.toString(temp)); //String
        System.out.println(temp.getClass().getName());
        System.out.println(CopyTo.getClass().getName());
        System.out.println(String.valueOf(CopyTo));
        System.out.println(CopyTo.getClass().getName());

        String s[]=new String[9];
        for(int i=0;i<CopyTo.length;i++)
        {
            System.out.println(s[i]=String.copyValueOf(CopyTo));
        }

        System.out.println(CopyTo.getClass().getName());

//        Arrays.stream();
    }
}
