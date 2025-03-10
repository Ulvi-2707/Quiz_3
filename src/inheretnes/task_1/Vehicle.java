package inheretnes.task_1;

public class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Mark: " + brand);
        System.out.println("Speed: " + speed + " km/saat");
    }

}
