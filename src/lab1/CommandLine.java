package lab1;

// Лабораторная работа 1
// Вариант 1
// Задание 5
public class CommandLine {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;
        for (String arg : args) {
            int num = Integer.parseInt(arg);
            sum += num;
            product *= num;
        }
        System.out.println("Sum of elements: " + sum + "\nProduct of elements: " + product);
    }
}
