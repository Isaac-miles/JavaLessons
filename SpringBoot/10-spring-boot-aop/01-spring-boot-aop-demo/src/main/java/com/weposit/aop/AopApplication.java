package com.weposit.aop;

import com.weposit.aop.dao.AccountDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner(AccountDAO accountDAO) {
        return runner->{
            demoTheBeforeAdvice(accountDAO);
        };
    }

    public void demoTheBeforeAdvice(AccountDAO accountDAO) {

        accountDAO.addAccount();
    }
}
