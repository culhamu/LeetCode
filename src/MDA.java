import java.util.Arrays;

public class MDA {
    public static void main(String[] args) {
        /*
        Soru1 ) Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana yazdiran bir
        method yaziniz.
        { {1,2,3}, {4,5,6} }
         */
        int[][] arr={ {1,2,3}, {4,5,6} };

        System.out.println(Arrays.toString(arrCarpim(arr)));

    }public static int[] arrCarpim(int[][] arr){

        int carpim=1;
        int[] carpimList=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                carpim*=arr[i][j];

            }carpimList[i]=carpim;
            carpim=1;
        }
     return carpimList;
    }
}
