package pl.sda.javastart.day1;

public class CatsMain {
    public static void main(String[] args) {
        createCatsArrayWithIndexesAdding();
        createCatsArrayWithInitialization();

        }
    private static void createCatsArrayWithInitialization() {
        Cat firstCat = new Cat();
        Cat secondCat = new Cat();
        Cat thirdCat = new Cat();

        firstCat.setName("Mruczek");
        System.out.println(firstCat.getName());
        firstCat.setWeight(12);
        System.out.println(firstCat.getWeight());

        Cat[] cats = new Cat[3];
        cats[0] = firstCat;
        cats[1] = secondCat;
        cats[2] = thirdCat;

        for (Cat catty :cats){
            System.out.println(catty.getName());
        }
    }
    private static void createCatsArrayWithIndexesAdding() {
        Cat firstCat = new Cat();
        Cat secondCat = new Cat();
        Cat thirdCat = new Cat();

        firstCat.setName("Mruczek");
        System.out.println(firstCat.getName());
        firstCat.setWeight(12);
        System.out.println(firstCat.getWeight());

        Cat[] cats = new Cat[3];
        cats[0] = firstCat;
        cats[1] = secondCat;
        cats[2] = thirdCat;

        for (Cat catty :cats){
            System.out.println(catty.getName());
        }
    }

}

