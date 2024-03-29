import java.util.*;

public class MDA5 {
    /*


2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado

3. CydeoStudents Task:
		1. given the following arrays:
		 		String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
		 		String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
		 		String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

		2. declare an array variable named batch25Groups with the length of three
				2.1 Assign batch25Group1, batch25Group2, batch25Group1=3 to each indexes of the variable batch25Groups

		3. given the following arrays:
				String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
		 		String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
		 		String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

 		4. declare an array variable named batch24Groups with the length of
 				4.1 Assign batch24Group1, batch24Group2, batch24Group1=3 to each indexes of the variable batch25Groups


		5. declare an array variable named CydeoStudents and assign batch24Groups & batch25Groups to the indexes of CydeoStudents

		6. Print the names of each students

     */
    public static void main(String[] args) {

        /*
         1. Write a program that can reverse a two dimensional array (return new array)
		Ex:array = { {1,2,3}, {4,5,6}};
		output:reverse = { {6,5,4}, {3,2,1},};
         */

        Integer[][] array = { {1,2,3}, {4,5,6}};
        Integer[][] tersArr=new Integer[array.length][array[0].length];

        for (int i = 0; i < array.length ; i++) {
            for (int j =0; j <array[i].length ; j++) {
                tersArr[i][j]=array[i][array[i].length-1-j];
            }
        }
        System.out.println(Arrays.deepToString(tersArr));

        /*
        2. Given the Array:
         */
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};

        //	1. print the following output: (add \t between two words)

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {

                items[i][j]=items[i][j]+"\t";

            }

        }
        System.out.println(Arrays.deepToString(items));

        //2. print the following output: (add \t between two words)
        //				Avocado   Grape    Banana    Apple
        //				Diapers   Tissues   Toilet Papers   Paper Towels
        //				Water    Pepsi    Arizona Tea    Fanta   Coke

        boolean kontrol=true;
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {

               if (items[i][j].trim().equals("Tissues")){
                   System.out.println("Tissues ["+i+"] ve ["+j+"] index'inde bulundu");
                   kontrol=false;
               }

            }

        }if (kontrol) System.out.println("Tissues bulunamadı");


        items[1][2]="Paper";

        System.out.println(Arrays.deepToString(items));

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {

                items[i][j]=items[i][items[i].length-1-j];

            }

        }
        System.out.println(Arrays.deepToString(items));
    }
}
