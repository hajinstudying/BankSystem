package com.javalab.domain;

import java.util.Date;

public class Transaction {
    // 거래일시 , 거래 계좌 , 거래 유형 , 거래 금액
    private Date date;
    private Account account;
    private String type;
    private double amount;

    public Transaction(Date date, Account account, String type, double amount) {
        this.date = date;
        this.account = account;
        this.type = type;
        this.amount = amount;
    }

    public Transaction() {
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


}