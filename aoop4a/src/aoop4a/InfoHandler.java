package aoop4a;

public class InfoHandler extends LogHandler {
    @Override
    public void handle(String message) {
        if (message.startsWith("INFO:")) {
            System.out.println("INFO Handler: " + message);
        } else {
            super.handle(message);
        }
    }
}
