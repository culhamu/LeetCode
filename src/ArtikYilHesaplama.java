import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String girdi;
        int yil = 0;

        while (true) {
            System.out.print("Bir yıl girin: ");
            girdi = scanner.nextLine();

            if (girdi.matches("\\d+")) {
                yil = Integer.parseInt(girdi);
                break;
            } else {
                System.out.println("Geçersiz giriş! Lütfen bir sayı girin.");
            }
        }

        if (yil % 400 == 0 || (yil % 4 == 0 && yil % 100 != 0)) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }

        scanner.close();
    }
}
