package polymorphism.task_1;

import polymorphism.task_1.Shape;

public class Rectangle extends polymorphism.task_1.Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

}
