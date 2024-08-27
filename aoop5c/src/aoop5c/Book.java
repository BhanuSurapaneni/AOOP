package aoop5c;

public class Book implements LibraryItem {
    private String title;
    private boolean available;

    public Book(String title) {
        this.title = title;
        this.available = true;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void borrowItem() {
        if (available) {
            available = false;
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println(title + " is currently unavailable.");
        }
    }

    @Override
    public void returnItem() {
        available = true;
        System.out.println("You have returned: " + title);
    }
}