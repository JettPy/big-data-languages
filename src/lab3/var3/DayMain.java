package lab3.var3;

// Лабораторная работа 3
// Вариант 3
// Задание 11
public class DayMain {
    public static void main(String[] args) {
        Day d = new Day(12, 34);
        System.out.println(d);
        System.out.println(Day.now());
        System.out.println(d.timeOfDay());
    }
}