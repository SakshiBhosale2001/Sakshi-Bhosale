package Abstraction;

public class Abstract {
    public static void main(String [] args){
        B b=new B();
        b.show();
        b.Display();
    }
}
abstract class A{
    abstract void show();

}
class B extends A{
    void show(){
        System.out.println("Abstraction successfull");
    }
    void Display(){
        System.out.println("Display");
    };
}