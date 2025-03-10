package polymorphism.task_2;

public class Main {
    public static void main(String[] args) {

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Employee1", 45);
        fullTimeEmployee.displayInfo();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Employee2", 5, 8);
        partTimeEmployee.displayInfo();
    }
}
