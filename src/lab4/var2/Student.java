package lab4.var2;

public abstract class Student implements Enrollee {
    protected final String name;
    protected final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void sayHi();

    @Override
    public void prepare_for_exams() {
        System.out.println("Студент " + name + " готовится к экзамену");
    }
}
