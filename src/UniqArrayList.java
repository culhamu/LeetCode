import java.util.*;

public class UniqArrayList {
   static int length;
    public static void main(String[] args) {
        /*
        Given an integer array nums sorted in non-decreasing order,
         remove the duplicates in-place such that each unique element appears only once.
         The relative order of the elements should be kept the same.

        Since it is impossible to change the length of the array in some languages,
         you must instead have the result be placed in the first part of the array nums.
         More formally, if there are k elements after removing the duplicates,
         then the first k elements of nums should hold the final result.
          It does not matter what you leave beyond the first k elements.

        Return k after placing the final result in the first k slots of nums.

        Do not allocate extra space for another array.
         You must do this by modifying the input array in-place with O(1) extra memory.
         */

       int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(removeDuplicates(nums)));
        System.out.println("Numbers of the newNums : "+length);

    } public static int[] removeDuplicates(int[] nums) {

        List<Integer> uniqNums=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!uniqNums.contains(nums[i])){
                uniqNums.add(nums[i]);
            }

        }Collections.sort(uniqNums);



        int[] newNums=new int[uniqNums.size()];
        for (int i = 0; i < uniqNums.size(); i++) {

            newNums[i]= uniqNums.get(i);

        }
         length=newNums.length;

        return newNums;

    }
}
