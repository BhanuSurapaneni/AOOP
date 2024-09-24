import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Chat Client");
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());

            JTextArea chatArea = new JTextArea();
            chatArea.setEditable(false);
            panel.add(new JScrollPane(chatArea), BorderLayout.CENTER);

            JTextField inputField = new JTextField();
            panel.add(inputField, BorderLayout.SOUTH);

            JButton sendButton = new JButton("Send");
            panel.add(sendButton, BorderLayout.EAST);

            frame.add(panel);
            frame.setVisible(true);

            ChatClient client = new ChatClient();

            // Lambda for sending messages when button is clicked
            sendButton.addActionListener(e -> {
                String message = inputField.getText();
                try {
                    client.start("127.0.0.1", 1234); // Connect to the server
                    client.getOut().println(message); // Send message
                    inputField.setText(""); // Clear input
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            });
        });
    }
}
