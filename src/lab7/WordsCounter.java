package lab7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Лабораторная работа 7
// Вариант 2
// Задание 2
public class WordsCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String initial_text = scanner.nextLine();
//        String initial_text = "Идем молод долом меди меди тот";
        String[] text = initial_text.replaceAll("[/.,\"():]", "").toLowerCase().trim().split("\\s+");
        Map<String, Integer> words = new HashMap<>();
        for (String word: text) {
            Integer count = words.get(word);
            if(count == null) {
                count = 0;
            }
            words.put(word, ++count);
        }
        System.out.println("Итого слов:");
        for(String word : words.keySet()) {
            System.out.println(word + ": " + words.get(word));
        }
    }
}
