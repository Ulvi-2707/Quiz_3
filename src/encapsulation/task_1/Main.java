package encapsulation.task_1;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Elton Jon");
        student.setGrade(69);

        System.out.println(student.getName() + "'s grade is " + student.getGrade());
    }

}
