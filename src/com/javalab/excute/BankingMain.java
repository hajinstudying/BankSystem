package com.javalab.excute;

import com.javalab.Database.Database;
import com.javalab.domain.Account;
import com.javalab.domain.Customer;
import com.javalab.domain.Transaction;

import java.util.ArrayList;
import java.util.Scanner;

public class BankingMain {
    public static void main(String[] args) {
        //데이터베이스 로드
        Database db = new Database();
        ArrayList<Account> accounts = db.getAccounts();
        ArrayList<Customer> customers = db.getCustomers();
        ArrayList<Transaction> transactions = db.getTransactions();
        ArrayList<Bank> banks = db.getBanks();

        //1. 계좌번호를 입력받음
        Scanner scanner = new Scanner(System.in);
        System.out.println("계좌번호를 입력해주세요.");
        String inputAccount = scanner.nextLine();

        //2. 입력받은 계좌번호 검색
        Account currentAccount = null;  //사용자의 계좌정보를 담을 변수
        for(Account account : accounts){
            if(inputAccount.equals(account.getAccountNum())){
                currentAccount = account;
                break;
            }else{
                System.out.println("입력한 계좌 정보가 없습니다.");
            }
        }

        //3. 사용자로부터 비밀번호 입력받음
        System.out.println("비밀번호 네자리를 입력해주세요.");
        int inputPassword = scanner.nextInt();

        //4. 비밀번호가 맞는지 확인
        if(currentAccount.getPassword()!=inputPassword){
            System.out.println("비밀번호를 잘못 입력하셨습니다.");
        }else {
            System.out.println("이용하실 선택지의 번호를 입력해주세요.");    //서비스 선택
            System.out.println("1 : 잔액확인   2 : 입금   3 : 출금   4 : 종료");
            int service = scanner.nextInt();
            switch (service) {
                case 1:
                    System.out.println("잔액확인");
                    System.out.println("계좌번호 : " + currentAccount.getAccountNum());
                    System.out.println("잔약 : " + currentAccount.getAccountNum());
                    break;
                case 2:
                    break;

                case 3:
                    break;
            }
        }
    }//end of main
}
