package bank;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bank {
    private ArrayList<Account> accounts;
    private Account loggedInAccount;

    public Bank() {
        accounts = new ArrayList<>();
        loadData();
        loggedInAccount = null;
        System.out.println(accounts);
    }
    
    public void addAccount(Account account) {
        accounts.add(account);
        logout();
    }
    
    public Account getLoggedIn() {
        return loggedInAccount;
    }
    
    public double getBalance() {
        return loggedInAccount.getBalance();
    }

    private void writeArrayLists() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("accounts.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(accounts);
            objectOutputStream.flush();
            objectOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void readArrayLists() {
        try {
            FileInputStream fileInputStream = new FileInputStream("accounts.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            accounts = (ArrayList<Account>) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            File file = new File("accounts.dat");
            try {
                file.createNewFile();
            } catch (IOException ex) {
                e.printStackTrace();
            }
        }
    }

    private void saveData() {
        if (loggedInAccount != null) {
            for (int i = 0; i < accounts.size(); i++) {
                Account current = accounts.get(i);
                if (loggedInAccount.getAccountNumber().equals(current.getAccountNumber())) {
                    accounts.set(i, loggedInAccount);
                }
            }
        }
        writeArrayLists();
    }

    private void loadData() {
        File file = new File("accounts.dat");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        readArrayLists();
    }

    public boolean login(String accountNumber, String pin) {
        for (Account current : accounts) {
            if (current.getAccountNumber().equals(accountNumber) && current.getPin().equals(pin)) {
                loggedInAccount = current;
                return true;
            }
        }
        return false;
    }

    public void logout() {
        saveData();
        loggedInAccount = null;
    }

    public void printAccounts() {
        System.out.println(accounts);
    }
}
