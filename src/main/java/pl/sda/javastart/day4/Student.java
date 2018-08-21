package pl.sda.javastart.day4;

public class Student extends Person{
    private int index;
    private double scolarship;
    private double incomeFromMom;

    public Student(String name, String surName, int age, int index, double scoolarship, double incomeFromMom) {
        super(name, surName, age);
        this.index = index;
        this.scolarship = scolarship;
        this.incomeFromMom = incomeFromMom;
    }
    @Override
    public String toString() {
        return super.toString() +
                "index=" + index +
                ", scolarship=" + scolarship +
                ", incomeFromMom=" + incomeFromMom +
                "} ";
    }

    @Override
    protected boolean isParenthesisNeeded() {
        return false;
    }

    @Override
    public double getIncome() {
        return super.getIncome() + scolarship + incomeFromMom;
    }

    public int getIndex() {
        return index;
    }


    public String getStreetPrefix() {
        return "al. ";
    }

    public String getFlatInfo() {
        return "Słowackiego - u cioci";
    }
}
