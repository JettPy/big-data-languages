package lab4.var2;

public class DistanceStudent extends Student {
    public DistanceStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHi() {
        System.out.println("Студент " + name + ", " + age + " лет. На заочном обучении");
    }
}
