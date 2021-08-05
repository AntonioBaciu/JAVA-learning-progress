public class AreaCalculator {

    public static double area(double radius){
        if(radius < 0) {
            return -1.0;
        }
        // Math.Pi = value of PI  &  Math.pow(value, POWER) = value ** POWER
        return Math.PI * Math.pow(radius, 2); // circle radius = PI * radius ** 2
    }

    // x - width , y - height
    public static double area(double x, double y){
        if(x < 0 || y < 0){
            return -1.0;
        }
        return x * y; // rectangle area = height * width
    }
}
