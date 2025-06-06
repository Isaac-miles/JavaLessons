package dev.zico;

import java.nio.file.Path;

public class pathListings {
    public static void main(String[] args) {
        Path path = Path.of("files/testing.txt");
        printPathInfo(path);
    }
    private static void printPathInfo(Path path){
        System.out.println("Path: "+ path);
        System.out.println("fileName = "+ path.getFileName());
        System.out.println("parent = " + path.getParent());
        Path absolutePath = path.toAbsolutePath();
        System.out.println("Absolute Path: = "+ absolutePath);
        System.out.println("Absolute Path Root: = "+ absolutePath.getRoot());
        System.out.println("Root = "+ path.getRoot());
        System.out.println("isAbsolute = "+path.isAbsolute());

        System.out.println(absolutePath.getRoot());
//        int i = 1;
//        var it = path.toAbsolutePath().iterator();
//        while (it.hasNext()){
//            System.out.println(".".repeat(i++)+" "+ it.next());
//        }

        int pathParts = absolutePath.getNameCount();

        System.out.println("------------------------------------");

    }
}
