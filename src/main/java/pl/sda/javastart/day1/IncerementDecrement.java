package pl.sda.javastart.day1;

public class IncerementDecrement {
    public static void main(String[] args) {
        int x=3;
        int y;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x);
        y=x++;
        System.out.println(y);
        y=++x;
        System.out.println(y);
        System.out.println(++y);
    }
}
