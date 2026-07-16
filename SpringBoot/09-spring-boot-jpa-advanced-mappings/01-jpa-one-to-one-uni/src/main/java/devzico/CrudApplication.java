package devzico;

import devzico.dao.AppDAO;
import devzico.entity.Instructor;
import devzico.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner(AppDAO appDAO) {
        return runer->{
//            createInstructor(appDAO);
//            findInstructor(appDAO);
            removeInstructor(appDAO);
        };
    }

    private void removeInstructor(AppDAO appDAO) {
        int id = 1;
        System.out.println("Removing instructor " + id);
        appDAO.delete(id);
        System.out.println("Instructor Deleted " + id);
    }

    private void findInstructor(AppDAO appDAO) {
        int id = 3;
        System.out.println("Finding instructor with id " + id);
        var instructor = appDAO.findById(id);
        if (instructor == null) {
            System.out.println("No instructor with id " + id);
        }else{
            System.out.println("tempInstructor "+ instructor);
            System.out.println("associate details "+ instructor.getInstructorDetail());
        }

    }

    private void createInstructor(AppDAO appDAO) {
//        Instructor tempInstructor = new Instructor("Miles","Omokafe","miles@hayoo.com");
        Instructor tempInstructor = new Instructor("Zico","avies","zico@hayoo.com");

        InstructorDetail tempInstructorDetail = new InstructorDetail("www.miles/home","music");
        tempInstructor.setInstructorDetail(tempInstructorDetail);
        System.out.println("Instructor created "+ tempInstructor);
        appDAO.save(tempInstructor);
    }
}
