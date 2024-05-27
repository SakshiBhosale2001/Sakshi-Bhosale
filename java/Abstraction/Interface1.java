package Abstraction;
interface Start{
    void start();   //abstract keyword is automatically declared by compiler
    private void sing(){
        System.out.println("Private method executed");
    }; //private methods should have body
}
interface Stop{

    abstract void stop();
}
class Process implements Start{
    public void start(){
        sing();
        System.out.println("Process started");
    }
    void sing(){
        System.out.println("Singing");
    }

}
class Process1 implements Stop{

        public void stop(){
        System.out.println("Process stoped");
    }
}


public class Interface1 {
    public static void main(String[] args){
        Start p1=new Process(); //reference of interface1
        p1.start();
Stop p=new Process1();  //reference of interface 2
p.stop();
    }
}
