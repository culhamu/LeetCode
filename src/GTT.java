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

    }
}
