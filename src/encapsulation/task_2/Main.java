package encapsulation.task_2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Imran", 1500);

        System.out.println(employee.getName() + "-" + employee.getSalary() + "AZN");

        employee.increaseSalary(10);

        System.out.println(employee.getName() + "-" + employee.getSalary() + "AZN - new salary");
    }
}
