import java.util.Arrays;

public class ikiSayininToplami {
    public static void main(String[] args) {
        /*
        Given an array of integers nums and an integer target,
         return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution,
         and you may not use the same element twice.

        You can return the answer in any order.
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
         */
        int[] arr = {2, 7, 11, 15};
        int hedef = 9;
        System.out.println(Arrays.toString(HedefToplam(arr, hedef)));
    }

    private static int[] HedefToplam(int[] arr, int hedef) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] + arr[j] == hedef) {

                    return new int[]{i, j};
                }

            }

        }

        throw new IllegalArgumentException("İki toplamlı çözüm yok");
    }
}