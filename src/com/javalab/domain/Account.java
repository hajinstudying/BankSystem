package com.javalab.domain;
public class Account {
    private String accountNum;  //계좌번호
    private double acBalance; //계좌 잔고

    // 기본생성자
    public Account() {
    }


    //오버로딩 생성자
    public Account(String accountNum, double acBalance) {
        this.accountNum = accountNum;
        this.acBalance = acBalance;
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