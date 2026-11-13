package com.weposit.aop.dao;

public interface AccountDAO {
    void addAccount(Account account, boolean vip);
    boolean doWork();
}
