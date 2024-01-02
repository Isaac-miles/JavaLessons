public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945)); //first test
    }

    public static String getDurationString(int seconds){
        //two-step approach
        int minutes = seconds/60;
        int hours = minutes /60;

        int remainingMinutes = minutes % 60;

        int remainingSeconds = seconds%60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s ";
    }

    public static String getDurationString(int minutes, int seconds){
        return "";
    }
}
