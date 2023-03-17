package lab3.var4.task1;

import java.util.ArrayList;

public class Course {

    private final String title;
    private final Teacher teacher;
    private final ArrayList<Student> students;

    public Course(String title, Teacher teacher) {
        this.title = title;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void study() {
        System.out.println(this.teacher.getName() + " teaches subject " + this.title);
        for (Student student: students) {
            System.out.println(student.getName() + ": done");
        }
    }
}
