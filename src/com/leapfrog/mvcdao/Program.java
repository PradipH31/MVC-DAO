/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mvcdao;

import com.leapfrog.mvcdao.controller.AccountController;
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
        AccountController ac = new AccountController(input, new AccountDAOImpl());

        while (true) {
            ac.process();
        }
    }
}
