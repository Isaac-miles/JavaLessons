public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945)); //first test case
        System.out.println(getDurationString(65,45)); //second test case
        System.out.println(getDurationString(-65, -145));
    }

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid data for seconds(" + seconds + "), must be a positive value";
        }
        return  getDurationString(seconds/60,seconds%60);
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0){
            return "Invalid data for seonds(" + minutes + "), must be a positive value";
        }
        if(seconds <= 0 || seconds > 59){
            return "Invalid data for seonds(" + minutes + "), must be between 0 and 59";

        }
        int hours = minutes /60;

        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s ";
    }
}
