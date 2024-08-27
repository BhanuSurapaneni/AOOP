package aoop2b;

public class CashFactory implements PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new Cash();
    }
}