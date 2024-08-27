package aoop5b5;

public class MyApplication {
    private MessageService messageService;

    // Constructor injection for dependency inversion
    public MyApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String recipient) {
        messageService.sendMessage(message, recipient);
    }
}