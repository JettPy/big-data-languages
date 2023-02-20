package lab1;

import java.util.Scanner;

// Лабораторная работа 1
// Вариант 2
// Задание 12
public class Fibonacci {
    public static int getFibonacci(int index) {
        if (index == 1 || index == 0) return 1;
        if (index > 1) return getFibonacci(index - 1) + getFibonacci(index - 2);
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.print("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            array[i] = number;
        }
        System.out.print("Fibonacci array:");
        for (int num : array) {
            System.out.print(" " + getFibonacci(num));
        }
        System.out.println();
    }
}
