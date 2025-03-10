package polymorphism.task_1;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(4);
        double circleArea = circle.calculateArea();
        System.out.println("The circle area is: " + circleArea);

        Rectangle rectangle = new Rectangle(8, 4);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("The rectangle area is: " + rectangleArea);
    }
}
