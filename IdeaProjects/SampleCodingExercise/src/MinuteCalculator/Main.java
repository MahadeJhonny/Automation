package MinuteCalculator;

public class Main {
    private static final String Value_Message="Invalid Value";
    public static void main(String[] args) {
        System.out.println(getDurationString(70,20));
        System.out.println(getDurationString(100));
    }
    private static String getDurationString(long minutes,long seconds) {
        if((minutes<0) || ((seconds<0) || seconds>59)){
            return Value_Message;
        }
       long Hours = minutes/60;
        long remainingMinutes=minutes%60;
        return Hours + "h " + remainingMinutes + "m " + seconds + "s ";
    }
    private static String getDurationString(long seconds) {
        if (seconds<0) {
            return Value_Message;
        }

        long minutes= seconds/60;
        long remainingMinutes=seconds%60;
        return minutes + "m " + remainingMinutes + "s ";

    }
}
