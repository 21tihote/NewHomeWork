package com.library.books;

public class FictionBook extends Book {
    public FictionBook(int id, String title, Author author) {
        // Передаем имя автора (строку), а не объект Author
        super(id, title, author.getName());
    }

    @Override
    public String getBookType() {
        return "художественная литература";
    }
}
