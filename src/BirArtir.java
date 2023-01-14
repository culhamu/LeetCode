import java.util.Arrays;

public class BirArtir {
    public static void main(String[] args) {
        /*
        You are given a large integer represented as an integer array digits,
         where each digits[i] is the ith digit of the integer.
         The digits are ordered from most significant to least significant in left-to-right order.
         The large integer does not contain any leading 0's.

        Increment the large integer by one and return the resulting array of digits.
         */
        int[] arr={1,9};
        System.out.println(Arrays.toString(birArtir(arr)));
    }

    private static int[] birArtir(int[] arr) {

        /*
        1 <= digits.length <= 100
        0 <= digits[i] <= 9
        digits does not contain any leading 0's.
         */
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }else arr[i] = 0;
        }
        int[] yeniArr = new int[n + 1];
        yeniArr[0] = 1;
        return yeniArr;
    }
}
