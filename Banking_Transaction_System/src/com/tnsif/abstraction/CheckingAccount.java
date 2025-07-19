package com.tnsif.abstraction;

class CheckingAccount extends Account {
    public CheckingAccount(double balance) {
        super(balance);
    }

    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " in Checking Account");
    }

    
    public void withdraw(double amount) {
        if (amount <= balance + 500) {  // Example: ₹500 overdraft allowed
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from Checking Account");
        } else {
            System.out.println("Withdrawal exceeds overdraft limit in Checking Account");
        }
    }

   
    public double getBalance() {
        return balance;
    }
}
