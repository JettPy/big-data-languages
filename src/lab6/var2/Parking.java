package lab6.var2;

import java.util.ArrayList;
import java.util.List;

// Лабораторная работа 6
// Вариант 2
// Задание 2
public class Parking {
    private int[] parking;
    private  int count;
    private int hash;

    public Parking(int n, int hash) {
        parking = new int[n];
        this.hash = hash;
        count = 0;
    }

    public void addCar(int car_num) {
        if (count == parking.length) {
            System.out.println("Нет свободного места!");
            return;
        }
        int index = car_num % parking.length % this.hash;
        while (parking[index] != 0) {
            index = (index + 1) % parking.length;
        }
        parking[index] = car_num;
        count++;
        System.out.println("Машина " + car_num + " заехала на место " + index + ". Осталось мест: " + (parking.length - count));
    }

    public void removeCar(int car_num) {
        if (count == 0) {
            System.out.println("Парковка свободна!");
            return;
        }
        int index = car_num % parking.length % this.hash;
        int init = index;
        while (parking[index] != car_num) {
            index = (index + 1) % parking.length;
            if (index == init) {
                System.out.println("Машины " + car_num + " нет на парковке");
                return;
            }
        }
        parking[index] = 0;
        count--;
        System.out.println("Машина " + car_num + " уехала с места " + index + ". Осталось мест: " + (parking.length - count));
    }
}
