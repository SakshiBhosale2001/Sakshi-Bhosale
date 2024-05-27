package JavaMisc;

public class HashCode {
    public static void main(String[] args)
    {
        String s4=new String("S");
        String s5=new String("s");
        String s="s";
        String s1="s";
        System.out.println((s.hashCode())==s4.hashCode());      //false as Java is case sensitive
        System.out.println(s.hashCode()==s5.hashCode());        //true
        int s2=s.hashCode();
        int s3=s1.hashCode();
        System.out.println(s2 +"  "+s3);
        Integer i=0;
        Integer a=0;

        System.out.println(i.hashCode()==a.hashCode());
    }
}
