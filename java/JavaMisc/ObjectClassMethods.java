package JavaMisc;



public class ObjectClassMethods
{
    public static void main(String[] args)
    {
        Object obj=new Object();
        String s="Sakshi";
        String s1 = new String("Sakshi");
        String s2 = new String("Sakshi");
        System.out.println(s1==s2);         //check reference adress is same or not
        System.out.println(s1.equals(s2));  //check contect of object is same or not
        System.out.println(obj.getClass().getName());
        System.out.println((obj.toString()).getClass());
        System.out.println(obj.getClass().getName());

    }
}
class Object
{
    public boolean equal(Object o)
    {
        return (this==o);
    }
}
class a extends Object
{
    @Override
    public boolean equal(Object o) {
        return (this.equals(o));
    }
}