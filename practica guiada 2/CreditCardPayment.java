package Factory;

public class CreditCardPayment implements Payment{

    @Override
    public void processPayment() {
       System.out.println("Se proceso el pago con tarjeta de credito");
    }
    
}
