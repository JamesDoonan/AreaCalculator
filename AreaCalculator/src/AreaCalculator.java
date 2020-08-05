public class AreaCalculator {
public static double area(double radius) {
    if (radius < 0) {
        return -1.0;
    }
    double AreaCircle = radius * radius * Math.PI;
    return AreaCircle;
}


public static double area(double x, double y){
    if (x < 0){
        System.out.println("-1");
        return -1.0;
    }
    if (y < 0){
        System.out.println("-1");
        return  -1.0;
    }
    double areaRectangle = x * y ;
    System.out.println("The value of the rectangle is "+ areaRectangle);
    return areaRectangle;
}}
