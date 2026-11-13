package com.weposit.aop.dao;

public interface AccountDAO {
    void addAccount(Account account, boolean vip);
    boolean doWork();

    public String getName();

    public void setName(String name);

    public String getSocialSecurityNumber();

    public void setSocialSecurityNumber(String socialSecurityNumber);
}
