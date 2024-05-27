package NumberPrograms;

import java.util.Scanner;

public class ATMProgram {
    public static void main(String[] args)
    {
        int balance=102878;
        Scanner sc =new Scanner(System.in);
        System.out.println("\t Automated Teller Machine \n choose 1 from below \n 1.Withdraw \n 2.Diposite \n 3.check Balance \n 4.Exit\n");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            {
                System.out.println("Enter amount to be withdrawal : ");
                int amt = sc.nextInt();
                if (balance >= amt) {
                    balance -= amt;
                    System.out.println("Amount " + amt + " is Withdrawed" + "Remained balance is " + balance);
                } else {
                    System.out.println("Insufficient Amount");
                    break;
                }
                break;
            }
            case 2: {
                System.out.println("Enter amount to be Deposited : ");
                int amt = sc.nextInt();
                balance+=amt;
                System.out.println("Total balance is "+balance);
                break;
            }
            case 3:
            {
                System.out.println("Total Balance is "+balance);
                break;
            }
            case 4:
            {
                break;
            }
        }
    }
}
