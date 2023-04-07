package lab5.var2;

import java.util.Arrays;
import java.util.Scanner;

// Лабораторная работа 5
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
        if (customers == null) {
            throw new IllegalArgumentException("Customer is empty!");
        }
        if (lower.length() != 16 || upper.length() != 16) {
            throw new IllegalArgumentException("Card number must be with 16 digits!");
        }
        for (int i = 0; i < lower.length(); i++) {
            if (!Character.isDigit(lower.charAt(i)) || !Character.isDigit(upper.charAt(i))) {
                throw new IllegalArgumentException("Card number must be only with digits!");
            }
        }
        for ( Customer customer : customers) {
            if (lower.compareTo(customer.getCard_number()) <= 0 && upper.compareTo(customer.getCard_number()) >= 0)
                System.out.println(customer);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of customers: ");
        String buffer = scanner.nextLine();
        int n;
        try {
            n = Integer.parseInt(buffer);
        } catch (NumberFormatException e) {
            System.out.println("Not valid input, should be int!");
            return;
        }
        Customer[] customers;
        try {
            customers = new Customer[n];
        } catch (NegativeArraySizeException e) {
            System.out.println("Count of customers must be positive!");
            return;
        } catch (OutOfMemoryError e) {
            System.out.println("Too big count of customers!");
            return;
        }
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
        try {
            printCustomersWithCardInRange(customers, card_lower, card_upper);
        } catch (IllegalArgumentException e) {
            System.out.println("Card numbers must be only with 16 digits!");
        }
    }
}
