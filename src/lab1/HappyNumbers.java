package lab1;

import java.util.LinkedHashSet;
import java.util.Scanner;

// Лабораторная работа 1
// Вариант 2
// Задание 11
public class HappyNumbers {
    public static boolean checkIsHappyNumber(int number) {
        LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>();
        uniqueNumbers.add(number);
        int nextNumber = getNextNumber(number);
        while (nextNumber != 1 && !uniqueNumbers.contains(nextNumber)) {
            uniqueNumbers.add(nextNumber);
            nextNumber = getNextNumber(nextNumber);
        }
        return nextNumber == 1;
    }

    public static int getNextNumber(int number) {
        int digits = number;
        int newNumber = 0;
        while (digits > 0) {
            int value = digits % 10;
            newNumber += value * value;
            digits /= 10;
        }
        return newNumber;
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
        System.out.print("Happy numbers:");
        for (int num: array) {
            if (checkIsHappyNumber(num)) {
                System.out.print(" " + num);
            }
        }
        System.out.println();
    }
}
