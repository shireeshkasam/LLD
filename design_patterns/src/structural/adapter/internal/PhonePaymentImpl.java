package structural.adapter.internal;

import structural.adapter.external3p.PhonePe3P;

import java.sql.Timestamp;

public class PhonePaymentImpl implements Payment{
    PhonePe3P phonePe3P;

    public PhonePaymentImpl(PhonePe3P phonePe3P){
        this.phonePe3P = phonePe3P;
    }

    @Override
    public void makePayment(Timestamp time, double amount, String upi) {
        phonePe3P.payAmount(amount, upi, time);
    }

    @Override
    public void checkAccountBalance(String upi) {
        System.out.println("Balance:"+ Double.valueOf(phonePe3P.checkBankBalance(upi)));
    }
}
