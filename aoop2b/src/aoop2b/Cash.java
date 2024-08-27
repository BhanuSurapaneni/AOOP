package aoop2b;

public class Cash extends PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment made using Cash.");
    }
}