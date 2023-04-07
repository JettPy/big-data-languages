package lab6.var2;

import java.util.Scanner;

public class ParkingMain {
    public static void main(String[] args) {
        Parking park = new Parking(20, 23);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество машин: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int car = (int)(Math.random() * (50 + 1));
            park.addCar(car);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите номер машины: ");
            int car = scanner.nextInt();
            park.removeCar(car);
        }
    }
}
