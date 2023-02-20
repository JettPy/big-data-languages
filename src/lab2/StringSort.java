package lab2;


import java.util.*;

// Лабораторная работа 2
// Вариант 1
// Задание 2
public class StringSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> array = new ArrayList<>();
        System.out.println("Enter " + n + " strings: ");
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            array.add(str);
        }
        System.out.print("Enter 1 to sort in descending order and 2 to sort in ascending order: ");
        int rule = scanner.nextInt();
        if (rule == 1) {
            array.sort((s1, s2) -> s2.length() - s1.length());
        } else {
            array.sort(Comparator.comparingInt(String::length));
        }
        System.out.println("Sorted strings:");
        for (int i = 0; i < n; i++) {
            System.out.println(array.get(i));
        }
        String developer = "Melnikov";
        Date dateOfGettingTask = new Date(2023 - 1900, Calendar.FEBRUARY, 17, 15, 40);
        Date dateOfPassingTask = new Date(2023 - 1900, Calendar.MARCH, 3, 15, 40);
        System.out.println("Developer: " + developer);
        System.out.println("Task got: "+ dateOfGettingTask);
        System.out.println("Task passed: " + dateOfPassingTask);
    }
}
