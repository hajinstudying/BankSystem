package com.javalab;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Transaction {
    // 거래일시 , 거래 계좌 , 거래 유형 , 거래 금액
    private LocalDateTime date;
    private Account account;
    private String type;
    private double amount;

    public Transaction(String date, Account account, String type, double amount) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년-MM월-dd일 HH시mm분ss초");
        this.date = LocalDateTime.parse(date,formatter);
        this.account = account;
        this.type = type;
        this.amount = amount;
    }

    public Transaction() {
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
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

    @Override
    public String toString() {
        return "거래내역{" +
                "날짜 :" + date +
                  account +
                ", 입출금 : '" + type + '\'' +
                ", 거래 금액 : " + amount +
                '}';
    }
}
