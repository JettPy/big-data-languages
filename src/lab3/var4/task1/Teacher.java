package lab3.var4.task1;

public class Teacher {
    private final String name;

    public Teacher(String name) {
        this.name = name;
    }

    public Course announce_course(String course_title) {
        System.out.println(this.name + " announced course: " + course_title);
        return new Course(course_title, this);
    }

    public void rate(Student student, Course course, int mark, Archive archive) {
        archive.writeRecord(course, student, mark);
    }

    public String getName() {
        return name;
    }
}
