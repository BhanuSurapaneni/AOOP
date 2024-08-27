package aoop5b5;

public class DIPDemo {
    public static void main(String[] args) {
        // Using EmailService
        MessageService emailService = new EmailService();
        MyApplication appWithEmail = new MyApplication(emailService);
        appWithEmail.processMessage("Hello via Email!", "email@example.com");

        // Using SMSService
        MessageService smsService = new SMSService();
        MyApplication appWithSMS = new MyApplication(smsService);
        appWithSMS.processMessage("Hello via SMS!", "123-456-7890");
    }
}