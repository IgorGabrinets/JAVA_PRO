package Lesson_23022023;

public class AppShape {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(10, 100);

        System.out.println("Area circle = " + circle.getArea());
        System.out.println("Area Rectangle = " + rectangle.getArea());
    }
}
