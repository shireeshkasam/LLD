package solid.srp.solution;

public class OrderProcessor {
    EmailService emailService;
    OrderRepo orderRepo;

    OrderProcessor(EmailService emailService, OrderRepo orderRepo){
        this.emailService = emailService;
        this.orderRepo = orderRepo;
    }
    public void processOrder(){
        // process logic

        // orderRepo.save();
        // emailService.notify();
    }
}




