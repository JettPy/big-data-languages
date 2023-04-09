package lab7;

import java.util.Arrays;
import java.util.Scanner;

// Лабораторная работа 7
// Вариант 4
// Задание 1
public class SortByLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
//        String text = "crab apple abacaba allocator all aaaaaa aerobus abroad actually ago age";
        String[] words = text.split(" ");
        System.out.print("Введите букву: ");
        char ch = scanner.next().charAt(0);
        Arrays.sort(words, (s1, s2) -> {
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == ch) {
                    count1 += 1;
                }
            }
            for (int i = 0; i < s2.length(); i++) {
                if (s2.charAt(i) == ch) {
                    count2 += 1;
                }
            }
            if (count1 > count2)
                return 1;
            else if (count1 == count2)
                return s1.compareTo(s2);
            else
                return -1;
        });
        for(String word: words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}
