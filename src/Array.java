public class Array {
    public static void main(String[] args) {
        /*
        Soru 1:
        Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For-each loop
        kullanarak bulunuz. Sonucu ekrana yazdiriniz.
         */

        int[] arr={1,2,3,4,5,6,7};
            int carpim=1;
        for (int w:arr) {

            carpim*=w;

        }
        System.out.println(carpim);
    }
}
