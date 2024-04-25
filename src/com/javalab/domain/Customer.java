package com.javalab.domain;

public class Customer {
    //field
    private int Id;         //회원ID
    private String name;    //이름
    private String ssn;     //주민번호
    private String account; //계좌
    private int pw;         //비밀번호

    //생성자

    public Customer() {
    }

    public Customer(int id, String name, String ssn, String account, long balance, int pw) {
        Id = id;
        this.name = name;
        this.ssn = ssn;
        this.account = account;
        this.pw = pw;
    }

    //getter setter

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

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getPw() {
        return pw;
    }

    public void setPw(int pw) {
        this.pw = pw;
    }

    //toString 오버라이딩

    @Override
    public String toString() {
        return "Customer{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", account='" + account + '\'' +
                ", pw=" + pw +
                '}';
    }
}
