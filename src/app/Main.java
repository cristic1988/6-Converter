package app;

public class Main {

    private static final double CONV_K1 = 1.8;
    private static final double CONV_K2 = 32;

    public static void main(String[] args) {
        System.out.println("App for converting units of temperature.");
        double tempF = 12;
        double celsiyDegree = convtempFTotempC(tempF);
        System.out.println("Result is " + celsiyDegree + " tempC.");

    }

    private static double convtempFTotempC(double tempF) {
        return (tempF - CONV_K2) / CONV_K1;

    }

}
