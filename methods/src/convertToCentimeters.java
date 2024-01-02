public class convertToCentimeters {
    public static void main(String[] arg){
        System.out.println("5ft, 8in = "+ convertToCentimeter(5,8) + "cm");
        System.out.println("68in = " + convertToCentimeter(68) + "cm");
    }
    public static double convertToCentimeter(int inches){
        return inches * 2.54;
    }
    public static  double convertToCentimeter(int feet, int inches){
        return convertToCentimeter((feet * 12) + inches);
    }
}
