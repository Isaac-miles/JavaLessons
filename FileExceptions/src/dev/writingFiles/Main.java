package dev.writingFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Course jsm = new Course("JSM", "Javascript Masterclass");
        Course pym = new Course("PYM", "Python Masterclass");

        String header = """
                Student Id,Country Code,Enrolled Year,Age,Gender,\
                Experienced,Course Code,Engagement Month,Engagement Year,\
                Engagement Type""";

        List<Student> students = Stream
                .generate(()->Student.getRandomStudent(jsm,pym))
                .limit(5)
                .toList();

//        System.out.println(header);
//        students.forEach(s->s.getEngagementRecords().forEach(System.out::println));

        Path path = Path.of("student.csv");
        try{
            Files.writeString(path,header);
            for(Student s : students){
                Files.write(path,s.getEngagementRecords());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
