package lab3.var4.task1;

public class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public void goToCourse(Course course) {
        System.out.println("Student " + name + " enrolled in a course " + course.getTitle());
        course.addStudent(this);
    }

    public String getName() {
        return name;
    }
}
