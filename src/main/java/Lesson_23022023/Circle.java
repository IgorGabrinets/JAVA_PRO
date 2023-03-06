package Lesson_23022023;

public class Circle implements Shape{
    private  double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.sqrt(radius);
    }

    public double getRadius() {
        return 0;
    }

}
