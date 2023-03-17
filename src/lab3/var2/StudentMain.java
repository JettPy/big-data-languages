package lab3.var2;

import java.text.ParseException;
import java.util.*;

// Лабораторная работа 3
// Вариант 2
// Задание 1
public class StudentMain {
    public static void printStudentsFromFaculty(Student[] students, String faculty) {
        for (Student student: students) {
            if (student.getFaculty().equals(faculty)) {
                System.out.println(student);
            }
        }
    }

    public static void printStudentsByFacultyAndCourse(Student[] students) {
        HashMap<String, HashMap<Integer, ArrayList<Student>>> grouped_students = new HashMap<>();
        for (Student student: students) {
            String faculty = student.getFaculty();
            int course = student.getCourse();
            if (grouped_students.containsKey(faculty)) {
                if (grouped_students.get(faculty).containsKey(course)) {
                    grouped_students.get(faculty).get(course).add(student);
                } else {
                    ArrayList<Student> students_in_course = new ArrayList<>();
                    students_in_course.add(student);
                    grouped_students.get(faculty).put(course, students_in_course);
                }
            } else {
                HashMap<Integer, ArrayList<Student>> students_on_faculty = new HashMap<>();
                ArrayList<Student> students_in_course = new ArrayList<>();
                students_in_course.add(student);
                students_on_faculty.put(course, students_in_course);
                grouped_students.put(faculty, students_on_faculty);
            }
        }
        for (Map.Entry<String, HashMap<Integer, ArrayList<Student>>> entry: grouped_students.entrySet()) {
            String f_key = entry.getKey();
            HashMap<Integer, ArrayList<Student>> value = entry.getValue();
            for (Map.Entry<Integer, ArrayList<Student>> inner_entry: value.entrySet()) {
                int c_key = inner_entry.getKey();
                ArrayList<Student> s_value = inner_entry.getValue();
                System.out.println("Faculty: " + f_key + ", course: " + c_key + ":");
                for (Student student: s_value) {
                    System.out.println(student);
                }
            }
        }
    }

    public static void printStudentsAfterDate(Student[] students, Date date) {
        for (Student student: students) {
            if (student.getBirthday().after(date)) {
                System.out.println(student);
            }
        }
    }

    public static void printStudentsFromGroup(Student[] students, String faculty, int course, int group) {
        for (Student student : students) {
            if (student.getGroup() == group && student.getFaculty().equals(faculty) && student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student(
                    i,
                    DataGenerator.randomSurname(),
                    DataGenerator.randomName(),
                    DataGenerator.randomPatronymic(),
                    DataGenerator.randomDate(),
                    DataGenerator.randomAddress(),
                    DataGenerator.randomPhoneNumber(),
                    DataGenerator.randomFaculty(),
                    DataGenerator.randomCourse(),
                    DataGenerator.randomGroup()
            );
        }
        System.out.println("All students:");
        for (int i = 0; i < n; i++) {
            System.out.println(students[i]);
        }
        System.out.print("Enter faculty name: ");
        String f = scanner.nextLine();
        printStudentsFromFaculty(students, f);
        printStudentsByFacultyAndCourse(students);
        System.out.print(" Enter year: ");
        Date date = new Date(scanner.nextInt() - 1900, Calendar.DECEMBER, 31);
        printStudentsAfterDate(students, date);
        scanner.nextLine();
        System.out.print("Enter groups faculty: ");
        String faculty = scanner.nextLine();
        System.out.print("Enter groups course: ");
        int course = scanner.nextInt();
        System.out.print("Enter group: ");
        int group = scanner.nextInt();
        printStudentsFromGroup(students, faculty, course, group);
    }
}
