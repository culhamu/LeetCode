import java.util.ArrayList;
import java.util.List;

public class FindLongestPalindrome {
    public static void main(String[] args) {
        /*
        A palindrome is a word which reads the same backward or forward.
        'abcba' is a palindrome.
        Write a method that returns the longest palindrome substring of a given string.
         */
        String word="abcbaxyz";
        findLongestPalindrome(word);
    }

    private static void findLongestPalindrome(String word) {

        int index = 0;
        List<String> list=new ArrayList<>();
        String[] wordArr = word.split("");
        for (int i = wordArr.length-1; i >=0 ; i--) {

            if (wordArr[index].equalsIgnoreCase(wordArr[i])){

                list.add(wordArr[index]);
                index++;
            }

        }

        System.out.println(list);
    }
}
