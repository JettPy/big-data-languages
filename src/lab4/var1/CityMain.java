package lab4.var1;

import java.util.ArrayList;

// Лабораторная работа 4
// Вариант 1
// Задание 1
public class CityMain {
    public static void main(String[] args) {
        City city = new City("Одинцово");
        city.addRoad("Красногорске", "шоссе", null);
        ArrayList<Pair<String, Integer>> tmp = new ArrayList<>();
        tmp.add(new Pair<>("Красногорске", 2));
        city.addRoad("Новоспортивна", "улица", tmp);
        tmp.clear();
        tmp.add(new Pair<>("Красногорске", 1));
        tmp.add(new Pair<>("Новоспортивна", 4));
        city.addRoad("Можайское", "шоссе", tmp);
        tmp.clear();
        tmp.add(new Pair<>("Можайское", 2));
        tmp.add(new Pair<>("Новоспортивна", 3));
        city.addRoad("Чикина", "улица", tmp);
        System.out.println(city);
        city.findWay("Красногорске", "Чикина");
    }
}
