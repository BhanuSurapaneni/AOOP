package aoop1b;


public class UserLoginState {
 
 private static UserLoginState instance;

 
 private boolean loggedIn;

 
 private UserLoginState() {
     this.loggedIn = false; 
 }

 
 public static UserLoginState getInstance() {
     if (instance == null) {
         instance = new UserLoginState();
     }
     return instance;
 }


 public void login() {
     loggedIn = true;
     System.out.println("User logged in.");
 }

 
 public void logout() {
     loggedIn = false;
     System.out.println("User logged out.");
 }

 
 public boolean isLoggedIn() {
     return loggedIn;
 }
}
