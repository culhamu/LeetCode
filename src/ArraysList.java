import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysList {
    public static void main(String[] args) {
        /*
        Soru 4:
        "Bir String olusturunuz, bu String’deki character’leri for-each loop kullanarak yazdiriniz.
        1-Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.
        2)indexsiz add() methodunu kullanarak, B’yi ekleyiniz.
        index’li add() methodunu kullanarak, L’yi 1 numarali index’e ekleyiniz.
        ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, E, F, B.
        3)set() methodu kullanarak, E’yi D yapiniz.
        ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B.
        4)remove() methodu kullanarak, F’yi siliniz.
        ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.
        5)sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
        ArrayList’i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.
        6)contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de var
        olmadigini dogrulayiniz.
        7)size() methodu kullanarak, li…"
         */

        List<String> strList=new ArrayList<>(Arrays.asList("A","E","C","F"));

        strList.add("B");

        strList.add(1,"L");
        strList.set(2,"D");
        strList.remove("F");
        Collections.sort(strList);
        if (strList.contains("L")){
            System.out.println("Array list de L bulunmaktadır ");
        }if (strList.contains("M")){
            System.out.println("Array list de L bulunmaktadır ");
        }
        System.out.println(strList.size());
        System.out.println(strList);
    }
}
