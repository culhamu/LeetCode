import java.util.ArrayList;
import java.util.List;



public class GreatestCommonDivisor {


    public static void main(String[] args) {
        /*
        The Greatest Common Divisor of two positive integers is the largest integer that
         divides both without remainder.
        Write a method that returns the Greatest Common Divisor of p and q.
         */
        int p=125;
        int q=100;

        greatestCommonDivisor(p,q);

    }

    private static void greatestCommonDivisor(int sayi1, int sayi2) {
        List<Integer> list=new ArrayList<>();
        int enBuyukBolen=0;
        int enBuyukSayi=0;
        if (enBuyukSayi<sayi1){
            enBuyukSayi=sayi1;
        }
        if (enBuyukSayi<sayi2){
            enBuyukSayi=sayi2;
        }else enBuyukSayi=sayi1;
        for (int i = 1; i <enBuyukSayi ; i++) {
            if (sayi1%i==0&&sayi2%i==0){
                list.add(i);
            }

        }
        for (int i = 0; i < list.size(); i++) {
            if (enBuyukBolen<list.get(i)){
                enBuyukBolen=list.get(i);
            }

        }
        System.out.println(enBuyukBolen);
    }
}
