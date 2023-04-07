package lab5.var3;

import java.io.*;
import java.nio.charset.StandardCharsets;

// Лабораторная работа 5
// Вариант 3
// Задание 1
public class SubstringDeleting {
    public static String input = "./src/lab5/var3/input.txt";
    public static String output = "./src/lab5/var3/output2.txt";

    public static void replace_str(String old_str, String new_str) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(input), StandardCharsets.UTF_8));
        FileWriter writer = new FileWriter(output);
        String tmp;
        String ost;
        int size = old_str.length();
        while ((tmp = reader.readLine()) != null) {
            int i = tmp.indexOf(old_str);
            if (i != -1) {
                ost = tmp;
                while (i != -1) {
                    writer.write(ost.substring(0, i));
                    writer.write(new_str);
                    ost = ost.substring(i + size);
                    i = ost.indexOf(old_str);
                    if(i == -1) {
                        writer.write(ost + "\n");
                    }
                }
            } else {
                writer.write(tmp + "\n");
            }
        }
        reader.close();
        writer.close();
    }
    public static void main(String[] args) throws IOException {
        replace_str("было", "");
    }
}
