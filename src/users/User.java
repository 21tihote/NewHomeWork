package users;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Book> rentedBooks = new ArrayList<>();

    public User(String name) { this.name = name; }

    public String getName() { return name; }

    public void rentBook(Book book) {
        rentedBooks.add(book);
    }

    public void returnBook(Book book) {
        rentedBooks.remove(book);
    }

    public List<Book> getRentedBooks() { return rentedBooks; }
}
