package lab3.var3;

import java.io.*;

// Лабораторная работа 3
// Вариант 3
// Задание 1
public class TextFile extends MyFile{
    public TextFile(String name) {
        super(name + ".txt");
    }

    public void printFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(this.name + "." + this.format))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addText(String text) {
        try(FileWriter writer = new FileWriter(this.name + "." + this.format, true)) {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
