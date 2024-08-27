package aoop2b;

//UserAuthentication.java
public class UserAuthentication {
 private static UserAuthentication instance;
 private String username;

 private UserAuthentication() {
 }

 public static UserAuthentication getInstance() {
     if (instance == null) {
         instance = new UserAuthentication();
     }
     return instance;
 }

 public void login(String username) {
     this.username = username;
     System.out.println(username + " logged in.");
 }

 public void logout() {
     System.out.println(username + " logged out.");
     username = null;
 }

 public String getUsername() {
     return username;
 }
}
