public class PaypalPayment implements Payment {

    @Override
    public void processPayment() {
        System.out.println("Se proceso el pago con Paypal");
    }
    
}
