package lab4.var2;

public class Handbook extends Book {

    public Handbook(String cipher, String author, String name, int year, String publisher) {
        super(cipher, author, name, year, publisher);
    }

    @Override
    public void printBook() {
        System.out.println("Это справочник");
        System.out.println("        Шифр: " + this.cipher);
        System.out.println("       Автор: " + this.author);
        System.out.println("    Название: " + this.name);
        System.out.println("         Год: " + this.year);
        System.out.println("Издательство: " + this.publisher);
    }
}
