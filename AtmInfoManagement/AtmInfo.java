package OOPS;
import java.util.Scanner;
public class AtmInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        user.pin = 3355;
        user.name = "Durgesh";
        user.avlBalance = 50000.50;
        user.ph_no = 8577834787l;

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();
        if (enteredPin == user.getPin()) {
            while (true) {
                System.out.println("      ATM Options     ");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. View Details");
                System.out.println("5. Exit");

                System.out.print("Enter your choice (1-5): ");
                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("Current Balance: " + user.getBalance());
                } else if (choice == 2) {
                    System.out.print("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                    user.deposit(amount);
                } else if (choice == 3) {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();
                    user.withdraw(amount);
                } else if (choice == 4) {
                    user.getDetails();
                } else if (choice == 5) {
                    System.out.println("Thank you for using the ATM !");
                    break;
                } else {
                    System.out.println("Invalid choice !");
                }
                System.out.println();
            }
        } else {
            System.out.println("Incorrect PIN !");
        }
    }
}
