package com.javalab.sec02;

public class Customer {
    private int Id;         //회원ID
    private String name;    //이름
    private int pw;         //계좌비밀번호
    private Account accountNum; // 계좌번호

    // 기본 생성자
    public Customer() {
    }

    // 오버로딩 생성자

    public Customer(int id, String name, int pw, Account accountNum) {
        Id = id;
        this.name = name;
        this.pw = pw;
        this.accountNum = accountNum;
    }

    // 게터 세터 메소드
    public Account getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(Account accountNum) {
        this.accountNum = accountNum;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPw() {
        return pw;
    }

    public void setPw(int pw) {
        this.pw = pw;
    }

    //toString overriding
    @Override
    public String toString() {
        return "Customer{" +
                "고객ID=" + Id +
                ", 이름='" + name + '\'' +
                ", 계좌비밀번호=" + pw +accountNum+
                " ";
    }
}
