public class SecondsAndMinutes {
    public static void main(String[] args) {

        System.out.println(getDurationString(3700));
        System.out.println(getDurationString(600, 44));
    }

    public static String getDurationString(int seconds){
        if(seconds < 0) return "Invalid Data for seconds(" +  seconds + ") it must be greater than 0";
        int hours =  seconds/3600;
        seconds =  seconds % 3600 ;
        int minutes = seconds/60;
        seconds = seconds % 60;

        return "'"+hours+"h "+minutes+"m "+seconds+"s'";
    }

    public static String getDurationString(int minutes, int seconds) {
        if(minutes < 0 ) return "Invalid Data for minutes(" +  minutes + ") it must be greater than 0";
        if(seconds < 0 || seconds > 60) return "Invalid Data for seconds(" +  seconds + ") it must be between 0 and 60";
        return getDurationString(minutes * 60 + seconds);
    }
}
