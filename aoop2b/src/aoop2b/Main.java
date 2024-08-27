package aoop2b;

public class Main {
 public static void main(String[] args) {
     // Singleton User Authentication
     UserAuthentication auth = UserAuthentication.getInstance();
     auth.login("JohnDoe");

     // Factory Method for Vehicles
     VehicleFactory vehicleFactory = new CarFactory(); // Change to BikeFactory or ScooterFactory for different vehicles
     Vehicle vehicle = vehicleFactory.createVehicle();
     vehicle.ride();

     // Abstract Factory for Payment Methods
     PaymentFactory paymentFactory = new CreditCardFactory(); // Change to PayPalFactory or CashFactory for different payments
     PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();
     paymentMethod.pay();

     // Logout
     auth.logout();
 }
}
