package aoop2b;

public class CreditCard extends PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment made using Credit Card.");
    }
}