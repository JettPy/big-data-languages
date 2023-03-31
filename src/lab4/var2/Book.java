package lab4.var2;

public abstract class Book {
    protected final String cipher;
    protected final String author;
    protected final String name;
    protected final int year;
    protected final String publisher;

    protected Book(String cipher, String author, String name, int year, String publisher) {
        this.cipher = cipher;
        this.author = author;
        this.name = name;
        this.year = year;
        this.publisher = publisher;
    }

    public abstract void printBook();
}
