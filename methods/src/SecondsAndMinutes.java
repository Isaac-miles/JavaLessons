public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945)); //first test case
        System.out.println(getDurationString(65,45)); //second test case
        System.out.println(getDurationString(65, 145));
    }

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid data for seonds(" + seconds + "), must be a positive value";
        }

        int minutes = seconds / 60;
        return  getDurationString(minutes,seconds);

    }

    public static String getDurationString(int minutes, int seconds){
        if(seconds < 0){
            return "Invalid data for seonds(" + seconds + "), must be a positive value";
        }
        int hours = minutes /60;

        int remainingMinutes = minutes % 60;

        int remainingSeconds = seconds%60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s ";
    }
}
