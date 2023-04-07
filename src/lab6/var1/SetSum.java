package lab6.var1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// Лабораторная работа 6
// Вариант 1
// Задание 3
public class SetSum {
    public static void main(String[] args) {
        Set<Integer> nums_set = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            nums_set.add(i + 1);
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        Set<Integer> nextSet = new TreeSet<>();
        while (nums_set.size() > 1) {
            for (Iterator<Integer> it = nums_set.iterator(); it.hasNext(); ) {
                int next_a = it.next();
                it.remove();
                int next_b;
                if (it.hasNext()) {
                    next_b = it.next();
                    it.remove();
                } else {
                    next_b = 0;
                }
                nextSet.add(next_a + next_b);
                System.out.print(next_a + next_b + " ");
            }
            System.out.println();
            for (Iterator<Integer> it = nextSet.iterator(); it.hasNext(); ) {
                int next_a = it.next();
                it.remove();
                int next_b;
                if (it.hasNext()) {
                    next_b = it.next();
                    it.remove();
                } else {
                    next_b = 0;
                }
                nums_set.add(next_a + next_b);
                System.out.print(next_a + next_b + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма: " + nums_set.iterator().next());
    }
}
