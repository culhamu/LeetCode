import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoLists {
    public static void main(String[] args) {
        /*
        You are given the heads of two sorted linked lists list1 and list2.

        Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

        Return the head of the merged linked list.
        Input: list1 = [1,2,4], list2 = [1,3,4]
        Output: [1,1,2,3,4,4]

        Input: list1 = [], list2 = []
        Output: []

        Input: list1 = [], list2 = [0]
        Output: [0]
         */

        Integer[] list1 = {},list2 = {0};

        System.out.println(mergeTwoLists(list1, list2));

    }public static List<Integer> mergeTwoLists(Integer[] list1, Integer[] list2){

        List<Integer> yeniList=new ArrayList<>();

        for (int i = 0; i < list1.length; i++) {

            yeniList.add(list1[i]);
        }
        for (int i = 0; i < list2.length; i++) {

            yeniList.add(list2[i]);

        }
        Collections.sort(yeniList);
        return yeniList;
    }
}
