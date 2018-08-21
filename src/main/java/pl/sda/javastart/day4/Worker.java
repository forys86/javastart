package pl.sda.javastart.day4;

public class Worker extends Person {

    private double salary;
    private String position;


    public Worker(String name, String surName, int age, double salary, String position) {
        super(name,surName,age);
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString()+
                "salary="+salary+", position='"+position+'\''+"}";
    }

    protected boolean isParenthesisNeeded() {
        return true;
    }
    public double getIncome() {
        return super.getIncome() + salary;
    }
    public String getPosition() {
        return position;
    }
}
