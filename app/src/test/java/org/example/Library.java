package org.example;// Library class: Manages books and patrons
import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public Library() {
        books = new ArrayList<>();
        patrons = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
        System.out.println("Patron added: " + patron.getName());
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println("- " + book.getTitle() + " by "
                    + book.getAuthor() + " (Published: "
                    + book.getYearPublished() + ")");
        }
    }

    public void displayPatrons() {
        System.out.println("Patrons of the library:");
        for (Patron patron : patrons) {
            System.out.println("- " + patron.getName() +
                    " (ID: " + patron.getId() + ")");
        }
    }
}
