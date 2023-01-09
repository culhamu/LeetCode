import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SinifArkadasi {
    public static void main(String[] args) {

        //1. create an array named classmates, and store 10 of your classmates' full names
        //print the initials of each classmates in separate lines

        String[] sinifArkadasiArray=new String[10];
        sinifArkadasiArray[0]="Ali Kuscu";
        sinifArkadasiArray[1]="\nBiruni";
        sinifArkadasiArray[2]="\nHarezmi";
        sinifArkadasiArray[3]="\nÖmer hayyam";
        sinifArkadasiArray[4]="\nİbn-i Farabi";
        sinifArkadasiArray[5]="\nCahit arf";
        sinifArkadasiArray[6]="\nAlbert Einstein";
        sinifArkadasiArray[7]="\nPisagor";
        sinifArkadasiArray[8]="\nÖklid";
        sinifArkadasiArray[9]="\nMarie Curie";
        System.out.println(Arrays.toString(sinifArkadasiArray));

        //2. create string array, and store the names of your  class mates (10)
        //reverse each students names and print them in separate lines

        for (String w: sinifArkadasiArray) {
            StringBuilder reversedIsimler = new StringBuilder(w);
            reversedIsimler.reverse();
            System.out.println(reversedIsimler);
        }

        //Given the following arrays:

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        // 1. find out the first index number of "Gloves"
        String str=Arrays.toString(items).replaceAll(" ","").replaceAll(",","");

        System.out.println(str.indexOf("G"));

        int index = -1;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                index = i;
                break;
            }
        }
        System.out.println(index);

        //2. find out if "iPad" is contained in the item list

        System.out.println(Arrays.toString(items).contains("iPad"));

        //3. Print the report of each shopping item
        // name - price - #ID

        for (int i = 0; i < 5; i++) {
            System.out.println(i+1+".ürün "+items[i]+" fiyatı "+prices[i]+" ürün numarası "+itemIDs[i]);

        }
        //4. given the following arrays:
        //		     	String [] names = {"Anna", "Nancy", "Sarah"};
        //		        int [] scores = {90, 75, 80};
        //		        char [] grades = new char[names.length];

        //1. write a program that can store the grades of the students in the array named grades

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 90) {
                grades[i] = 'A';
            } else if (scores[i] >= 80) {
                grades[i] = 'B';
            } else if (scores[i] >= 70) {
                grades[i] = 'C';
            } else if (scores[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
            //2. print the grade report of each students in separate lines
            System.out.println(names[i]+" notu : "+grades[i]);
        }
        //5.  Write a program that can reverse an array of integers and returns it as new array

        int[] array = {1,2,3,4,5};
        StringBuilder strArr=new StringBuilder();

        for (int i = 0; i < array.length; i++) {

            strArr.append(array[i]);

        }
        System.out.println(strArr);
        strArr.reverse();
        System.out.println(strArr);

        //6. write a program that can move all the zeros to the end of the array
        int[]  array2 = {10, 0, 5, 0, 1, 0};
        int[] array3=new int[array2.length];
        int a=0;
        for (int i = 0; i < array2.length; i++) {

            if (array2[i]>0){

                array3[a]=array2[i];
                a++;
            }

        }
        System.out.println(Arrays.toString(array3));

        //7. Write a program that can print out the common elements from two integer array

     int[]  arr1= {1,2,3,4,5};
     int[]  arr2= {4,5,6,7,8};

     List<Integer> yeniArr=new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i]==arr2[j]){
                    yeniArr.add(arr1[i]);
                }

            }

        }
        System.out.println(yeniArr);

    }
}
