import java.util.*;
public class ArraySort {
    public static String Sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int j = i + 1;
            int index = i;
            while (j < arr.length) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                    j++;
                }
                else j++;
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many number do you want to sort ? : ->");
        int length = scan.nextInt();
        int [] array = new int[length];
        System.out.println("Enter " + length + " numbers one by one");
        for (int i = 0; i < length; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Sorted Array is : " + Sort(array));
        scan.close();
    }
}
