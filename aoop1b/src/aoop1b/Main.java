package aoop1b;

public class Main {
 public static void main(String[] args) {
     UserLoginState userLoginState = UserLoginState.getInstance();
     BankingOperations bankingOperations = new BankingOperations();

    
     bankingOperations.viewBalance();


     userLoginState.login();

    
     bankingOperations.viewBalance();

 
     bankingOperations.deposit(100.00);

   
     bankingOperations.withdraw(50.00);

     userLoginState.logout();

     bankingOperations.viewBalance();
 }
}
