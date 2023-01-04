import java.util.ArrayList;
import java.util.List;

public class Array2 {
    public static void main(String[] args) {
        /*
        Soru 2:
        Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini For-each loop
        kullanarak bulunuz. Sonucu ekrana yazdiriniz.
         */

        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(7);
        list.add(8);

        int karesi = 0;


        for (int w:list) {
            karesi+=w*w;
        }
        System.out.println(karesi);
    }
}
