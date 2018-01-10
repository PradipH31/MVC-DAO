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

    @Override
    public int insertId() {
        int size = accounts.size();
        return (size == 0) ? 1 : accounts.get(size - 1).getId() + 1;
    }

    @Override
    public Account getById(int id) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                return account;
            }
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        for (Account a : accounts) {
            if (a.getId() == id) {
                accounts.remove(a);
                return true;
            }
        }
        return false;
    }

}
