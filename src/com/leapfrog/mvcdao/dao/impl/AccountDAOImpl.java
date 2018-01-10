/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mvcdao.dao.impl;

import com.leapfrog.mvcdao.dao.AccountDAO;
import com.leapfrog.mvcdao.entity.Account;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP B&O
 */
public class AccountDAOImpl implements AccountDAO {

    private List<Account> accounts = new ArrayList<>();

    @Override
    public boolean insert(Account account) {
        return accounts.add(account);
    }

    @Override
    public List<Account> getAll() {
        return accounts;
    }

}
