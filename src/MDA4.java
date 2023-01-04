import java.util.Arrays;

public class MDA4 {
    public static void main(String[] args) {
        /*
        Soru4) Asagidaki multidimensional array’in ic array’lerindeki tum elemanlarin toplamini birer
        birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’I ekrana yazdiran bir
        program yaziniz.
        Ornek;{{1,2,3},{4,5},{6,7}}==>1+2+3=64+5=96+7=13==>output:{6,…
         */
        int[][] arr={{1,2,3},{4,5},{6,7}};
        int[] innerArrayToplam=new int[arr.length];
        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam+=arr[i][j];
            }
           innerArrayToplam[i]=toplam;
            toplam=0;
        }
        System.out.println(Arrays.toString(innerArrayToplam));
    }
}
