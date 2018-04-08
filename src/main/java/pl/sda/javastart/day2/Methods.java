package pl.sda.javastart.day2;
import java.lang.Math;
public class Methods {
    public static void main(String[] args) {

    }

    public static double calculateRectangleArea(double a, double b) {
        return a*b;

    }

    public static double perimeter(double a, double b) {
        double resultPerimeter = (2 * a) + (2 * b);
        return resultPerimeter;
    }

    public static double inchToMeter(double inch) {
        double resultInchToMeter = inch * 0.0254;
        return resultInchToMeter;
    }

    public static double BMI(double weight, double height){
        double resultBMI=weight/(Math.pow(height,2));
        return resultBMI;
    }


}
