package lab6.var2;

import java.util.Scanner;

public class MumListMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов: ");
        NumsList list = new NumsList();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int element = (int)(Math.random() * (50 + 1));
            list.add(element);
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        System.out.println("Ближайшее число: " + list.closest(a));
    }
}
