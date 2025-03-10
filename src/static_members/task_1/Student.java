package static_members.task_1;

public class Student {
    private final String name;
    private static int totalStudents;

    public Student(String name) {
        this.name = name;
        totalStudents++;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", totalStudents=" + getTotalStudents() + "]";
    }
}
