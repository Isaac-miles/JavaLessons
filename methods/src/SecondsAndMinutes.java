public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945)); //first test
    }

    public static String getDurationString(int seconds){
        //two-step approach
        int minutes = seconds/60;
        int hours = minutes /60;
        System.out.println("hours = "+ hours);

        int remainingMinutes = minutes % 60;
        System.out.println("minutes =" + minutes);
        System.out.println("remainingMinutes =" + remainingMinutes);

        int remainingSeconds = seconds%60;
        System.out.println("remainingSeconds = " + remainingSeconds);

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s ";
    }

    public static String getDurationString(int minutes, int seconds){
        return "";
    }
}
