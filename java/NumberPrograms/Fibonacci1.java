package NumberPrograms;


public class Fibonacci1
{
    static int n1=0,n2=1,sum=0;
    static void fibonacci(int count)
    {
        if(count>0)
        {
            sum= n1+n2;
            System.out.println(sum);
            n1=n2;
            n2=sum;
            fibonacci(count-1);
        }

    }
    public static void main(String[] args){
        int count=10;
        fibonacci(count);

    }
}
