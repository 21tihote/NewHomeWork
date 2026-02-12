package model;

public class Textbook extends Book {
    public Textbook(String title) {
        super(title);
    }

    @Override
    public String getType() {
        return "Textbook";
    }
}
