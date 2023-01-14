import java.util.ArrayList;
import java.util.List;

public class EvenFibonacci {
    public static void main(String[] args) {
        /*
        Write a method that returns the sum of all even Fibonacci numbers.
         Consider all Fibonacci numbers that are less than or equal to n.
        Each new element in the Fibonacci sequence is generated by adding the previous two elements.
        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
         */
        int input=140;
        System.out.println(evenFibonacciSum(input));
    }

    private static Integer evenFibonacciSum(int input) {

        Integer sum=0;
        if (input<=0) System.out.println("Geçersiz giriş");
        List<Integer> fibonacci=new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        for (int i = 2; i < input; i++) {

        fibonacci.add(fibonacci.get(fibonacci.size()-1)+fibonacci.get(fibonacci.size()-2));

        if (fibonacci.get(i)>=input) {

            break;

             }
        }
        for (int i = 0; i < fibonacci.size() ; i++) {

            if (fibonacci.get(i)%2==0){
                sum+= fibonacci.get(i);

            }

        }

        return sum;
    }
}