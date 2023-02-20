package lab1;

import java.util.Calendar;
import java.util.GregorianCalendar;

// Лабораторная работа 1
// Вариант 1
// Задание 6
public class SurnameAndDate {
    public static void main(String[] args) {
        String surname = "Melnikov";
        Calendar dateOfGettingTask = new GregorianCalendar(2023, Calendar.FEBRUARY, 17, 15, 40);
        Calendar dateOfPassingTask = new GregorianCalendar(2023, Calendar.MARCH, 3, 15, 40);
        System.out.println("Developer: " + surname);
        System.out.println("Task got: "+ dateOfGettingTask.getTime());
        System.out.println("Task passed: " + dateOfPassingTask.getTime());
    }
}
