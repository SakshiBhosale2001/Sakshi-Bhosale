package JavaMisc;

public class WrapperClass {
    public static void main(String[] args)
    {
        //Primitive to Wrapper i.e autoboxing
        Integer a=Integer.valueOf(34);
        System.out.println(a+" "+a.getClass());

        //Wrapper to primitive i.e Unboxing
        int s=a.intValue();
        System.out.println(s+" ");


        byte b=10;
        short s1=20;
        int i=30;
        long l=40;
        float f=50.0F;
        double d=60.0D;
        char c='a';
        boolean b2=true;
        //primitive to object
        Byte byteobj=b;
        Short shortobj=s1;
        Integer intobj=i;

        System.out.println(byteobj);
        System.out.println(shortobj);
        System.out.println(intobj);

        //object to primitive unboxing
        byte bytevalue=byteobj;
        short shortvalue=shortobj;
        int intvalue=intobj;

        System.out.println(bytevalue);
        System.out.println(shortvalue);
        System.out.println(intvalue);

    }
}
