package Object_Oriented;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3, "green", false);
        Shape rectangle = new Rectangle(3, 4, "white", true);
        Rectangle square = new Square(5, "red", true);

        System.out.println(circle.toString());
        System.out.println("Area = " + circle.getArea());
        System.out.println("Perimeter = " + circle.getPerimeter());

        System.out.println(rectangle.toString());
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Perimeter = " + rectangle.getPerimeter());

        System.out.println(square.toString());
        System.out.println("Area = " + square.getArea());
        System.out.println("Perimeter = " + square.getPerimeter());
    }
}
