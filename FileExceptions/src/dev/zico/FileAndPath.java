package dev.zico;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileAndPath {
    public static void main(String[] args) {
        useFile("testFile.txt");
        System.out.println("------------------------------------------------");
        usePath("pathFile.tst");
    }

    private static void useFile(String fileName){
        File file = new File(fileName);
        boolean fileExists = file.exists();
        System.out.printf("File '%s' %s%n", fileName, fileExists ? "exists." : "does not exist.");

        if(fileExists){
            System.out.println("Deleting File: "+ fileName);
            fileExists = !file.delete();
        }
        if(!fileExists){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Something went wrong!!! ");;
            }
            System.out.println("Created File: "+ fileName);
            if(file.canWrite()){
                System.out.println("Would write to file here");
            }
        }
    }
    private static void usePath(String fileName){
        Path path = Path.of(fileName);

        boolean fileExists = Files.exists(path);
        System.out.printf("File '%s' %s%n", fileName, fileExists ? "exists." : "does not exist.");

        if(fileExists){
            System.out.println("Deleting File: "+ fileName);
            try {
                Files.delete(path);
                fileExists = false;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(!fileExists){
            try {
                Files.createFile(path);

            System.out.println("Created File: "+ fileName);
            if(Files.isWritable(path)){
                Files.writeString(path,"""
                        Here to test that write file works as expected
                        In all things Praise God
                        """);
            }
                System.out.println("Reading the file back to base");
                System.out.println("-------------------------------");
                System.out.println(Files.readString(path));
            } catch (IOException e) {
                System.out.println("Something went wrong!!! ");;
            }
        }
    }
}
