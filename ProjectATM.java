import java.util.*;


class Loading implements Runnable {
    public void run() {
        try {
            System.out.print("\nProcessing");
            for (int i = 0; i < 5; i++) {
                Thread.sleep(500);
                System.out.print(".");
            }
            System.out.println("\n");
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

class CardTransaction {
    Scanner scan = new Scanner(System.in);

    CardTransaction() {
        System.out.println("\n--- Reading card info. Please wait ---");
        simulateLoading();

        System.out.println("\n1 : Balance Enquiry");
        System.out.println("2 : Withdrawal");
        System.out.print("\nPlease Select Transaction : ");
        int option = scan.nextInt();

        switch (option) {
            case 1:
                balance();
                break;
            case 2:
                withdrawal();
                break;
            default:
                System.out.println("Invalid option. Exiting.");
                break;
        }
    }

    void balance() {
        int[] amount = {15285, 62837, 26487,59834};
        int amountToPrint = 0;
        System.out.print("\n1 : Current ");
        System.out.print("\n2 : Savings ");
        System.out.print("\n\nPlease Select Transaction : ");
        long option = scan.nextLong();
        option += option;
        System.out.print("\nEnter Your PIN : ");
        int pin = scan.nextInt();

        if (pin != 1234) {
            if (pin != 4567) {
                if (pin != 6789){
                    if (pin != 1000){
                        System.out.println("\nInvalid PIN number!\n");
                        System.out.println("Thanks for your visit..!\n");
                        return;
                    }
                }
            }
        }
        if (pin == 1234) amountToPrint = amount[0];
        if (pin == 4567) amountToPrint = amount[1];
        if (pin == 6789) amountToPrint = amount[2];
        if (pin == 1000) amountToPrint = amount[3];

        startLoading();
        System.out.println("Your Balance Is " + amountToPrint + "\n");
        System.out.println("Thanks for your visit..!\n");
    }

    void withdrawal() {
        System.out.print("\n1 : Current ");
        // long cardNumber = scan.nextLong();
        System.out.print("\n2 : Savings ");
        System.out.print("\n\nPlease Select Transaction : ");
        int option = scan.nextInt();
        option += option;
        System.out.println("\n     1. 1000");
        System.out.println("     2. 2000");
        System.out.println("     3. 3000");
        System.out.println("     4. 4000");
        System.out.println("     5. 5000");
        System.out.println("     6. Others");
        System.out.print("\nPlease Select the Amount : ");
        int amount = scan.nextInt();
        if (amount == 1) amount = 1000;
        if (amount == 2) amount = 2000;
        if (amount == 3) amount = 3000;
        if (amount == 4) amount = 4000;
        if (amount == 5) amount = 5000;
        if (amount == 6) {
            System.out.print("\nPlease Enter Amount to Withdraw : ");
            amount = scan.nextInt();
        }

        System.out.print("\nPlease Enter Your PIN Number : ");
        int pin = scan.nextInt();
        if (pin != 1234) {
            System.out.println("\nInvalid PIN number!\n");
            System.out.println("Thanks for your visit..!\n");
            return;
        }

        startLoading();
        System.out.println("Amount " + amount + " withdrawn successfully!\n");
        System.out.println("Thanks for your visit..!\n");
    }

    void simulateLoading() {
        Thread loadingThread = new Thread(new Loading());
        loadingThread.start();
        try {
            loadingThread.join();
        } catch (InterruptedException e) {
            System.out.println("Loading interrupted");
        }
    }

    void startLoading() {
        simulateLoading();
    }
}

class PinGeneration {
    Scanner scan = new Scanner(System.in);

    PinGeneration() {
        int otp = 9876;
        System.out.println("\n--- Generate and Set New PIN ---");
        System.out.println("\n1 : Generate OTP \n2 : Set PIN");
        System.out.print("\nPlease Select Transaction : ");
        int option = scan.nextInt();
        if (option == 1) {
            System.out.print("\nPlease Enter Your Phone Number : ");
            long phone = scan.nextLong();
            startLoading();
            System.out.println("Your OTP send successfully to the +91 " + phone);
            System.out.println("Thanks for your visit..!\n");
            new PinGeneration();
        }
        if (option == 2) {
            System.out.print("\nPlease Insert Your Card");
            System.out.println("\nReading Card info.. Please Wait..");
            startLoading();
            System.out.print("Please Enter Your Account Number   : ");
            long accNumber = scan.nextLong();
            System.out.print("Please Re-Enter Your Account Number: ");
            long accNumber_re = scan.nextLong();
            if (accNumber != accNumber_re) {
                System.out.println("\nAccount numbers do not match!\n");
                System.out.println("Thanks for your visit..!\n");
                return;
            }
            System.out.print("\nPlease Enter Your OTP :");
            int otpVerify = scan.nextInt();
            if (otp != otpVerify){
                System.out.println("\nPlease Enter a Valid OTP..!\n");
                System.out.println("Thanks for your visit..!\n");
                return;
            }
            System.out.print("\nPlease Enter New PIN (4 digits): ");
            int newPin = scan.nextInt();
            System.out.print("Please Re-Enter New PIN        : ");
            int newPin_re = scan.nextInt();

            if (newPin != newPin_re) {
                System.out.println("\nPINs do not match!\n");
                System.out.println("Thanks for your visit..!\n");
                return;
        }

        startLoading();
        System.out.println("\nPIN generated and set successfully!\n");
        System.out.println("Your new PIN is " + newPin + "\n");
        System.out.println("Thanks for your visit..!\n");
        }
    }

    void simulateLoading() {
        Thread loadingThread = new Thread(new Loading());
        loadingThread.start();
        try {
            loadingThread.join();
        } catch (InterruptedException e) {
            System.out.println("Loading interrupted");
        }
    }

    void startLoading() {
        simulateLoading();
    }
}

class CardLess {
    Scanner scan = new Scanner(System.in);

    CardLess() {
        System.out.println("\n1 : Deposit");
        System.out.println("2 : Withdrawal");
        System.out.print("\nPlease Select Transaction : ");
        int optionDW = scan.nextInt();

        switch (optionDW) {
            case 1:
                deposit();
                break;
            case 2:
                withdrawal();
                break;
            default:
                System.out.println("Invalid Option. Exiting.");
                System.out.println("Thanks for your visit..!\n");
                break;
        }
    }

    void deposit() {
        System.out.print("\nPlease Enter Your Account Number    : ");
        long accNumber = scan.nextLong();
        System.out.print("Please Re-Enter Your Account Number : ");
        long accNumber_re = scan.nextLong();

        if (accNumber != accNumber_re) {
            System.out.println("Account numbers do not match..!");
            System.out.println("Thanks for your visit..!\n");
            return;
        }

        System.out.println("\nVerifying your details...");
        startLoading();

        System.out.println("Name           : Beru");
        System.out.println("Father Name    : JinWoo");
        System.out.println("Account Number : " + accNumber);
        System.out.println("Phone Number   : +91 xxxxxx9042");

        System.out.print("\nPlease Enter Amount to Deposit : ");
        double amount = scan.nextDouble();

        startLoading();
        System.out.println("Amount " + amount + " deposited successfully..!\n");
        System.out.println("Thanks for your visit..!\n");
    }

    void withdrawal() {
        System.out.print("\nPlease Enter Your Phone Number      : ");
        long phoneNum = scan.nextLong();
        phoneNum += phoneNum;
        System.out.print("\nPlease Enter Your Account Number    : ");
        long accNum = scan.nextLong();
        System.out.print("Please Re-Enter Your Account Number : ");
        long accNum_re = scan.nextLong();

        if (accNum != accNum_re) {
            System.out.println("Account numbers do not match..!\n");
            System.out.println("Thanks for your visit..!\n");
            return;
        }

        System.out.print("\nPlease Enter Amount to Withdraw : ");
        double amount = scan.nextDouble();
        System.out.print("\nPlease Enter Your PIN Number    : ");
        int pin = scan.nextInt();

        if (pin != 1234) {
            System.out.println("\nInvalid PIN number..!\n");
            System.out.println("Thanks for your visit..!\n");
            return;
        }

        startLoading();
        System.out.println("\nAmount " + amount + " withdrawn successfully..!\n");
        System.out.println("Thanks for your visit..!\n");
    }

    void simulateLoading() {
        Thread loadingThread = new Thread(new Loading());
        loadingThread.start();
        try {
            loadingThread.join();
        } catch (InterruptedException e) {
            System.out.println("Loading interrupted");
        }
    }

    void startLoading() {
        simulateLoading();
    }
}

public class ProjectATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n            !..............Welcome..............!");
        System.out.println("\n1 : Card Less Transaction");
        System.out.println("2 : Insert Your Card");
        System.out.println("3 : Generate and Set PIN");
        System.out.print("\nPlease Select Transaction : ");

        int firstOption = scan.nextInt();

        switch (firstOption) {
            case 1:
                new CardLess();
                break;
            case 2:
                new CardTransaction();
                break;
            case 3:
                new PinGeneration();
                break;
            default:
                System.out.println("Thanks for your visit..!");
                break;
        }
    }
}
