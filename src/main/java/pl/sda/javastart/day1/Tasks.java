package pl.sda.javastart.day1;

import java.time.LocalDateTime;
import java.time.Month;

public class Tasks {
    public static void main(String[] args) {
        int a=3;
        int b=6;
        int c=9;
        double d;
        d=a%b%c;
        System.out.println(d);


        LocalDateTime now=LocalDateTime.now();
        int minute=now.getMinute();
        int hour=now.getHour();
        int year=now.getYear();
        int month=now.getMonthValue();
        int day=now.getDayOfMonth();
        int timeAfterMidnight= (hour*60)+minute;
        System.out.println(hour+":"+minute+" "+day+" "+month+" "+year);
        System.out.println("Od pólnocy mineło:"+(hour*60+minute)+"minut");
        System.out.println("Od północy mineło: "+(timeAfterMidnight*100)/1440+"% dnia");
        int generalSecondInDay=24*60*60;
        System.out.println("Do konca doby pozostalo:"+(24*60*60-hour*60-minute*60));




    }
}
