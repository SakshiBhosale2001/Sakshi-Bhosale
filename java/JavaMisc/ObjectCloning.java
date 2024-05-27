package JavaMisc;
import java.lang.Object;

public class ObjectCloning implements Cloneable
{
    String name;
    int rollNo;
   ObjectCloning(int rollNo, String name)
    {
        this.name=name;
        this.rollNo=rollNo;
    }

    public Object Clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    public static void main(String[] args) {
        try {
            ObjectCloning obj = new ObjectCloning(102, "Sakshi");
            ObjectCloning obj1 = (ObjectCloning) obj.Clone();
            System.out.println("Obj : "+obj.name+" "+obj.rollNo);
            System.out.println("Obj1 : "+obj1.name+" "+obj1.rollNo);
        }
        catch(CloneNotSupportedException e)
        {

        }
    }

}
