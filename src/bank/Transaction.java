package bank;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction implements Serializable {
    private final String type;
    private final double amount;
    private final Date date;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        date = new Date();
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(date);
    }

    public String getDateTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy at hh:mm:ss");
        return simpleDateFormat.format(date);
    }

    @Override
    public String toString() {
        return getDateTime();
    }
}