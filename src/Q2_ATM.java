import java.util.Scanner;

public class Q2_ATM {
    static Scanner scan=new Scanner(System.in);
    static String kartNo="1234123412341234";
    static  String sifre="1234";
    static double bakiye=50000;
    public static void main(String[] args) {

        giris();
    }

    private static void giris() {
        System.out.println("Lütfen kart numarasını giriniz");
        String kKartNo=scan.nextLine().replaceAll(" ","");
        System.out.println("Sifrenizi giriniz");
        String ksifre=scan.nextLine();

        if (ksifre.equals(sifre)&&kKartNo.equals(kKartNo)){
            menu();
        }else {
            System.out.println("Kart no veya şifre yanlış");
            scan.nextLine();//Dummy ard arda kullanılan scanner objelerini önlemek için kullanılır
            giris();
        }
    }

    private static void menu() {
        System.out.println("********FALAN FİLAN BANK*********\n"+
                           "1. BAKİYE SORGULAMA\n"+
                            "2. PARA YATIRMA \n"+
                             "3. PARA ÇEKME \n"+
                              "4. PARA GÖNDERME\n"+
                               "5. ŞİFRE DEĞİŞTİRME\n"+
                                "6. ÇIKIŞ"+
                                 "SEÇİMİNİZ");
        int seciminiz=scan.nextInt();

        switch (seciminiz){
            case 1:{
                bakiyeSorgula();
                break;
            }
            case 2:{
                System.out.println("Yatımak istediğiniz tutarı giriniz");
                double miktar=scan.nextDouble();
                paraYatirma(miktar);
                break;
            }
            case 3:{
                paraCekme();
                break;
            }
            case 4:{
                paraGonderme();
                break;
            }
            case 5:{
                sifreDegistirme();
                break;
            }
            case 6:{
                System.out.println("Güle güle ");
                System.exit(0);
            } default:
                System.out.println("YAnlış giriş yaptınız");
                menu();
        }
    }

    private static void sifreDegistirme() {
        System.out.println("Eski şifreyi giriniz");
        String esifre=scan.next();
        if (esifre.equals(sifre)){
            System.out.println("Yeni şifreyi giriniz");
            sifre=scan.next();
            scan.nextLine();
            giris();
        }else {
            System.out.println("Eski şifreyi yanlış girdiniz");
            sifreDegistirme();
        }
    }

    private static void paraGonderme() {
        System.out.println("Lütfen IBAN numarasını giriniz");
        String iban=scan.next().toUpperCase().replaceAll("\\s","");
        if (iban.length()==26&&iban.startsWith("TR")){
            System.out.println("Göndereceğiniz miktarı giriniz");
            double miktar=scan.nextDouble();
            if (miktar<=bakiye){
                bakiye-=miktar;
                bakiyeSorgula();
            }else {
                System.out.println("Miktar bakiyeden büyük !!");
                paraGonderme();
            }
        }
    }

    private static void paraCekme() {
        System.out.println("Çekmek istediğiniz miktarı giriniz ");
        double miktar=scan.nextDouble();
        if (miktar<=bakiye){
            bakiye-=miktar;
            bakiyeSorgula();
        }else System.out.println("Çekmek istediğiniz tutar bakiyeden büyük !!!");
        paraCekme();
    }

    private static void paraYatirma(double miktar) {
        bakiye+=miktar;
        bakiyeSorgula();
    }

    private static void bakiyeSorgula() {
        System.out.println("Bakiyeniz : "+bakiye+" TL");
        menu();
    }
}
