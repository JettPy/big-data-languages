package lab5.var4;

import java.io.*;

// Лабораторная работа 5
// Вариант 4
// Задание 1
public class PubToPriv {
    public static final File input = new File("./src/lab5/var4/input.txt");
    public static final File output = new File("./src/lab5/var4/output.txt");
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output))) {
            String line;
            while ((line=bufferedReader.readLine())!=null) {
                bufferedWriter.append(line.replace("public", "private")).append(System.lineSeparator());
            }
        }
    }
}
