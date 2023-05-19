public class Enum {
    // Renkleri temsil eden bir enum tanımlama
    public enum Renk {
        KIRMIZI,
        MAVI,
        YESIL,
        SARI
    }

    public static void main(String[] args) {
        // Enum elemanlarını kullanma
        Renk favoriRenk = Renk.MAVI;
        System.out.println("Favori rengim: " + favoriRenk);

        // Enum elemanları üzerinde döngü
        System.out.println("Tüm renkler:");
        for (Renk renk : Renk.values()) {
            System.out.println(renk);
        }
    }
}
