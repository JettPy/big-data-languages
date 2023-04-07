package lab4.var2;

// Лабораторная работа 4
// Вариант 2
// Задание 1
public class BookMain {
    public static void main(String[] args) {
        Encyclopedia a = new Encyclopedia(
                "1 99, 1 00 — 1 11",
                "Некрасов",
                "Мир растений",
                2010,
                "РосКниги"
        );
        Handbook b = new Handbook(
                " 12 99, 12 00 — 12 11",
                "Чехов",
                "Физика на каждый день",
                2011,
                "Учебники России"
                );
        a.printBook();
        b.printBook();
    }
}
