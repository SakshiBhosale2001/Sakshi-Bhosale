package NumberPrograms;

public class Pelindrome1 {
        public static void main(String args[]){
            int r,sum=0,temp;
            int n=454;//It is the number variable to be checked for palindrome

            temp=n;
            while(n>0){
                r=n%10;  //getting remainder (1:4,2:5,3:4)
                sum=(sum*10)+r; //(s=0,1:s=(0x10)+4,s=4,2:4x10+5,s=45,3:45x10+4)
                n=n/10; //(1:n=45,2:n=4,3:n=0.4)
            }
            if(temp==sum)
                System.out.println("palindrome number ");
            else
                System.out.println("not palindrome");

    }
}
