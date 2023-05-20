package CoreJavaConcepts.classesandobjects.chatgpt.intermediate;

import java.util.Scanner;

class BankAccount{

    private String account_holder_name;
    private long account_number;
    private double balance = 0;

    BankAccount(String account_holder_name, long account_number) {
        this.account_holder_name = account_holder_name;
        this.account_number = account_number;
        setBalance();
    }

    public void setBalance() {
        this.balance = 0;
    }

    public void displayDetails() {
        System.out.printf("The current balance of %s, of the account number %d is ₹ %.3f\n\n", account_holder_name, account_number, balance);
    }

    public void deposit (double deposit_cash) {
        balance += deposit_cash;
        System.out.printf("\nYour cash %.3f have been deposited successfully.\n",deposit_cash);
        displayDetails();
    }

}

public class Bank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String user_name = sc.nextLine();
        System.out.println();
        System.out.print("Enter your account number: ");
        long account_number = sc.nextLong();

        BankAccount account = new BankAccount(user_name, account_number);
        int choice=1;

        while(choice<=3 && choice>0){

            System.out.println("\nWelcome to the international bank. How can I help you?");
            System.out.println("1. Deposit Cash\t2.Check Balance\n3.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1){
                System.out.print("Enter an amount to be deposited: ");
                double deposit_cash = sc.nextDouble();
                account.deposit(deposit_cash);
            }

            else if (choice == 2) {
                account.displayDetails();
            }

            else if (choice==3) {
                System.out.println("Thank you for visiting us, have a nice day.");
                break;
            }

            else {
                System.out.println("Invalid choice, please enter from the given choices");
            }
        }
    }

}
