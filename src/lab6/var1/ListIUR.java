package lab6.var1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Лабораторная работа 6
// Вариант 1
// Задание 2
public class ListIUR {
    public static void main(String[] args) {
        List<Double> I = new ArrayList<>();
        List<Double> U = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество измерений: ");
        int n = scanner.nextInt();
        System.out.println("Введите измерения тока (I):");
        for (int i = 0; i < n; i++) {
            double value = scanner.nextDouble();
            I.add(value);
        }
        System.out.println("Введите измерения напряжения (U):");
        for (int i = 0; i < n; i++) {
            double value = scanner.nextDouble();
            U.add(value);
        }
        double num = 0;
        double den = 0;
        for (int i = 0; i < n; i++) {
            num += I.get(i) * U.get(i);
            den += I.get(i) * I.get(i);
        }
        System.out.println("Сопротивление (R): " + num / den);
    }
}
