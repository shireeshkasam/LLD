package solid.ocp.violation;

import solid.ocp.PaymentType;

public class PaymentProcessor {
    public void processPayment(PaymentType paymentType){
        switch (paymentType){
            case PaymentType.CREDIT_CARD -> {
                // credit card payment
            }
            case PaymentType.UPI -> {
                // upi payment
            }
            case PaymentType.DEBIT_CARD -> {
                // debit card payment
            }
            case PaymentType.WALLET -> {
                // wallet payment
            }
        }
    }
}
