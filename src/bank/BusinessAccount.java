package bank;

public class BusinessAccount extends Account {
    public BusinessAccount() {
        super();
        interestRate = 3.5;
        // Business accounts are more secure by having longer account numbers & pins.
        this.setAccountNumber(generateNumber(9));
        this.setPin(generateNumber(6));
    }

    public BusinessAccount(double balance) {
        super(balance);
        interestRate = 3.5;
        // Business accounts are more secure by having longer account numbers & pins.
        this.setAccountNumber(generateNumber(9));
        this.setPin(generateNumber(6));
    }
}
