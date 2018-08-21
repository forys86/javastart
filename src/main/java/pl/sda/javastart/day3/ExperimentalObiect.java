package pl.sda.javastart.day3;

public class ExperimentalObiect {
    public static void main(String[] args) {
        System.out.println("mój wiek to "+getMyAge()+" lat");
        System.out.println(getMyName());
        getTwoNumebr(5,7);
        System.out.println(printNumberTrue(34));
        System.out.println(printNumeberThree(15));
        System.out.println(pow(4));


    }

    private static int getMyAge(){
        return 31;
    }
    private static String getMyName(){
        return "Darek";
    }
    private static void getTwoNumebr(double a,double b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
    }
    private static boolean printNumberTrue(double number){
        return number/2==0;
    }
    private static boolean printNumeberThree (double number2){
        return number2%3==0 && number2%5==0;
    }
    private static double pow(double a){
        return Math.pow(a,3);
    }
}
