package dev.writingFiles;

import java.io.*;
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
                .limit(25)
                .toList();

//        System.out.println(header);
//        students.forEach(s->s.getEngagementRecords().forEach(System.out::println));

        Path path = Path.of("student.csv");
//        try{
//            Files.writeString(path,header);
//            for(Student s : students){
//                Files.write(path,s.getEngagementRecords(), StandardOpenOption.APPEND);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try{
//            List<String> data = new ArrayList<>();
//            data.add(header);
//            for (Student student : students) {
//                data.addAll(student.getEngagementRecords());
//            }
//            Files.write(path,data);
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        try(BufferedWriter bufferedWriter =
                Files.newBufferedWriter(Path.of("take2.csv"))){
            bufferedWriter.write(header);
            bufferedWriter.newLine();
            int count = 0;
            for (Student student :students){
                for(var record:student.getEngagementRecords()){
                    bufferedWriter.write(record);
                    bufferedWriter.newLine();
                    count++;
                    if(count % 5 == 0){
                        Thread.sleep(2000);
                        System.out.print(".");
                    }
                    if(count % 10 ==0){
                        bufferedWriter.flush();
                    }
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try(FileWriter fileWriter = new FileWriter("take3.csv")){
            fileWriter.write(header);
            fileWriter.write(System.lineSeparator());
            for (Student student :students){
                for(var record:student.getEngagementRecords()){
                    fileWriter.write(record);
                    fileWriter.write(System.lineSeparator());

                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        try(PrintWriter printWriter = new PrintWriter("take4.txt")){
            printWriter.println(header);
            for (Student student :students){
                for(var record:student.getEngagementRecords()){
                    String[] recordData = record.split(",");
                    printWriter.printf("%-12d%-5s%2d%4d%3d%-1s".formatted(
                            student.getStudentId(),
                            student.getCountry(),
                            student.getEnrollmentYear(),
                            student.getEnrollmentMonth(),
                            student.getEnrollmentAge(),
                            student.getGender()));
                    printWriter.printf("%-1s",(student.hasExperience()?'Y':'N')); //Experienced?
                    printWriter.format("%-3s%10.2f%-10s%-4s%-30s",
                            recordData[7],
                            student.getPercentComplete(recordData[7]),
                            recordData[8],
                            recordData[9],
                            recordData[10]);
                    printWriter.println();
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
