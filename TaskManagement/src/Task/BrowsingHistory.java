package Task;
import java.util.ArrayDeque;
import java.util.Deque;

public class BrowsingHistory {
    private Deque<String> history;
    private String currentPage;

    public BrowsingHistory() {
        history = new ArrayDeque<>();
    }

    public void addPage(String page) {
        if (currentPage != null) {
            history.push(currentPage);
        }
        currentPage = page;
    }

    public void goBack() {
        if (!history.isEmpty()) {
            currentPage = history.pop();
        } else {
            System.out.println("No previous page.");
        }
    }

    public void displayCurrentPage() {
        System.out.println("Current page: " + currentPage);
    }

    public static void main(String[] args) {
        BrowsingHistory browser = new BrowsingHistory();
        browser.addPage("Homepage");
        browser.addPage("About Us");
        browser.displayCurrentPage();
        browser.goBack();
        browser.displayCurrentPage();
    }
}
