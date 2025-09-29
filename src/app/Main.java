package app;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static final double CONV_K = 1.609;
    public static void main(String[] args) {
        byte choice  = getUserChoice();
        System.out.println("enter the number which one to convert");
        double number = scanner.nextDouble();
        switch (choice) {
            case 1:
                System.out.println("here your km:" + convMilesToKm(number));
                break;
            case 2:
                System.out.println("here your miles:" + convKmToMiles(number));
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    private static double convMilesToKm(double miles) {
        return miles * CONV_K;
    }
    private static double convKmToMiles(double miles) {
        return miles * CONV_K;
    }
    private static byte getUserChoice() {
        System.out.println("Same converter, but now through SSH");
        System.out.println("1:For miles to km");
        System.out.println("2:For kilometers to miles");
        return scanner.nextByte();
    }
}
