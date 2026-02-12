package model;

public class Main {
    public static void main(String[] args) {
        // Передаём числовой id и строку name
        Author author = new Author(1, "Толстой");

        // Используем конкретный класс, а не абстрактный Book
        Book book = new FictionBook(1, "Война и мир", author);

        System.out.println(book);

        // Если есть класс FictionBook, можно создать и вывести его тоже
        // FictionBook fnBook = new FictionBook(...);
        // System.out.println(fnBook);
    }
}
