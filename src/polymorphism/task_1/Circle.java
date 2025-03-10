package polymorphism.task_1;

import polymorphism.task_1.Shape;

public class Circle extends polymorphism.task_1.Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
