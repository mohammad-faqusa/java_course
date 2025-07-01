public class SpeedConverter {
    // write code here
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0) return -1;
        
        return (long)(Math.round((0.6215 * kilometersPerHour)));
        
    }
    
    public static void printConversion(double kilometersPerHour){
        if(toMilesPerHour(kilometersPerHour) == -1){
            System.out.print("Invalid Value");
            return;
        }
        System.out.print(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h"); 
    }
}