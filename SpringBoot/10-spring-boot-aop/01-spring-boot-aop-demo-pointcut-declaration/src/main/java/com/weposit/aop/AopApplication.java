package com.weposit.aop;

import com.weposit.aop.dao.Account;
import com.weposit.aop.dao.AccountDAO;
import com.weposit.aop.dao.MembershipDAO;
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
    public CommandLineRunner commandLineRunner(AccountDAO accountDAO, MembershipDAO membershipDAO) {
        return runner->{
            demoTheBeforeAdvice(accountDAO,membershipDAO);
        };
    }

    public void demoTheBeforeAdvice(AccountDAO accountDAO, MembershipDAO membershipDAO) {
        accountDAO.addAccount(new Account(), true);
        accountDAO.doWork();
        //call addAccount from membership
        membershipDAO.addAccount();
        membershipDAO.addMember();
    }
}
