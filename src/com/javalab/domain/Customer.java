package com.javalab.domain;

public class Customer {
    //회원Id, 이름, 주민번호, 비밀번호
    private int Id;         //회원ID
    private String name;    //이름

    //기본생성자
    public Customer() {
    }
    //오버로딩 생성자
    public Customer(int id, String name, Account acount, int pw) {
        Id = id;
        this.name = name;
    }

    public Customer(int i, String 홍길동) {
    }

    //게터 세터

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
}
