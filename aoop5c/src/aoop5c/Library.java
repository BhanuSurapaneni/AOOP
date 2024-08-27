package aoop5c;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> items;
    private List<Member> members;

    public Library() {
        items = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void borrowItem(String title, Member member) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                item.borrowItem();
                return;
            }
        }
        System.out.println("Item not found: " + title);
    }

    public void returnItem(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                item.returnItem();
                return;
            }
        }
        System.out.println("Item not found: " + title);
    }
}