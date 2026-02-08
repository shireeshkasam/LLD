package structural.adapter.internal;

import structural.adapter.external3p.CredPay3P;

import java.sql.Timestamp;

public class CredPaymentImpl implements Payment{
    CredPay3P credPay3P;

    public CredPaymentImpl(CredPay3P credPay3P){
        this.credPay3P = credPay3P;
    }

    @Override
    public void makePayment(Timestamp time, double amount, String upi) {
        credPay3P.pay(amount, upi);
    }

    @Override
    public void checkAccountBalance(String upi) {
        System.out.println("Balance:"+ credPay3P.checkBalance(upi));
    }
}
