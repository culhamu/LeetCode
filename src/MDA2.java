import java.util.ArrayList;
import java.util.List;

public class MDA2 {
    public static void main(String[] args) {
        /*
        Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini ekrana
        yazdiran bir program yaziniz.
        { {1,2,3}, {4,5}, {6} }
         */
        int[][] arr={ {1,2,3}, {4,5}, {6} };
        sonElemanCarpim(arr);

    }public static void sonElemanCarpim(int[][] arr){

        int carpim=1;

        for (int i = 0; i < arr.length; i++) {
            int[] innerArray = arr[i];
            int lastElement = innerArray[innerArray.length - 1];
           carpim *= lastElement;
        }

        System.out.println(carpim);

    }
}
