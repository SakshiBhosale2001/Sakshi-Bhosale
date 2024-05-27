package Abstraction;
interface Star{
    void show();
}
interface Sun{
   abstract void display();
}
class Universe implements Star,Sun{
    public void display(){
        System.out.println("Interface 2 executed");
    }
    public void show(){
        System.out.println("Interface 1 executed");
    };
}

public class Interface {
    public static void main(String[] args){
    Universe u=new Universe();
    u.display();
    u.show();
    }
}
