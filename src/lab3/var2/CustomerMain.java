package lab3.var2;

import java.util.Arrays;
import java.util.Scanner;

// Лабораторная работа 3
// Вариант 2
// Задание 2
public class CustomerMain {
    public static void printCustomersSorted(Customer[] customers) {
        Arrays.sort(customers);
        for ( Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public static void printCustomersWithCardInRange(Customer[] customers, String lower, String upper) {
        for ( Customer customer : customers) {
            if (lower.compareTo(customer.getCard_number()) <= 0 && upper.compareTo(customer.getCard_number()) >= 0)
                System.out.println(customer);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of customers: ");
        int n = Integer.parseInt(scanner.nextLine());
        Customer[] customers = new Customer[n];
        System.out.println("Generated customers:");
        for (int i = 0; i < n; i++) {
            customers[i] = new Customer(
                    i,
                    DataGenerator.randomName(),
                    DataGenerator.randomSurname(),
                    DataGenerator.randomPatronymic(),
                    DataGenerator.randomAddress(),
                    DataGenerator.randomCardNumber(),
                    DataGenerator.randomAccountNumber()
            );
            System.out.println(customers[i]);
        }
        System.out.println("Sorted customers:");
        printCustomersSorted(customers.clone());
        System.out.print("Enter lower card number: ");
        String card_lower = scanner.nextLine();
        System.out.print("Enter upper card number: ");
        String card_upper = scanner.nextLine();
        printCustomersWithCardInRange(customers, card_lower, card_upper);
    }
}
