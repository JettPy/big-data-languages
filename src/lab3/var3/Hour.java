package lab3.var3;

import java.util.Objects;

// Лабораторная работа 3
// Вариант 3
// Задание 11
public class Hour {
    private final int hour;

    public Hour(int hour) {
        this.hour = hour % 24;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Hour hour1 = (Hour) object;
        return hour == hour1.hour;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), hour);
    }

    @Override
    public String toString() {
        return "" + hour;
    }

    public int getHour() {
        return hour;
    }
}
