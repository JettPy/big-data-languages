package lab7;

import java.util.Scanner;

// Лабораторная работа 7
// Вариант 3
// Задание 1
public class WordsChain {

    public static int next_word(String[] words, String word) {
        for (int i = 0; i < words.length; i++)
            if (words[i].charAt(0) == word.charAt(word.length() - 1))
                return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String initial_text = scanner.nextLine();
//        String initial_text = "Hello abc world, Oliver down night clone Eliot radius trello";
        String[] text = initial_text.replaceAll("[/.,\"():]", "").toLowerCase().trim().split("\\s+");
        int start = 0;
        int max_len = 0;
        for (int i = 0; i < text.length; i++) {
            int count = 1;
            String word = text[i];
            int next_word_pos = next_word(text, word);
            while (next_word_pos != -1) {
                count++;
                word = text[next_word_pos];
                next_word_pos = next_word(text, word);
            }
            if (count > max_len) {
                max_len = count;
                start = i;
            }
        }
        int next = next_word(text, text[start]);
        System.out.print(text[start] + " ");
        while (next != -1) {
            System.out.print(text[next] + " ");
            next = next_word(text, text[next]);
        }
        System.out.println();
    }
}
