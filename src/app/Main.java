package app;

import library.Library;
import model.Book;
import model.Fiction;
import model.Textbook;
import users.User;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        User alice = new User("Alice");

        Book book1 = new Fiction("Война и мир");
        Book book2 = new Textbook("Математика 10 класс");

        library.addBook(book1);
        library.addBook(book2);

        library.rentBook(alice, book1);
        System.out.println(alice.getRentedBooks().get(0).getTitle()); // Война и мир
    }
}
