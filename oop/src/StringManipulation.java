public class StringManipulation {
    public static void main(String[] args) {
        String dob = "25-11-1996";
        int startIndex = dob.indexOf("1996");
        System.out.println("stringIndex = " +startIndex);
        System.out.println("Birth year = " + dob.substring(startIndex));

        System.out.println("month = "+ dob.substring(3,5));
        String newDob = String.join("/","25","11", "1996");
        System.out.println("new date = " + newDob);
    }
}
