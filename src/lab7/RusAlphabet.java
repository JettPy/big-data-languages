package lab7;

import java.util.Scanner;

// Лабораторная работа 7
// Вариант 1
// Задание 2
public class RusAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
//        String text = "Привет мир! Это строка на русском.";
        StringBuilder text_array = new StringBuilder();
        StringBuilder nums_array = new StringBuilder();
        for (char ch: text.toCharArray()) {
            text_array.append("  ").append(ch);
            int num = 0;
            if ('а' <= (int)ch && (int)ch <= 'я' || (int)ch == 'ё') {
                if ((int) ch == (int) 'ё') {
                    num = 7;
                } else if ((int) ch >= 'ж') {
                    num = (int) ch - 'а' + 2;
                } else {
                    num = (int) ch - 'а' + 1;
                }
            } else if ('А' <= (int)ch && (int)ch <= 'Я' || (int)ch == 'Ё') {
                if ((int) ch == (int) 'Ё') {
                    num = 7;
                } else if ((int) ch >= 'Ж') {
                    num = (int) ch - 'А' + 2;
                } else {
                    num = (int) ch - 'А' + 1;
                }
            }
            String str_num;
            if (num == 0) {
                str_num = "   ";
            } else {
                str_num = String.format("%3d", num);
            }
            nums_array.append(str_num);
        }
        System.out.println("Текст, разбитый по буквам и номера букв:");
        System.out.println(text_array);
        System.out.println(nums_array);
    }
}
