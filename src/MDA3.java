import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MDA3 {
    public static void main(String[] args) {
        /*
        Soru 3) Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip elemanlarin
        toplamini ekrana yazdiran bir program yaziniz.
        arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
         */


        int[][] arr = { {1,2}, {3,4,5}, {6,4} };

        int enKisaArrayLenght=arr[0].length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length<enKisaArrayLenght){
                enKisaArrayLenght=arr[i].length;
            }

        }int toplam=0;
        int [] toplamlar=new int[enKisaArrayLenght];
        for (int i = 0; i < enKisaArrayLenght; i++) {
            for (int j = 0; j < arr.length; j++) {
                toplam+=arr[j][i];

            }toplamlar[i]=toplam;
            toplam=0;

        }
        System.out.println(Arrays.toString(toplamlar));

    }
}
