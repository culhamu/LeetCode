import java.util.Scanner;

public class GTT {
    public static void main(String[] args) {

        System.out.println(Integer.compare(5, 3));
        System.out.println(Integer.compare(3, 5));
        System.out.println(Integer.compare(5, 5));
        System.out.println(Integer.divideUnsigned(25, 5));
        //System.out.println(Integer.divideUnsigned(12, 0));
        int sayi=10;
        System.out.println(sayi++);
        System.out.println(sayi);
        System.out.println(++sayi);
        System.out.println(sayi);

        int a=20;
        int b=a++;
        System.out.println(b);
        System.out.println(a);
        System.out.println("******************************");
        b=++a;
        System.out.println(b);

        a=10;
        System.out.println(+ ++a);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir yıl girin: ");

        if (scanner.hasNextInt()) {
            int yil = scanner.nextInt();

            if (yil % 4 == 0 && (yil % 100 != 0 || yil % 400 == 0)) {
                System.out.println(yil + " bir artık yıldır.");
            } else {
                System.out.println(yil + " bir artık yıl değildir.");
            }
        } else {
            System.out.println("Geçersiz giriş! Lütfen bir sayı girin.");
        }
    }


}
