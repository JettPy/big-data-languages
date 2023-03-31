package lab4.var2;

public class Encyclopedia extends Book {
    public Encyclopedia(String cipher, String author, String name, int year, String publisher) {
        super(cipher, author, name, year, publisher);
    }

    @Override
    public void printBook() {
        System.out.println("Это энциклопедия");
        System.out.println("        Шифр: " + this.cipher);
        System.out.println("       Автор: " + this.author);
        System.out.println("    Название: " + this.name);
        System.out.println("         Год: " + this.year);
        System.out.println("Издательство: " + this.publisher);
    }
}
