package pl.sda.javastart.day2;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Fors {
    public static void main(String[] args) {
        fibunacci(5);
        /* tenTimeHellowWorld();*/
        //printFewNaturalNumber(12,34);
        //printFewNaturalNumber2(1, 10);
        // countdown(10);

    }

    public static void tenTimeHellowWorld() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hellow world" + i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Hellow world" + (i + 1));
        }
    }

    public static void printFewNaturalNumber(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }

    public static void countdown(int max) {
        for (int i = max; i >= 1; i--) {
            System.out.println(i);
        }

    }

    public static void printFewNaturalNumber2(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) {
                continue;
            }
            {
                System.out.println(i);
            }

        }
    }

    public static void nowy (int n) {
        String s = "";
        for (int i=1; i>=n; i++){
            for (int j=1; j<=i; j++){
                System.out.println(i);
            }
            System.out.println("");
        }
    }

    public static void fibunacci(int elementsToShow) {
        int element1=0;
        int element2=1;
        int sumOfElements=0;
        for (int i=1; i<=elementsToShow; i++){
            System.out.println(element1);
            sumOfElements=element1+element2;
            element1=element2;
            sumOfElements=element2;
        }
    }
}

