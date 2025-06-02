package dev.zico;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    //The IOException is a special kind of exception, called a Checked Exception. A checked exception represents an
// anticipated or common problem, that might occur
//An Unchecked Exception is an instance of a RuntimeException or one of its subclasses
// LBYL -> Look Before You Leap: this style of coding involves checking for errors before you perform an operation
// EAFP -> Easier to Ask Forgiveness than Permission: This assumes an operation will usually succeed, then handles any
// error that occur, if they do occur
    public static void main(String[] args){
        String fileName = "files/testing.csv";
        System.out.println("Current working directory (cwd) = "+ new File("").getAbsolutePath());
        File file = new File(fileName);
        if(!file.exists()){
            System.out.println("No such file exist");
        }
        System.out.println("Good to go.");

        for(File f : File.listRoots()){
            System.out.println(f);
        }

        Path path = Paths.get("files/testing.csv");
        System.out.println("Current working directory (cwd) = "+ new File("").getAbsolutePath());
        if(!Files.exists(path)){
            System.out.println("2 No such file exist");
        }
        System.out.println(" 2 Good to go.");
    }

    private static  void testFile(String fileName){
        Path path = Paths.get(fileName);
        FileReader reader = null;
        try {
//            List<String> lines = Files.readAllLines(path);
             reader = new FileReader(fileName);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            System.out.println("File not found but lets proceed");
        }
        System.out.println("File exists and we can proceed to action");
    }

    private static void testFile2(String filename){
        try (FileReader reader = new FileReader(filename)) {
        }
        catch (NullPointerException | IllegalArgumentException badData){
            System.out.println("User has provided bad data");
        }
        catch (FileNotFoundException e){
            System.out.println("File "+ filename + "does not exist");
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        catch (Exception e){
            System.out.println("Something unrelated happened");
        }
        finally {
            System.out.println("Test 2 maybe I want to log something ");
        }
        System.out.println("File Exist and able to use resources");
    }
}
