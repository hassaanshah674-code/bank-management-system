import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

    private ArrayList<Accounts> accounts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addAccount() {
        sc.nextLine(); // fix input bug
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNumber = sc.nextInt();

        Accounts acc = new Accounts(name, accNumber);
        accounts.add(acc);

        System.out.println("Account created successfully!");
    }

    public Accounts findAccount(int accNumber) {
        for (Accounts acc : accounts) {
            if (acc.getAccNumber() == accNumber) {
                return acc;
            }
        }
        return null;
    }

    public void depositMoney() {
        System.out.print("Enter Account Number: ");
        int accNumber = sc.nextInt();

        Accounts acc = findAccount(accNumber);

        if (acc != null) {
            System.out.print("Enter amount to deposit: ");
            double amount = sc.nextDouble();
            acc.deposit(amount);
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdrawMoney() {
        System.out.print("Enter Account Number: ");
        int accNumber = sc.nextInt();

        Accounts acc = findAccount(accNumber);

        if (acc != null) {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            if (acc.withdraw(amount)) {
                System.out.println("Withdrawal successful!");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    public void checkBalance() {
        System.out.print("Enter Account Number: ");
        int accNumber = sc.nextInt();

        Accounts acc = findAccount(accNumber);

        if (acc != null) {
            System.out.println("Current Balance: " + acc.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    public void showAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (Accounts acc : accounts) {
                acc.display();
            }
        }
    }
}