import java.util.*;

public class Fibonaci {
    public static void fib(int num) {
        long first = 0, second = 1;
        System.out.print("Fibonacci Series from 0 to " + num + " : ");
        for (int i = 1; i <= num; i++) {
            System.out.print(first + " ");
            long next = first + second;
            first = second;
            second = next; 
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many number of sequence do you want?  ");
        int num = scan.nextInt();
        scan.close();
        fib(num);
    }
}
