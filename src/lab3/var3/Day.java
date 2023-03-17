package lab3.var3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

// Лабораторная работа 3
// Вариант 3
// Задание 11
public class Day {
    private final Hour hours;
    private final Minute minute;

    public Day(int hours, int minute) {
        this.hours = new Hour(hours);
        this.minute = new Minute(minute);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Day day = (Day) o;
        return Objects.equals(hours, day.hours) && Objects.equals(minute, day.minute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, minute);
    }

    @Override
    public String toString() {
        return "Time: " + hours + ":" + minute;
    }

    public static String now() {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("hh:mm");
        return  formatForDateNow.format(dateNow);
    }

    public String timeOfDay() {
        int time = hours.getHour() * 60 + minute.getMinute();
        if (time < 6 * 60) {
            return "night";
        } else if (time < 12 * 60) {
            return "morning";
        } else if (time < 18 * 60) {
            return "afternoon";
        } else {
            return "evening";
        }
    }
}
