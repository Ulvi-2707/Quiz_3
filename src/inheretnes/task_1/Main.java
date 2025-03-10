package inheretnes.task_1;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", 180, 4);

        car1.displayInfo();

        System.out.println();

        Car car2 = new Car("BMW", 220, 2);

        car2.displayInfo();
    }
}
