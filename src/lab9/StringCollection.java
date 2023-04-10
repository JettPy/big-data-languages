package lab9;

import java.util.Arrays;
import java.util.Collection;

// Лабораторная работа 9
// Вариант 1
// Задание 12
public class StringCollection {
    public static void main(String[] args) {
        Collection<String> strings = Arrays.asList(
                "Hello",
                "World",
                "Qwerty",
                "uiop",
                "ev132f23f5",
                "nmw934"
        );
        strings.stream().limit(2).forEach(System.out::println);
    }
}
