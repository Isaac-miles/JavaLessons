package dev.SetsAndMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactData {
    private static final String phoneData = """
            Charles Okocha, 08023448294
            Imade David, 02093448723
            Imole Brown, 09428337382
            Faith Yakubu, 02092883847
            Isaac All, 07030992937
            Holding Clerk, 09022394876
            Robbin Hood, 01211339487
            Lucky Dube, 07020205510
            Prince Dim, 05020993847
            Johnson Drew, 09055903610
            """;
    private static final String emailData = """
            Nikky Jones, nicky@gmail.com
            Micky Brown, micky@gmail.com
            Livi Stingy, livith@yahoo.com
            Amos Calm, amos@google.com
            Isaac Brown, isaac@gmail.com
            Junior Dash, juniodahs@gmail.com
            """;

    public static List<Contact> getData(String type){
        List<Contact> dataList = new ArrayList<>();
        Scanner scanner = new Scanner(type.equals("phone")? phoneData:emailData);
        while (scanner.hasNext()){
            String[] data = scanner.nextLine().split(",");
            System.out.println("data was split here"+ Arrays.toString(data));
            Arrays.asList(data).replaceAll(String::trim);
            System.out.println("After it was replaced and trim"+ Arrays.toString(data));
            if(type.equals("phone")){
                dataList.add(new Contact(data[0],Long.parseLong(data[1])));
            }else if(type.equals("email")){
                dataList.add(new Contact(data[0], data[1]));
            }
        }
        return dataList;
    }
}
