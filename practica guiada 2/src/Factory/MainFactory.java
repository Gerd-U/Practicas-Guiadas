

public class MainFactory {
    public static void main(String[] args) {
        PaymentFactory factory1 = new CreditCardFactory();
        Payment payment1 = factory1.createPayment();
        payment1.processPayment();

        PaymentFactory factory2 = new PaypalFactory();
        Payment payment2 = factory2.createPayment();
        payment2.processPayment();
    }
}
