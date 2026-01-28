package OOPS;
import java.util.Scanner;
public class User {
    String name;
    int pin;
    long ph_no;
    double avlBalance;
    public int getPin() {
        return pin;
    }
    public void setPin(int newPin) {
        pin = newPin;
    }
    public double getBalance() {
        return avlBalance;
    }
    public void deposit(double amount) {
        avlBalance += amount;
        System.out.println("Amount Deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (amount <= avlBalance) {
            avlBalance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance !");
        }
    }

    public void getDetails() {
        System.out.println("     User Details :      ");
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + ph_no);
        System.out.println("Available Balance: " + avlBalance);
    }
}
