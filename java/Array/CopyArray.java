package Array;

public class CopyArray {
    public static void main(String[] args)
    {
        int[] arr1={1,2,3,4};
        int[] arr2=new int[arr1.length];
        System.out.println(arr1.length);
        for(int i=(arr1.length-1);i>=0;i--)
        {
            arr2[i]=arr1[3-i];
            System.out.println(arr2[3-i]);
        }
    }
}
