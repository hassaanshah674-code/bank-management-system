import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager(); // ✅ ONE manager only

        System.out.println("Welcome to our Bank System");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Show All Accounts");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    manager.addAccount();
                    break;

                case 2:
                    manager.depositMoney();
                    break;

                case 3:
                    manager.withdrawMoney();
                    break;

                case 4:
                    manager.checkBalance();
                    break;

                case 5:
                    manager.showAllAccounts();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}