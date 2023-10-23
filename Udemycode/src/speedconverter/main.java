package speedconverter;

import speedconverter.SpeedConverter;

public class main {
    public static void main(String[] args) {
        double miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);


        SpeedConverter.printConversion(55.6);
    }
}
