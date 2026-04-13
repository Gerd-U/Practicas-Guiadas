
import Factory.CreditCardPayment;
import Factory.Payment;

public class CreditCardFactory extends PaymentFactory {

    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
    
}
