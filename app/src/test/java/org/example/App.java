public class App{
    public  static void main(Strig[] args) {
        Library library = new Library();
        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("To kill a Mockingbird", "Harper Lee", 1960);
        library.addBook(book1);
        library.addBook(book2);


        Patron patron1 = new Patron("Kingsley", "ICT01");
        Patron patron2 = new Patron("Infinity", "ICT02");
        library.addPatron(patron1);
        library.addPatron(patron2);


        library.displayBooks();
        library.displayPatron();
    }


    }
}