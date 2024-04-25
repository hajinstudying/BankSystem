package com.javalab.domain;
public class Bank {
    private Account account;

    private double bankBlance;

    public Bank(Account account, Customer customer, double bankBlance) {
        this.account = account;
        this.customer = customer;
        this.bankBlance = bankBlance;
    }

    public Bank() {
    }



    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBankBlance() {
        return bankBlance;
    }

    public void setBankBlance(double bankBlance) {
        this.bankBlance = bankBlance;
    }

    // 은행 잔고 업데이트

    // 고객 이름과 계좌 함께출력




}