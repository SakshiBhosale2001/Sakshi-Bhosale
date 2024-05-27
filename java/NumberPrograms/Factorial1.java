package NumberPrograms;

public class Factorial1 {
    static int Factorial(int n){
        if(n==0)
        {
            return 1;
        }
        else
            n=n*Factorial(n-1);
        return n;
    }
    public static void main(String[] args)
    {
        int num=4;
        int fact=Factorial(num);
        System.out.println(fact);
    }

}



