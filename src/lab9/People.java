package lab9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

// Лабораторная работа 9
// Вариант 2
// Задание 11, 12

enum Sex { MAN, WOMAN }

public class People {
    private final String name;
    private final int age;
    private final Sex sex;

    public People(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return name + ": " + age + " years, " + (sex == Sex.MAN ? "male" : "female");
    }

    public static void main(String[] args) {
        Collection<People> peoples = Arrays.asList(
                new People("Ivan", 16, Sex.MAN),
                new People("Petr", 23, Sex.MAN),
                new People("Maria", 42, Sex.WOMAN),
                new People("Vera", 5, Sex.WOMAN)
        );
        System.out.println(peoples.stream().filter(x -> x.sex == Sex.MAN).max(Comparator.comparingInt(x -> x.age)).get());
        System.out.println(peoples.stream().filter(x -> x.name.contains("e")).min(Comparator.comparingInt((x -> x.age))).get());
    }
}
