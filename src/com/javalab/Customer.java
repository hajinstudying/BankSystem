package com.javalab;

public class Customer {
    private int id;         //회원ID
    private String name;    //이름
    private int pw;         //계좌비밀번호
    private Account account; // 계좌번호

    // 기본 생성자
    public Customer() {
    }

    // 오버로딩 생성자


    public Customer(int id, String name, int pw, Account account) {
        this.id = id;
        this.name = name;
        this.pw = pw;
        this.account = account;
    }

    // 게터 세터 메소드
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "고객ID=" + id +
                ", 이름='" + name + '\'' +
                ", 계좌비밀번호=" + pw + account +
                " ";
    }
}
