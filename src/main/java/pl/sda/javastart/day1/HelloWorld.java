package pl.sda.javastart.day1;

import java.time.LocalDateTime;

public class HelloWorld
{
public static void main(String[] args){
    printTextPartOne();



}
public static void printTextPartOne(){
    System.out.println("Hello world");
    System.out.println("Hello world");
    System.out.println(LocalDateTime.now());
    System.out.println("Hello world"+LocalDateTime.now());
    System.out.println("Cudzysłów:\"");
    System.out.println("Adam"+" \nMichał"+" \nWojtek");
    System.out.println("Adam \nMichał \nWojtek");
}
public static void prinTextPartTwo(){
    System.out.println("a"+10+'h');
    System.out.println('a'+10+"h");//mechanizm kontekanacji
    int weight=123;
    System.out.printf("Maciek waży %d kilogramów",weight);
    double weight1 =65.534;
    System.out.printf("\nMaciek waży %f kilogramów ",weight1);
}

public static void printTextPartThree(){
    System.out.println(false==false);
    System.out.println(false !=true);
    System.out.println(!true);
    System.out.println(2>4);
    System.out.println(3<5);
    System.out.println(3==3&&3==4);//false
    System.out.println(3!=5 ||3==5);//true
    System.out.println((2 + 4) > (1 + 3));//true
    System.out.println("cos" == "cos");//true
    System.out.println("cos" == new String("cos"));//false
    System.out.println("cos".equals(new String("cos")));
    System.out.println((2 + 4)>(1 + 3)); //false
}
}
