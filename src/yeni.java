import java.util.*;

public class yeni {
    public static void main(String[] args) {

        //1. Write a program that sort the array of integer in descending order

        int[] arr = {1, 5, 61, 423, 1321, 87, 561,};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] tersArr = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {

            tersArr[index] = arr[i];
            index++;
        }
        System.out.println(Arrays.toString(tersArr));

        //2. Write a program that can count the even and odd number from an array of integers
        //			Note: MUST use for each loop

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        int cift = 0, tek = 0;

        for (int w : arr1) {
            if (w % 2 == 0) {
                cift++;
            } else {
                tek++;
            }
        }
        System.out.println("Çift sayı : " + cift + "\n" + "Tek sayı : " + tek);

        //3. Write a program that can print out the common elements from two integer array
        //          Ex:arr1: {1,2,3,4,5}
        //             arr2: {4,5,6,7,8}
        //             output:4 5   MUST use for each loops

        int[] arr2 = {1, 2, 3, 4, 5}, arr3 = {4, 5, 6, 7, 8};
        int[] yeniArr = new int[arr2.length + arr3.length];

        index = 0;
        for (int w : arr2) {
            yeniArr[index] = w;
            index++;
        }
        index = arr2.length;
        for (int w : arr3) {
            yeniArr[index] = w;
            index++;
        }
        System.out.println(Arrays.toString(yeniArr));

        Set<Integer> set = new HashSet<>();
        for (int w : yeniArr) {
            set.add(w);
        }
        System.out.println(set);

        // 4. write a program that can count how many palindromes in an array of string
        //        Ex:{"anna", "level", "Java"};
        //           output:2

        String[] str = {"anna", "level", "Java"};
        int count = palindomeHesapla(str);
        System.out.println("palindrome sayısı: " + count);

        /*5. Write a program that can merge 3 arrays of integers
        Ex:
        arr1 = {30, 10, 20};
        arr2 = {15, 40, 25, 35};
        arr3 = {8, 9, 17, 5, 4, 1}

        Output:
        {30,10,20,15,40,25,35,8,9,17,5,4,1}
        */

        int[] arr4 = {30, 10, 20},arr5 = {15, 40, 25, 35},arr6 = {8, 9, 17, 5, 4, 1};

       int[] Arr=new int[arr4.length+arr5.length+arr6.length];

       int indx=0;
        for (int w:arr4) {
            Arr[indx]=w;
            indx++;
        }
        indx=arr4.length;
        for (int w:arr5) {
            Arr[indx]=w;
            indx++;
        }
         indx=arr4.length+arr5.length;
        for (int w:arr6) {
            Arr[indx]=w;
            indx++;
        }
        System.out.println(Arrays.toString(Arr));

        /*
        6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)

         */

        String cumle="Java çok güzel ama phyton'u bilmiyorum";
        String kelime="Java";
        System.out.println(gorunumHesapla(cumle, kelime));


    }

    private static Integer gorunumHesapla(String cumle,String kelime) {
        int sayac=0;
        int iindx=0;
        while ((iindx=cumle.indexOf(kelime,iindx))!=-1){
            iindx++;
            sayac++;
        }
        return sayac;
    }

    public static int palindomeHesapla(String[] str) {
                int count = 0;
                for (String w : str) {
                    if (isPalindrome(w)) {
                        count++;
                    }
                }
                return count;
            }

            public static boolean isPalindrome(String str) {
                StringBuilder tersStr = new StringBuilder(str);
                tersStr.reverse();
                return str.equalsIgnoreCase(tersStr.toString());

            }


        }







