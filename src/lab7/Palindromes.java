package lab7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Лабораторная работа 7
// Вариант 2
// Задание 1
public class Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String initial_text = scanner.nextLine();
//        String initial_text = "Идем молод долом меди меди тот";
        String[] text = initial_text.replaceAll("[/.,\"():]", "").toLowerCase().trim().split("\\s+");
        int[] is_used = new int[text.length];
        List<Pair<String, String>> pairs = new ArrayList<>();
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < text.length; j++) {
                StringBuilder word = new StringBuilder(text[j]);
                if (text[i].equals(word.reverse().toString()) && is_used[i] == 0 && is_used[j] == 0 && i != j) {
                    pairs.add(new Pair<>(text[i], text[j]));
                    is_used[i] = 1;
                    is_used[j] = 1;
                }
            }
        }
        System.out.println("Все пары слов:");
        for (Pair<String, String> pair: pairs) {
            System.out.println(pair.first + " " + pair.second);

        }
    }
}
