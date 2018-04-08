package pl.sda.javastart.day3;

public class OOP {
    public static void main(String[] args) {
        referencesExample();
        //Car car = new Car();
        //car.setModel("A4");
        //String model=car.getModel();
    //Car myFirstCar=new Car();
    }

    private static void referencesExample() {
        String text1= "napis";
        String text2= "napis";
        String text3= new String("napis");
        System.out.println(text1==text2);
        System.out.println(text3==text2);
        long val1= 127L;
        long val2=127L;
        System.out.println(val1==val2);
        long val3=128L;
        long val4=128L;
        System.out.println(val3==val4);

        long number1=1234L;
        long number2=1234L;
        long number3=1234L;
        long number4=1234L;
        long number5=new Long(1234L);



    }


}
