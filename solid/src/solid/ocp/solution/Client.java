package solid.ocp.solution;

public class Client {
    static void main() {
        PaymentMode paymentProcessor = new CreditCardPay();
        paymentProcessor.makePayment();
    }
}
