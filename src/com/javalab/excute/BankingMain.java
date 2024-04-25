package com.javalab.excute;

import com.javalab.Database.Database;
import com.javalab.domain.Account;
import com.javalab.domain.Bank;
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


        Scanner scanner = new Scanner(System.in);
        System.out.println("계좌번호를 입력해주세요.");    //계좌번호 입력받음
        String inputAccount = scanner.nextLine();
        System.out.println("비밀번호 네자리를 입력해주세요.");  //비밀번호를 입력받음
        int inputPassword = scanner.nextInt();

        //입력받은 정보로 뱅킹에서 찾아옴
        Account currentAccount = null;
        for(Account account : accounts){
            if(inputAccount.equals(account.getAccountNum())){

                break;
            }
        }
        for(inputPassword==)

        System.out.println("이용하실 선택지의 번호를 입력해주세요.");    //서비스 선택
        System.out.println("잔액확인 : 1   입금 : 2   출금 : 3");
        int service = scanner.nextInt();

        switch(service){
            case 1 :
                System.out.println("잔액확인");

                break;
            case 2 :
                break;

                case 3 :
                break;
        }
    }//end of main
}
