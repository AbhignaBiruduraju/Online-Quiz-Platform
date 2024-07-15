import java.util.Scanner;
import java.io.*;

public class Bankops {
    static char ch;
    static int d, w;
    static int b = 1000;
    static Scanner s1 = new Scanner(System.in);

    public static void balanceCheck() {
        System.out.println("Balance amount: " + b);
    }

    public static void withdrawal() {
        System.out.println("Enter the amount to be withdrawn: ");
        w = s1.nextInt();

        if (b < w) {
            System.out.println("Amount can't be withdrawn due to less balance");
        } else {
            b = b - w;
            System.out.println("Amount withdrawn");
        }
    }

    public static void deposit() {
        System.out.println("Enter the amount to be deposited: ");
        d = s1.nextInt();
        b = b + d;
        System.out.println("Amount deposited");
    }

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nEnter the operation required to work (b: balance, d: deposit, w: withdrawal, e: exit): ");
            ch = s1.next().charAt(0);

            switch (ch) {
                case 'b':
                    balanceCheck();
                    break;

                case 'd':
                    deposit();
                    break;

                case 'w':
                    withdrawal();
                    break;

                case 'e':
                    exit = true;
                    System.out.println("Operations dismissed");
                    break;

                default:
                    System.out.println("Entered operation is incorrect");
            }
        }
       
    }
}
