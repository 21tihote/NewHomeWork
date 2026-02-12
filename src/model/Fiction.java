package model;

public class Fiction extends Book {
    public Fiction(String title) {
        super(title);
    }

    @Override
    public String getType() {
        return "Fiction";
    }
}
