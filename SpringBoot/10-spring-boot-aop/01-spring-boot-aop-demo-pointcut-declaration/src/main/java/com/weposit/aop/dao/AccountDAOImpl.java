package com.weposit.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO {
    @Override
    public void addAccount(Account account, boolean vip) {
        System.out.println(getClass()+ ": DOING MY DB WORK: ADDING MY ACCOUNT");
    }

    @Override
    public boolean doWork() {
        System.out.println(getClass()+ ": DOING MY DB WORK: DOING MY ACCOUNT");
        return true;
    }


}
