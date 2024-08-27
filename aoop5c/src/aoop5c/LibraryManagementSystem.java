package aoop5c;


public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        LibraryItem book1 = new Book("The Great Gatsby");
        LibraryItem book2 = new Book("1984");
        library.addItem(book1);
        library.addItem(book2);

        // Adding members to the library
        Member member1 = new Member("Alice", 1);
        Member member2 = new Member("Bob", 2);
        library.addMember(member1);
        library.addMember(member2);

        // Borrowing and returning books
        library.borrowItem("1984", member1);
        library.borrowItem("The Great Gatsby", member2);
        library.returnItem("1984");
        library.borrowItem("1984", member2);
    }
}
