/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mvcdao.dao;

import com.leapfrog.mvcdao.entity.Account;
import java.util.List;

/**
 *
 * @author HP B&O
 */
public interface AccountDAO {

    boolean insert(Account account);
    List<Account> getAll();

}
