enum Shape {
    Circle(3.0),  // Radius
    Square(4.0),  // Side length
    Triangle(5.0, 4.0, 3.0);  // Side lengths

    // gDefine ang instance na variables for each shape
    private double side1;
    private double side2;
    private double side3;

    // Constructors for shapes with different numbers of sides
    Shape(double side) {
        this.side1 = side;
    }

    Shape(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Method to calculate the area for each shape
    public double calculateArea() {
        if (this == Circle) {
            return Math.PI * side1 * side1;  // Area of a circle
        } else if (this == Square) {
            return side1 * side1;  // Area of a square
        } else if (this == Triangle) {
            // Heron's formula to calculate the area of a triangle
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }
        return 0.0;  // Default value
    }

    // Method to calculate the perimeter for each shape
    public double calculatePerimeter() {
        if (this == Circle) {
            return 2 * Math.PI * side1;  // Circumference of a circle
        } else if (this == Square) {
            return 4 * side1;  // Perimeter of a square
        } else if (this == Triangle) {
            return side1 + side2 + side3;  // Perimeter of a triangle
        }
        return 0.0;  // Default value
    }
}