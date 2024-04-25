package com.javalab.sec02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Account {
    private int accountNum;  //계좌번호
    private double acBalance; //계좌 잔고


    // 기본생성자
    public Account() {
    }


    //오버로딩 생성자
    public Account(int accountNum, double acBalance) {
        this.accountNum = accountNum;
        this.acBalance = acBalance;
    }

    // 게터 세터
    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public double getAcBalance() {
        return acBalance;
    }

    public void setAcBalance(double acBalance) {
        this.acBalance = acBalance;
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
        addTransaction("savemoney",savemoney);
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
            addTransaction("withdraw",withdrawmoney);
            System.out.println("출금 완료");
            System.out.println("현재 잔액은 : "+ getAcBalance() + "입니다");
        } else {
            System.out.println("잘못된 요청입니다.");
        }


    }

    private void addTransaction(String type, double amount) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년-MM월-dd일 HH시mm분ss초");
        String formattedDateTime = date.format(formatter);
        Transaction transaction = new Transaction(formattedDateTime, this, type, amount);
        BankDatabase.getInstance().addTransaction(transaction);
    }

    @Override
    public String toString() {
        return " " +
                "계좌번호 :" + accountNum +
                ", 계좌잔고 :" + acBalance +
                '}';
    }


}
