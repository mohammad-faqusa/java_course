public class SecondsAndMinutes {
    public static void main(String[] args) {

        System.out.println(getDurationString(3700));
        System.out.println(getDurationString(600, 44));
    }

    public static String getDurationString(int seconds){
        if(seconds < 0) return "Invalid Input";
        int hours =  seconds/3600;
        seconds =  seconds % 3600 ;
        int minutes = seconds/60;
        seconds = seconds % 60;

        return "'"+hours+"h "+minutes+"m "+seconds+"s'";
    }

    public static String getDurationString(int minutes, int seconds) {
        if(seconds < 0 || seconds > 60) return "Invalid Input";
        return getDurationString(minutes * 60 + seconds);
    }
}
