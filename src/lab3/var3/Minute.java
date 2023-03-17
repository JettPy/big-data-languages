package lab3.var3;

import java.util.Objects;

// Лабораторная работа 3
// Вариант 3
// Задание 11
public class Minute {
    private final int minute;

    public Minute(int minute) {
        this.minute = minute % 60;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Minute minute1 = (Minute) o;
        return minute == minute1.minute;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minute);
    }

    @Override
    public String toString() {
        return "" + minute;
    }

    public int getMinute() {
        return minute;
    }
}
