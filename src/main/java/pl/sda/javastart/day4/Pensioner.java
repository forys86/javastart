package pl.sda.javastart.day4;

public class Pensioner extends Person{

    private double pension;

    public Pensioner(String name, String surName, int age, double pension) {
        super(name,surName,age);
        this.pension = pension;
    }
    @Override
    public String toString() {
        return super.toString() +
                "pension=" + pension +
                '}';
    }

    @Override
    protected boolean isParenthesisNeeded() {
        return false;
    }

    @Override
    public double getIncome() {
        return pension;
    }

    public double getPension() {
        return pension;
    }
}
