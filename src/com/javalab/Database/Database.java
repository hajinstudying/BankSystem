package com.javalab.Database;

import com.javalab.domain.Account;
import com.javalab.domain.Bank;
import com.javalab.domain.Customer;
import com.javalab.domain.Transaction;

import java.util.ArrayList;

public class Database {
    //고객 클래스 리스트
    ArrayList<Customer> customers = new ArrayList<>();
    //계좌 클래스 리스트
    ArrayList<Account> accounts = new ArrayList<>();
    //거래내역 클래스 리스트
    ArrayList<Transaction> transactions = new ArrayList<>();
    //은행 클래스 리스트
    ArrayList<Bank> banks = new ArrayList<>();

    //기본 생성자
    public Database(){
        initializeData();   //데이터 생성작업을 별도의 메소드로 분리
    }

    //데이터 생성 메소드
    public void initializeData(){
        //고객 리스트 초기화

        //계좌 리스트 초기화
        //거래내역 리스트 초기화
        //은행 리스트 초기화
    }

}
