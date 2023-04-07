package lab5.var4;

import java.io.*;

// Лабораторная работа 5
// Вариант 4
// Задание 2
public class ReverseOrder {
    public static final File input = new File("./src/lab5/var4/input.txt");
    public static final File output = new File("./src/lab5/var4/output2.txt");

    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output))) {
            String line;
            while ((line=bufferedReader.readLine())!=null) {
                bufferedWriter.append(new StringBuilder(line).reverse().toString()).append(System.lineSeparator());
            }
        }
    }
}
