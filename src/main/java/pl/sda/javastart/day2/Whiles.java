package pl.sda.javastart.day2;

import java.util.Scanner;

public class Whiles {
    public static void main(String[] args) {
    whileBasics();
    }

    private static void whileBasics() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Wprowadź ilośc pozdrowień:");
        double howManyTimes = scanner.nextDouble();

        int i =0;
        while(i<howManyTimes){
            System.out.println("Cześc tu petla while po raz"+(i+1));
            i++;
        }
    }

}
