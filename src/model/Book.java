package model;

public abstract class Book {
    protected String title;
    protected boolean isRented;

    public Book(String title) {
        this.title = title;
        this.isRented = false;
    }

    public String getTitle() { return title; }

    public boolean isRented() { return isRented; }

    public void rent() { isRented = true; }

    public void returnBook() { isRented = false; }

    public abstract String getType();
}
