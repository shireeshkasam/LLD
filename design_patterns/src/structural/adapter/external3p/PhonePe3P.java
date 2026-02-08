package structural.adapter.external3p;

import java.sql.Timestamp;

public class PhonePe3P{
    public void payAmount(double amount, String upi, Timestamp time){
        System.out.println("Amount"+amount+" has transferred to:"+upi);
    }

    public int checkBankBalance(String bank){
        return 20000;
    }
}
