package aoop5c;

public interface LibraryItem {
    String getTitle();
    boolean isAvailable();
    void borrowItem();
    void returnItem();
}