package aoop2b;

public class PayPal extends PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment made using PayPal.");
    }
}