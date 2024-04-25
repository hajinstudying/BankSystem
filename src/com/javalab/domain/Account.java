package com.javalab.domain;

import java.lang.reflect.Member;

public class Account {
    private String accountNum;  //계좌번호
    private double acBalance; //계좌 잔고
    private Customer customer;  //계좌주인

    // 기본생성자
    public Account() {
    }

    //오버로딩 생성자
    public Account(String accountNum, double acBalance, Customer customer) {
        this.accountNum = accountNum;
        this.acBalance = acBalance;
        this.customer = customer;
    }

    // 게터 세터
    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getAcBalance() {
        return acBalance;
    }

    public void setAcBalance(double acBalance) {
        this.acBalance = acBalance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // 입금 메소드
    public synchronized void  saveMoney(double savemoney){
        double currentMoney = getAcBalance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        setAcBalance(currentMoney+savemoney);
        System.out.println("입금완료");
        System.out.println("현재 잔액은 : " + getAcBalance() + "입니다");

    }


    // 출금 메소드
    public synchronized void withdraw(double withdrawmoney){
        double currentMoney = getAcBalance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(currentMoney-withdrawmoney>=0){
            setAcBalance(currentMoney-withdrawmoney);
            System.out.println("출금 완료");
            System.out.println("현재 잔액은 : "+ getAcBalance() + "입니다");
        } else {
            System.out.println("잘못된 요청입니다.");
        }
    }
}