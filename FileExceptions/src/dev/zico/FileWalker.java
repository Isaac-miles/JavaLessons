package dev.zico;

import java.io.IOException;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;

public class FileWalker {
    public static void main(String[] args) {
        Path startingPath  = Path.of(".");
        FileVisitor<Path> statsVisitor = new StatsVisitor();
        try {
            Files.walkFileTree(startingPath,statsVisitor);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static class StatsVisitor extends SimpleFileVisitor<Path>{

    }
}
