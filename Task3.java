package codesoft.Internship;

import java.util.Scanner;

class BankAccount{
    private double balance;

    public   BankAccount(double initialBalance){
        this.balance=initialBalance;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }
    public boolean withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            return true;
        }
        else {
            return false;
        }
    }
}

public class Task3 {
    private BankAccount userAccount;
    public Task3(BankAccount userAccount){
        this.userAccount=userAccount;
    }
    public void displayMenu(){
        System.out.println("ATM menu");
        System.out.println("1. Withdraw");
        System.out.println("2.Deposits");
        System.out.println("3.checkBlance");
        System.out.println("4.Exit");
    }
    public  void run(){
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            displayMenu();
            System.out.println("enter ur choice");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                System.out.print("Enter the amount to withdraw: ");
                double withdrawAmount=sc.nextDouble();
                if(userAccount.withdraw(withdrawAmount)){
                    System.out.println("Withdrawal successful. Remaining balance: "+userAccount.getBalance());
                }
                else {
                    System.out.println("Insufficient balance. Withdrawal failed.");
                }
                break;
                case 2:
                    System.out.print("Enter the amount to deposits: ");
                    double depositAmount =sc.nextDouble();
                    userAccount.deposit(depositAmount);
                    System.out.println("Deposit successful. updated Balance: "+ userAccount.getBalance());
                    break;
                case 3:
                    System.out.println("your current Balance :"+userAccount.getBalance());
                case 4:
                    System.out.println("Thank you for using the ATM.HAve A Nice Day!");
                    break;
                default:
                    System.out.println("Invalid choice. please enter a valid option.");
                    break;

            }
        }
        while(choice!=4);
        sc.close();
    }
    public static void main(String[] args) {
BankAccount userAccount =new BankAccount(1000);
Task3 atm=new Task3(userAccount);
atm.run();
    }
}
