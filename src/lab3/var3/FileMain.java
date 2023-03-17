package lab3.var3;

import java.io.IOException;

// Лабораторная работа 3
// Вариант 3
// Задание 1
public class FileMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        MyFile file = new MyFile("data.bat");
        file.create();
        file.rename("file");
        file.delete();
        TextFile text_file = new TextFile("text_file");
        text_file.addText("added text");
        text_file.printFile();
        text_file.rename("new_name");
    }
}
