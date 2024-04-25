package com.javalab.domain;

public class Account {
    private String accountNum;  //계좌번호
    private double balance; //계좌 잔고
    private Customer customer;  //계좌주인
    private int password;

    // 기본생성자
    public Account() {
    }

    //오버로딩 생성자
    public Account(String accountNum, double balance, Customer customer, int password) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.customer = customer;
        this.password = password;
    }

    // 게터 세터
    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    // 입금 메소드
    public synchronized void  saveMoney(double savemoney){
        double currentMoney = getBalance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        setBalance(currentMoney+savemoney);
        System.out.println("입금완료");
        System.out.println("현재 잔액은 : " + getBalance() + "입니다");

    }


    // 출금 메소드
    public synchronized void withdraw(double withdrawmoney){
        double currentMoney = getBalance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(currentMoney-withdrawmoney>=0){
            setBalance(currentMoney-withdrawmoney);
            System.out.println("출금 완료");
            System.out.println("현재 잔액은 : "+ getBalance() + "입니다");
        } else {
            System.out.println("잘못된 요청입니다.");
        }
    }
}