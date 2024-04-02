package m23_method_overloading;

public class CalculateArea {
    public static void main(String[] args) {
        double areaOfCircle = calculateArea(5);
        System.out.println("Area of the circle: " + areaOfCircle);
        double areaOfRectangle = calculateArea(4, 6);
        System.out.println("Area of the rectangle: " + areaOfRectangle);
    }
    public static double calculateArea (double radius){
        // for calculating the area of the circle;
        return radius * radius * 3.14;

    }
    public static double calculateArea (double length, double width){
        // for calculating the area of rectangle
        return length * width;
    }
}
