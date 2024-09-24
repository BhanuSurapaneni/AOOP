import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void start(String ip, int port) throws IOException {
        clientSocket = new Socket(ip, port);
        setOut(new PrintWriter(clientSocket.getOutputStream(), true));
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        new Thread(() -> {
            try {
                String response;
                while ((response = in.readLine()) != null) {
                    System.out.println("Server: " + response);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        try (Scanner scanner = new Scanner(System.in)) {
            String userInput;
            while (!(userInput = scanner.nextLine()).equalsIgnoreCase("exit")) {
                getOut().println(userInput);
            }
        }
        stop();
    }

    public void stop() throws IOException {
        in.close();
        getOut().close();
        clientSocket.close();
    }

    public static void main(String[] args) {
        ChatClient client = new ChatClient();
        try {
            client.start("127.0.0.1", 1234);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public PrintWriter getOut() {
		return out;
	}

	public void setOut(PrintWriter out) {
		this.out = out;
	}
}
