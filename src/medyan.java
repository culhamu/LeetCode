import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class medyan {
    public static void main(String[] args) {
        /*
        Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

        The overall run time complexity should be O(log (m+n)).
         */

        int[] nums1 = {1,3}, nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));


    }public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Integer> arr=new ArrayList<>();

        for (int w:nums1) {

            arr.add(w);

        }
        for (int w:nums2) {
            arr.add(w);

        }
        Collections.sort(arr);
        int ort= arr.size()/2+(arr.size()/2+1);
        if (arr.size()%2==0){
            return arr.get(ort/2);
        }else return arr.get(arr.size()/2);

    }
}
