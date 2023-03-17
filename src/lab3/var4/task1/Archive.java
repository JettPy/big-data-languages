package lab3.var4.task1;

import java.util.HashMap;
import java.util.Map;

public class Archive {
    private final HashMap<Course, HashMap<Student, Integer>> store;

    public Archive() {
        this.store = new HashMap<>();
    }

    public void writeRecord(Course course, Student student, int mark) {
        if (store.containsKey(course)) {
            if (store.get(course).containsKey(student)) {
                store.get(course).replace(student, mark);
            } else {
                store.get(course).put(student, mark);
            }
        } else {
            HashMap<Student, Integer> students = new HashMap<>();
            students.put(student, mark);
            store.put(course, students);
        }
    }

    public void printTable() {
        for (Map.Entry<Course, HashMap<Student, Integer>> entry: store.entrySet()) {
            String course_name = entry.getKey().getTitle();
            HashMap<Student, Integer> students_map = entry.getValue();
            System.out.println("Course: " + course_name + ":");
            for (Map.Entry<Student, Integer> students: students_map.entrySet()) {
                String student = students.getKey().getName();
                int mark = students.getValue();
                System.out.println(student + " - " + mark);
            }
        }
    }
}
