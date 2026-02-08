package com.library.books;

public abstract class Book {
    private int id;
    private String title;
    private String author;
    private boolean isRented;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isRented = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public abstract String getBookType();

    //   @Override
    public String toString() {
        return getBookType() + "[id=" + id + "'," + title + "'," + author + "," + (isRented ? "Арендовано" : "Доступно") + "]";
    }
}


