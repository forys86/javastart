package pl.sda.javastart.day2;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        printArray(5, 10);
        //printNamesWithComa();
    }

    private static void printNamesWithComa() {
        Scanner cin = new Scanner(System.in);
        String[] names = new String[5];
        int i = 0;
        do {
            System.out.println("Podaj kolejne imię:");
            String name = cin.nextLine();
            names[i] = name;

            i++;
        } while (i < 5);
        for (String name : names) {
            System.out.println(name + ", ");
        }
    }

    public static void printArray(int arraysSize, int elements) {

        int[] arrays = new int[arraysSize < elements ? elements : arraysSize];

        for (int i = 0; i <= elements; i++) {
            arrays[i] = 7;
        }
        for (int array : arrays) {
            System.out.println(array);
        }


    }

    public static void sumElementsOfArray(int[] array) {
        int sumOfArrayElements = 0;

//        for (int i=0; i<array.length;i++) {
//            sumOfArrayElements += array[i];
//        }

        for (int element : array) {
            sumOfArrayElements += element;
        }
        System.out.println(sumOfArrayElements);

        int sum = Arrays.stream(array).sum();
        System.out.println(sum);

    }


    /*public boolean comperArrays(int[] arraysOne, int[] arraysSecond) {
        int iterator = 0;
        for (int nummebrValue : arraysOne) {
            if (nummebrValue != arraysSecond[iterator]) ;
        }
   */
}


