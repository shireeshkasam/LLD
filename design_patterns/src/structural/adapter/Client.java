package structural.adapter;

import structural.adapter.external3p.CredPay3P;
import structural.adapter.external3p.PhonePe3P;
import structural.adapter.internal.CredPaymentImpl;
import structural.adapter.internal.Payment;
import structural.adapter.internal.PhonePaymentImpl;

import java.sql.Timestamp;

public class Client {
    public static void main(String[] args) {
        Payment phonepeAcc1 = new PhonePaymentImpl(new PhonePe3P());
        Payment credpayAcc2 = new CredPaymentImpl(new CredPay3P());
        phonepeAcc1.makePayment(new Timestamp(1000L),2000d, "abc@upi");
        credpayAcc2.makePayment(new Timestamp(1200L),3000d, "xyz@upi");
        phonepeAcc1.checkAccountBalance("abc@upi");
        credpayAcc2.checkAccountBalance("xyz@upi");
    }
}
