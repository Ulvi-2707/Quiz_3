package encapsulation.task_2;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percent) {
        if(percent > 0) {
            salary += salary * (percent / 100);
        }
        else {
            System.err.println("You must enter a positive number");
        }
    }


}
