package lab3.var3;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

// Лабораторная работа 3
// Вариант 3
// Задание 1
public class MyFile {
    protected String name;
    protected final String format;

    public MyFile(String file) {
        String[] parse = file.split("\\.");
        this.name = parse[0];
        this.format = parse[1];
    }

    public void create() {
        try {
            new File(this.name + "." + this.format).createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void rename(String new_name) {
        File f1 = new File(this.name + "." + this.format);
        File f2 = new File(new_name + "." + this.format);
        f1.renameTo(f2);
        this.name = new_name;
    }
    public void delete() {
        new File(this.name + "." + this.format).delete();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyFile myFile = (MyFile) o;
        return Objects.equals(name, myFile.name) && Objects.equals(format, myFile.format);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, format);
    }

    @Override
    public String toString() {
        return "File: " + name + '.' + format;
    }
}
