/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mvcdao.controller;

import com.leapfrog.mvcdao.dao.AccountDAO;
import com.leapfrog.mvcdao.entity.Account;
import java.util.Scanner;

/**
 *
 * @author HP B&O
 */
public class AccountController {

    private Scanner input;
    private AccountDAO accountDAO;

    public AccountController(Scanner input, AccountDAO accountDAO) {
        this.input = input;
        this.accountDAO = accountDAO;
    }

    private void menu() {
        System.out.println("1. Add Account");
        System.out.println("2. Show Accounts");
        System.out.println("3. Search By Id");
        System.out.println("Delete by Id");
        System.out.println("5. Exit");
        System.out.println("Enter your choice[1-5]:");
    }

    private void addView() {
        Account acc = new Account();
        System.out.println("-------Add Account----------");
        acc.setId(accountDAO.insertId());
        System.out.println("Enter Name:");
        acc.setName(input.next());
        System.out.println("Enter interest:");
        acc.setInterest(input.nextDouble());
        System.out.println("Enter minimum balance:");
        acc.setMinimumBalance(input.nextInt());
        accountDAO.insert(acc);
    }

    public AccountController() {
    }

    private void showAllView() {
        System.out.println("-------------------------");
        for (Account a : accountDAO.getAll()) {
            System.out.println("Id: " + a.getId());
            System.out.println("Name: " + a.getName());
            System.out.println("Interest: " + a.getInterest());
            System.out.println("Minimum Balance: " + a.getMinimumBalance());
            System.out.println("----------------------");
        }
    }

    public void searchView() {
        System.out.println("Enter Id to search:");
        Account a = accountDAO.getById(input.nextInt());
        if (a != null) {
            System.out.println("Id: " + a.getId());
            System.out.println("Name: " + a.getName());
            System.out.println("Interest: " + a.getInterest());
            System.out.println("Minimum Balance: " + a.getMinimumBalance());
        } else {
            System.out.println("Sorry given Id not found.");
        }
    }

    public void deleteView() {
        System.out.println("Enter Id to delete:");
        Account a = accountDAO.getById(input.nextInt());
        if (a != null) {
            System.out.println("Id: " + a.getId());
            System.out.println("Name: " + a.getName());
            System.out.println("Interest: " + a.getInterest());
            System.out.println("Minimum Balance: " + a.getMinimumBalance());
            System.out.println("Do you really want to delete?[Y/N]");
            if(input.next().equalsIgnoreCase("y")){
                accountDAO.delete(a.getId());
            }
        } else {
            System.out.println("Sorry given Id not found.");
        }
    }

    public void process() {
        menu();
        switch (input.nextInt()) {
            case 1:
                addView();
                break;
            case 2:
                showAllView();
                break;
            case 3:
                searchView();
                break;
            case 4:
                deleteView();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }
}
