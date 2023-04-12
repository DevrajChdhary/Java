import java.util.*;

public class Bank{
    private String name;
    private String address;
    private int accountNumber;
    private double balance;

    private static int lastAccountNumber = 1000;

  
    public Bank(String name, String address, double balance) {
        this.name = name;
        this.address = address;
        this.balance = balance;

 
        lastAccountNumber++;
        this.accountNumber = lastAccountNumber;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited. New balance: $" + balance);
    }


    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance. Withdrawal unsuccessful.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn. New balance: $" + balance);
        }
    }

    public void changeAddress(String newAddress) {
        address = newAddress;
        System.out.println("Address changed successfully.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of depositors: ");
        int numDepositors = input.nextInt();

     
        Bank[] depositors = new Bank[numDepositors];
        for (int i = 0; i < numDepositors; i++) {
            input.nextLine();
            System.out.print("Enter name of depositor " + (i+1) + ": ");
            String name = input.nextLine();

            System.out.print("Enter address of depositor " + (i+1) + ": ");
            String address = input.nextLine();

            System.out.print("Enter balance of depositor " + (i+1) + ": $");
            double balance = input.nextDouble();

            depositors[i] = new Bank(name, address, balance);
        }

        System.out.print("\nEnter the index of the depositor you want to view (0-" + (numDepositors-1) + "): ");
        int index = input.nextInt();

        depositors[index].displayInfo();


        System.out.print("\nEnter the index of the depositor you want to add money to (0-" + (numDepositors-1) + "): ");
        index = input.nextInt();

        System.out.print("Enter the amount you want to add: $");
        double amount = input.nextDouble();

        depositors[index].deposit(amount);
        depositors[index].displayInfo();

         System.out.print("Enter the amount you want to withdraw: $");
    amount = input.nextDouble();

    depositors[index].withdraw(amount);
    depositors[index].displayInfo();


    System.out.print("\nEnter the index of the depositor you want to change the address of (0-" + (numDepositors-1) + "): ");
    index = input.nextInt();

    input.nextLine(); 
    System.out.print("Enter the new address: ");
    String newAddress = input.nextLine();

    depositors[index].changeAddress(newAddress);
    depositors[index].displayInfo();

    for (int i = 0; i < 2; i++) {
        int randomIndex = (int) (Math.random() * numDepositors);

        double randomAmount = (Math.random() * 500) + 100;

        depositors[randomIndex].deposit(randomAmount);
        depositors[randomIndex].withdraw(randomAmount / 2);
        depositors[randomIndex].changeAddress("New Address");

        System.out.println("\nRandom process completed for depositor " + randomIndex);
        depositors[randomIndex].displayInfo();
      }
    }
}
