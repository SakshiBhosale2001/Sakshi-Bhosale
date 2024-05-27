package NumberPrograms;
import java.util.Scanner;
public class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int start = s.nextInt();
        System.out.print("Enter the second number : ");
        int end = s.nextInt();
        System.out.println("List of prime numbers between " + start + " and " + end);
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }

}

