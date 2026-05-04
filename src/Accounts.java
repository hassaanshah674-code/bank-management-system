public class Accounts {
    private String name;
    private int accNumber;
    private double balance;

    public Accounts(String name, int accNumber) {
        this.name = name;
        this.accNumber = accNumber;
        this.balance = 0;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public void display() {
        System.out.println("Name: " + name +
                " | Acc No: " + accNumber +
                " | Balance: " + balance);
    }
}