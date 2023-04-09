package lab7;

import java.util.Scanner;

// Лабораторная работа 7
// Вариант 1
// Задание 1
public class ReplaceKLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String[] text = scanner.nextLine().trim().split("\\s+");
//        String[] text = ("My name is Dima. I am a student of the second year of study. I study at the university. " +
//                "My hobby is music. When I have free time I usually go to the biggest music shop in my town and " +
//                "buy CDs with my favourite music. I have a big collection of CDs at home, but I can not resist " +
//                "the temptation of buying a new CD. That what I like to buy most of all.").trim().split("\\s+");
        System.out.print("Введите номер буквы в слове: ");
        int n = scanner.nextInt();
        System.out.print("Введите символ: ");
        char ch = scanner.next().charAt(0);
        for (int i = 0; i < text.length; i++) {
            if (text[i].length() > n) {
                char[] chars = text[i].toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    if ((j + 1) % n == 0) {
                        chars[j] = ch;
                    }
                }
                text[i] = new String(chars);
            }
        }
        System.out.println("Текст после замены букв:");
        for (String s : text) {
            System.out.print(s + " ");
        }
    }
}
