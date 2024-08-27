package aoop1a;

public class Main {
 public static void main(String[] args) {
    
     Logger logger = Logger.getInstance();

    
     logger.log("Application started.");
     logger.log("Performing some operations...");
     logger.log("Application finished.");
     
     
     Logger anotherLoggerInstance = Logger.getInstance();
     System.out.println("Are both logger instances the same? " + (logger == anotherLoggerInstance));
 }
}
