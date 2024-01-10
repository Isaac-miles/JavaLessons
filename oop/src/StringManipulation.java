public class StringManipulation {
    public static void main(String[] args) {
//        StringManipulations();
        String hello = "hello";
        StringBuilder helloWorldBuilder = new StringBuilder("hello" + " world");
        hello.concat("world Isaac");
        helloWorldBuilder.append("Isaac");

        theStringBuilder(hello);
        theStringBuilder(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        StringBuilder emptyStart32 = new StringBuilder(32);

        theStringBuilder(emptyStart);
        theStringBuilder(emptyStart32);
    }


    public static void StringManipulations(){
        String dob = "25-11-1996";
        int startIndex = dob.indexOf("1996");
        System.out.println("stringIndex = " +startIndex);
        System.out.println("Birth year = " + dob.substring(startIndex));

        System.out.println("month = "+ dob.substring(3,5));
        String newDob = String.join("/","25","11", "1996");
        System.out.println("new date = " + newDob);

        //never do this as this is inefficient
        newDob = "25";
        newDob = newDob.concat("/");
        newDob = newDob.concat("15");
        newDob = newDob.concat(("/"));
        newDob = newDob.concat("1996");

        newDob = "25".concat("/").concat("15").concat("/").concat("1997");
        System.out.println(newDob);

        System.out.println(newDob.replace('/','-'));
        System.out.println(newDob.replace("5","00"));

        System.out.println(newDob.replaceFirst("/","-"));
        System.out.println(newDob.replaceAll("5","---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }

    public static void theStringBuilder(StringBuilder builder){
        System.out.println("String = "+ builder);
        System.out.println("length = "+ builder.length());
    }
    public static void theStringBuilder(String builder){
        System.out.println("String = "+ builder);
        System.out.println("length = "+ builder.length());
    }
}
