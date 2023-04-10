package lab9;

import java.util.Arrays;
import java.util.Collection;

// Лабораторная работа 9
// Вариант 1
// Задание 11
public class Student {
    private final String name;
    private int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public static void main(String[] args) {
        Collection<Student> students = Arrays.asList(
                new Student("Ivan", 40),
                new Student("Petr", 60),
                new Student("Olga", 70)
        );
        double avg_score = students.stream().reduce((student, all_scores) ->
                new Student("", all_scores.score + student.score)).get().score * 1.0 / students.size();
        System.out.println("Средний балл: " + avg_score);
    }
}
