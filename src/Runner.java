import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz");
        int sayi1=scan.nextInt();
        System.out.println("İkinci sayiyi giriniz");
        int sayi2=scan.nextInt();
        System.out.println("Yapılacak işlemi giriniz : (+,-,*,/)");
        char islem=scan.next().charAt(0);
        Islemler islemler=new Islemler();
        switch (islem){
            case '+':{
                System.out.println("TOPLAM : "+islemler.toplama(sayi1, sayi2));
                break;
            }
            case '-':{
                System.out.println("FARK : "+islemler.cikarma(sayi1, sayi2));
                break;
            }
            case '*':{
                System.out.println(" CARPMA : "+islemler.carpma(sayi1, sayi2));
                break;
            }
            case '/':{
                System.out.println(" BÖLME : "+islemler.bolme(sayi1, sayi2));
                break;
            }
        }
    }
}
