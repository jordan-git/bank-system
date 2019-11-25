package bank;

public class StandardAccount extends Account {
    public StandardAccount() {
        super();
        interestRate = 2.5;
    }

    public StandardAccount(double balance) {
        super(balance);
        interestRate = 2.5;
    }
}
