package Abstraction;
interface Student{
    interface ClassA {
       //abstract class A {

        abstract void belongs();
//            }
//            class B extends A{
//           void belongs(){
//               System.out.println("Student belongs to ClassA");
//           }
//            }
        }

    void Notbelongs();
}


class Info1 implements Student.ClassA,Student {
  public void belongs(){
    System.out.println("Student belongs to ClassA");
   }
   public void Notbelongs(){
     System.out.println("Student is not from ClassA");
    }

}
public class NestedInterface {
    public static void main(String[] args){
        Student.ClassA s = new Info1();
        s.belongs(); // Call belongs() method
        Student t=(Student) s;      //downcasting
        t.Notbelongs();
        //without downcasting
        Info1 i=new Info1();
        i.belongs();
        i.Notbelongs();
    }
}
