package structural.adapter.internal;

import java.sql.Timestamp;

public interface Payment {
    void makePayment(Timestamp time, double amount, String upi);
    void checkAccountBalance(String upi);
}
