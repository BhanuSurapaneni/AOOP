package aoop4a;

public class DebugHandler extends LogHandler {
    @Override
    public void handle(String message) {
        if (message.startsWith("DEBUG:")) {
            System.out.println("DEBUG Handler: " + message);
        } else {
            super.handle(message);
        }
    }
}
