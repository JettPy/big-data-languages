package lab3.var4.task1;

// Лабораторная работа 3
// Вариант 4
// Задание 1
public class ElectiveMain {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ivanov S.V.");
        Teacher t2 = new Teacher("Orehov A.D");
        Course ml_course = t1.announce_course("Machine learning");
        Course big_data_course = t1.announce_course("Big Data");
        Course math_analyze_course = t2.announce_course("Math analyze");
        Student s1 = new Student("Petrov E. K.");
        Student s2 = new Student("Sidorov S. M.");
        Student s3 = new Student("Kasperov V. N");
        s1.goToCourse(ml_course);
        s2.goToCourse(big_data_course);
        s1.goToCourse(math_analyze_course);
        s3.goToCourse(math_analyze_course);
        ml_course.study();
        big_data_course.study();
        math_analyze_course.study();
        Archive archive = new Archive();
        t1.rate(s1, ml_course, 5, archive);
        t1.rate(s2, big_data_course, 4, archive);
        t2.rate(s1, math_analyze_course, 3, archive);
        t2.rate(s3, math_analyze_course, 4, archive);
        archive.printTable();
    }
}
