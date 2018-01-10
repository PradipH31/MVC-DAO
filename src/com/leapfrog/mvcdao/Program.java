/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mvcdao;

import com.leapfrog.mvcdao.dao.AccountDAO;
import com.leapfrog.mvcdao.dao.impl.AccountDAOImpl;
import com.leapfrog.mvcdao.entity.Account;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP B&O
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        AccountDAO accountDAO = new AccountDAOImpl();

        while (true) {
            System.out.println("1. Add Account");
            System.out.println("2. Show Accounts");
            System.out.println("5. Exit");
            System.out.println("Enter your choice[1-5]:");
            switch (input.nextInt()) {
                case 1:
                    Account acc = new Account();
                    System.out.println("-------Add Account----------");
                    System.out.println("Enter Id:");
                    acc.setId(input.nextInt());
                    System.out.println("Enter Name:");
                    acc.setName(input.next());
                    System.out.println("Enter interest:");
                    acc.setInterest(input.nextDouble());
                    System.out.println("Enter minimum balance:");
                    acc.setMinimumBalance(input.nextInt());
                    accountDAO.insert(acc);
                    break;
                case 2:
                    System.out.println("-------------------------");
                    for (Account a : accountDAO.getAll()) {
                        System.out.println("Id: " + a.getId());
                        System.out.println("Name: " + a.getName());
                        System.out.println("Interest: " + a.getInterest());
                        System.out.println("Minimum Balance: " + a.getMinimumBalance());
                        System.out.println("----------------------");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
