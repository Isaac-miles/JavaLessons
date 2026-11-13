package com.weposit.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO {
    private String name;
    private String socialSecurityNumber;


    @Override
    public void addAccount(Account account, boolean vip) {
        System.out.println(getClass()+ ": DOING MY DB WORK: ADDING MY ACCOUNT");
    }

    @Override
    public boolean doWork() {
        System.out.println(getClass()+ ": DOING MY DB WORK: DOING MY ACCOUNT");
        return true;
    }

    public String getName() {
        System.out.println(getClass()+ ": IN GET NAME");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass()+ ": IN SET NAME");
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        System.out.println(getClass()+ ": IN GET Social Security Number");
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        System.out.println(getClass()+ ": IN SET Social Security Number");
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
