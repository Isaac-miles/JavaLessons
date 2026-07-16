package devzico;

import devzico.dao.AppDAO;
import devzico.entity.Instructor;
import devzico.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner(AppDAO appDAO) {
        return runer->{
            createInstructor(appDAO);
        };
    }

    private void createInstructor(AppDAO appDAO) {
        Instructor tempInstructor = new Instructor("Miles","Leanerd","miles@hayoo.com");

        InstructorDetail tempInstructorDetail = new InstructorDetail("www.miles/home","learning");

        appDAO.save(tempInstructor);
    }
}
