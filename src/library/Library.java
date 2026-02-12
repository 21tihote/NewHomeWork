package library;

import model.Book;
import users.User;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) { books.add(book); }

    public boolean rentBook(User user, Book book) {
        if (!book.isRented()) {
            book.rent();
            user.rentBook(book);
            return true;
        }
        return false;
    }

    public void returnBook(User user, Book book) {
        if (book.isRented()) {
            book.returnBook();
            user.returnBook(book);
        }
    }

    public List<Book> getAvailableBooks() {
        List<Book> result = new ArrayList<>();
        for (Book b : books) {
            if (!b.isRented()) result.add(b);
        }
        return result;
    }
}
