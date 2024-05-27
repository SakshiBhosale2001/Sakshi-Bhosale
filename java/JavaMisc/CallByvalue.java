package JavaMisc;

public class CallByvalue {
    int data=50;

    int change(int data){
        data=data+100;//changes will be in the local variable only
        return data;
    }

    public static void main(String args[]){
        CallByvalue op=new CallByvalue();


        System.out.println("before change "+op.data);
        System.out.println(op.change(500));
        System.out.println("after change "+op.data);

    }
}

