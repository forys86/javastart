package pl.sda.javastart.day1;

import java.util.Scanner;
import java.lang.Math;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner oneScanner = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę:");
        double a = oneScanner.nextDouble();//czyta nastepna linijke
        System.out.println("Wprowadź drugą liczbę:");
        double b = oneScanner.nextDouble();
        System.out.println("" + a + "+" + b + "=" + (a + b));
        System.out.println("" + a + "-" + b + "=" + (a - b));
        System.out.println("" + a + "*" + b + "=" + (a * b));
        System.out.println("" + a + "/" + b + "=" + (a / b));
        System.out.println("" + a + "%" + b + "=" + (a % b));
        System.out.println(Math.abs(a + b));
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));
        System.out.println(Math.pow(a, b));
        System.out.printf("Square: %12.2f\n", Math.pow(a, b));
        System.out.printf("Cube: %14.2f\n", Math.pow(a, b));
        System.out.printf("Fourth power: %6.2f\n", Math.pow(a, 4));

        int x = 3;
        int y;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x);
        y = x++;
        System.out.println(y);
        y = ++x;
        System.out.println(y);
        System.out.println(++y);
        }


    public int add(int a,int b){
        return a + b;
    }

    public static double multiplier(double a, double b) {
        return a * b;
    }


    public static int adder(int a, int secondValue) {
        int result = a + secondValue;
        return result;
    }

    public static double adder(double a, double secondValue) {
        double result = a + secondValue;
        return result;
    }

}
