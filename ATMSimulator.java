import java.util.*;

public class ATMSimulator {
    static Scanner sc = new Scanner(System.in);
    static double balance = 1000;
    static int pin = 1234;

    public static void main(String[] args) {

        System.out.print("Enter PIN: ");
        if (sc.nextInt() != pin) {
            System.out.println("Wrong PIN");
            return;
        }

        while (true) {
            System.out.println("\n1.Balance 2.Deposit 3.Withdraw 4.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;
                case 2:
                    balance += sc.nextDouble();
                    break;
                case 3:
                    double amt = sc.nextDouble();
                    if (amt <= balance) balance -= amt;
                    else System.out.println("Low Balance");
                    break;
                case 4:
                    return;
            }
        }
    }
}
