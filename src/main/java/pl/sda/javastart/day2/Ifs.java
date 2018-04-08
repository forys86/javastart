package pl.sda.javastart.day2;

import java.util.Scanner;

public class Ifs {
    public static void main(String[] args) {
        System.out.println(answerCell(false,true,true));
        System.out.println(answerCell(true,true,false));
        System.out.println(answerCell(false,true,false));
        /*boolean result=positiveOrNot(2);
        System.out.println("Czy liczba 2 jest większa od zera?"+result);
        boolean anotherResult=positiveOrNot(-2);
        System.out.println("Czy liczba -2 jest większa od zera"+anotherResult);*/
    }

    public static boolean positiveOrNot(int value) {
        if (value >= 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean answerCell(boolean isMama, boolean isMorning, boolean isAsleep){
        if(isMorning==true && isMama==false){
            return false;
        }
        if (isAsleep==true){
            return false;
        }

        else{
            return true;
        }
    }
   /* public static String checkWhichOneIsBigger(int a, int b) {
        if (a != b) {
            if (a < b) {
                return ("Druga liczba większa");
            }
            if (a > b) {
                return ("Pierwsza liczba jest większa");
            }
            else {
                return ("Są równe");
            }

        }
    }*/
   private void calcIfs() {
       double a;
       double b;

       Scanner in = new Scanner(System.in);

       System.out.print("Wprowadź pierwszą liczbę: ");
       a = in.nextDouble();
       System.out.print("Wprowadź drugą liczbę: ");
       b = in.nextDouble();

       System.out.println();
       System.out.println("Co chcesz zrobić?");
       System.out.println("1-dodawanie, 2-odejmowanie, 3-mnożenie, 4-dzielenie");
       int wybor = in.nextInt();

       if (wybor == 1) {
           System.out.println("" + a + " + " + b + " = " + (a + b));
       } else if (wybor == 2) {
           System.out.println("" + a + " - " + b + " = " + (a - b));
       } else if (wybor == 3) {
           System.out.println("" + a + " * " + b + " = " + (a * b));
       } else if (wybor == 4) {
           System.out.println("" + a + " / " + b + " = " + (a / b));
       } else {
           System.out.println("Niepoprawny wybór!!!");
       }

   }

}
