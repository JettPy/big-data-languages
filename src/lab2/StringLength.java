package lab2;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

// Лабораторная работа 2
// Вариант 1
// Задание 1
public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int min_length = -1;
        int max_length = -1;
        String max_str = "";
        String min_str = "";
        System.out.println("Enter " + n + " strings: ");
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            if (min_length == -1 || min_length > str.length()) {
                min_length = str.length();
                min_str = str;
            }
            if (max_length == -1 || max_length < str.length()) {
                max_length = str.length();
                max_str = str;
            }
        }
        System.out.println("The largest string: " + max_str + " size: " + max_length);
        System.out.println("The smallest string: " + min_str + " size: " + min_length);
        String developer = "Melnikov";
        Date dateOfGettingTask = new Date(2023 - 1900, Calendar.FEBRUARY, 17, 15, 40);
        Date dateOfPassingTask = new Date(2023 - 1900, Calendar.MARCH, 3, 15, 40);
        System.out.println("Developer: " + developer);
        System.out.println("Task got: "+ dateOfGettingTask);
        System.out.println("Task passed: " + dateOfPassingTask);
    }
}
