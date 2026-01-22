import java.util.*;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the number ? ");
        int num = scan.nextInt();
        System.out.println("The factorial of " + num + " is " + fact(num));
        scan.close();
    }

    static int fact(int num) {
        int ans = 1;

        if (num == 0)
            return ans;

        for (int i = 1; i <= num; i++) 
            ans *= i;
        
        return ans;
    }
}
