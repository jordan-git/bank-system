package bank;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Account implements Serializable {
    private String accountNumber, pin;
    private double balance;
    protected double interestRate;
    private ArrayList<Transaction> transactions;

    public Account() {
        this(0);
    }

    public Account(double balance) {
        accountNumber = generateNumber(8);
        pin = generateNumber(4);
        this.balance = balance;
        transactions = new ArrayList<>();
    }

    public String toString() {
        return "ID: " + accountNumber + ", PIN: " + pin + ", Balance: " + balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double rate) {
        interestRate = rate;
    }

    // Generates an x long digit for account number & pin.
    public String generateNumber(int length) {
        int maxNumber = Integer.parseInt(new String(new char[length]).replace("\0", "9"));
        int intAccountNumber = ThreadLocalRandom.current().nextInt(0, maxNumber + 1);
        int accountNumberLength = String.valueOf(intAccountNumber).length();
        StringBuilder stringBuilder = new StringBuilder();
        if (accountNumberLength < length) {
            stringBuilder.append(new String(new char[length - accountNumberLength]).replace("\0", "0"));
        }
        stringBuilder.append(intAccountNumber);
        return stringBuilder.toString();
    }

    public boolean transfer(Account recipient, double amount) {
        if (balance < amount) {
            return false;
        }
        balance -= amount;
        recipient.balance += amount;
        return true;
    }

    public void deposit(double amount) {
        Transaction transaction = new Transaction("Deposit", amount);
        transactions.add(transaction);
        balance += amount;
    }
    
    public void withdraw(double amount) {
        Transaction transaction = new Transaction("Withdraw", amount);
        transactions.add(transaction);
        balance -= amount;
    }
}
