package pl.sda.javastart.day2;

public class Arrays2d {
    public static void main(String[] args) {
       fillArrayWithNummebers_2();
        // printGrid(2,2);
    }

    public static void printGrid(int n, int m) {
         int [] [] array = new int [n] [m];
         for (int i=0; i<n; i++){
             for (int j =0; j<m; j++){
                 System.out.println(array[i] [j]+ " ");
             }
             System.out.println();
         }


    }
    public static void fillArrayWithNummebers_2(){
        int [] [] ints = new int [5] [5];
        for (int i =0; i<ints.length; i++){
            for (int j =0; j<ints[i].length; j++){
                if(i==j){
                    ints[i][j]=i;
                }
                System.out.println(ints[i][j]+" ");
            }
            System.out.println();
        }
    }
}
