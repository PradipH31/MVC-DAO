/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mvcdao;

import com.leapfrog.mvcdao.entity.Account;
import java.util.ArrayList;
import java.util.List;

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
        List<Account> accounts = new ArrayList<>();

        accounts.add(new Account(0, "Normal Savings", 2.5, 0));
        accounts.add(new Account(1, "Nari Bachat", 6, 1000));

        for (Account a : accounts) {
            System.out.println("Name: " + a.getName());
            System.out.println("Interest: " + a.getInterest());
            System.out.println("Minimum Balance: " + a.getMinimumBalance());
            System.out.println("---------------------------");
        }
    }

}
