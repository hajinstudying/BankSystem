package com.javalab.Database;

import com.javalab.domain.Customer;

import java.util.ArrayList;

public class Database {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        //id/이름/주민번호/계좌/잔액/비밀번호
        customers.add(new Customer(1,"홍길동",900101,3560598023693,50000000,1234));
        customers.add(new Customer(2,"김길동",900101,5468465454654,50000000,1234));
        customers.add(new Customer(3,"이길동",900101,8464518951384,50000000,1234));
        customers.add(new Customer(4,"서길동",900101,8489465123154,50000000,1234));
        customers.add(new Customer(5,"윤길동",900101,3030303,50000000,1234));
        customers.add(new Customer(6,"심길동",900101,3030303,50000000,1234));
    }
}
