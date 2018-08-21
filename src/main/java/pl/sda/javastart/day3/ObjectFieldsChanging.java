package pl.sda.javastart.day3;

public class ObjectFieldsChanging {
    public static void main(String[] args) {
        simpleReferences();
    }




    private static void simpleReferences() {
        Object referenceToObiectX=new Object();
        Object anotherReferenceToTheSameObject = referenceToObiectX;
        Object referenceToObjectY=new Object();
        System.out.println(referenceToObiectX);
    }
}

