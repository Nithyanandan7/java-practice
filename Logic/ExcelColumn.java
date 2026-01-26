import java.util.Scanner;

public class ExcelColumn {
    public static int titleToNumber(String columnTitle){
        int answer = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int actualValue = columnTitle.charAt(i) - 64;
            answer = answer * 26 + actualValue;
        }
        return answer;
    }
    public static String numberToTitle(int num){
        int index = 0;
        String answer = " ";
        char[] char1 = new char[10];
        while (num > 0) {
            num--;
            int mod = (num % 26) + 65;
            num /= 26;
            char1[index++] = (char)(mod);
        }
        for (int i = 9; i >= 0; i--){
            answer += (char1[i]);
        }
        return answer.trim();
    }
    public static void main(String[] args){
        System.out.println("What do you want\n\n        1 : Number To Title\n        2 : Title To number\n        3 : Exit\n\n");
        System.out.print("Option :-> ");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        boolean valid = true;
        if(option == 3){
            System.out.println("\n\nBye.....Bye......!\n\n\n");
            valid = false;
        }
        while (valid) {
            switch (option) {
            case 1:{
                System.out.print("Enter number: ");
                int a = scan.nextInt();
                System.out.println("\n\n" + a + " = " + numberToTitle(a) + "\n\n");
                break;
            }
            case 2:{
                System.out.print("Enter Title: ");
                String a = scan.next();
                a = a.toUpperCase();
                System.out.println("\n\n" + a + " = " + titleToNumber(a) + "\n\n");
                break;
            }
            case 3:{
                System.out.println("\n\nBye.....Bye......!\n\n\n");
                break;
            }
            default :{
                System.out.print("Enter valid option: ");
            }
            if(option == 3){
                break;
            }
        }
            System.out.println("Next\n\n        1 : Number To Title\n        2 : Title To number\n        3 : Exit\n\n");
            System.out.print("Option :-> ");
            option = scan.nextInt();
            if(option == 3){
            System.out.println("\n\nBye.....Bye......!\n\n\n");
            break;
        }
        }
        scan.close();
    }
}
