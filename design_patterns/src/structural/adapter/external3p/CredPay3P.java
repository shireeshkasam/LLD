package structural.adapter.external3p;

public class CredPay3P {
    public void pay(double amount, String upi){
        System.out.println("Amount"+amount+" has transferred to:"+upi);
    }

    public double checkBalance(String bank){
        return 10000d;
    }
}
