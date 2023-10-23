package speedconverter;
// 公里转化成英里
public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        // double 输入公里数，输出long型英里数
        // 1、如果公里数为负数，返回-1
        if ( kilometersPerHour < 0 ){
            return -1;
        }
        // 2、不为负，然后计算英里数
        long milesPerHour = Math.round(kilometersPerHour / 1.609);
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        // 如果公里数为负数，返回无效值；否则输出相互转化值
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println( kilometersPerHour +"km/h = " + milesPerHour + "mi/h");
        }
    }


}
