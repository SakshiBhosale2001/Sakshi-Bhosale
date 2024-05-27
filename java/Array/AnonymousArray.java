package Array;



public class AnonymousArray {
        public static void main(String[] args){
            printArray k=new printArray();
            String[] s={"a","b","c"};
            int e[]=k.get();
            for (int i=0;i<s.length;i++)
        {
            System.out.println(s[i]+"\n");
        }
            System.out.println("anonymous Array from get method : ");
            for (int i:e)
            {
                System.out.print("\t"+i);
            }
            System.out.println();
           // k.g(new int[][]{{1,2,3},{3,2,4},{}});     anonymous 2D can not be created
            k.fd(new int[]{2,3,4,5});
          //  k.fd(new int[]{3,6,7});
        }
}
