package Task;
import java.util.LinkedList;
import java.util.Queue;

public class CustomerSupportTicketSystem {
    private Queue<String> tickets;

    public CustomerSupportTicketSystem() {
        tickets = new LinkedList<>();
    }

    public void addTicket(String ticket) {
        tickets.add(ticket);
    }

    public void processTicket() {
        if (!tickets.isEmpty()) {
            System.out.println("Processing ticket: " + tickets.poll());
        } else {
            System.out.println("No tickets to process.");
        }
    }

    public void displayPendingTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No pending tickets.");
        } else {
            System.out.println("Pending tickets: " + tickets);
        }
    }

    public static void main(String[] args) {
        CustomerSupportTicketSystem support = new CustomerSupportTicketSystem();
        support.addTicket("Issue with login");
        support.addTicket("Payment not processed");
        support.displayPendingTickets();
        support.processTicket();
        support.displayPendingTickets();
    }
}
