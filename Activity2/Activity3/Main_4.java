public class Main {
    public static void main(String[] args) {
        // Iterate through the enum values and calculate area and perimeter
        for (Shape shape : Shape.values()) {
            System.out.println("Shape: " + shape);
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
        }
    }
}
