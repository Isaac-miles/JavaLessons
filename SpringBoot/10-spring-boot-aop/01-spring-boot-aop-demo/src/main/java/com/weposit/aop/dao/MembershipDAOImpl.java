package com.weposit.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO {
    @Override
    public void addAccount() {
        System.out.println(getClass()+ ": DOING MY DB WORK: ADDING MY ACCOUNT");
    }

    @Override
    public void addMember() {
        System.out.println(getClass()+ " : DOING MY DB WORK: ADDING MEMBER");
    }
}
