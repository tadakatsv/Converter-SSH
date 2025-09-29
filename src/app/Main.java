package app;

public class Main {
    private static final double CONV_K = 1.609;
    public static void main(String[] args) {
        System.out.println("Same converter, but now through SSH");
        int miles = 16;
        System.out.println("Miles to km: " + convMilesToKm(miles));
    }
    private static double convMilesToKm(double miles) {
        return miles * CONV_K;
    }


}
