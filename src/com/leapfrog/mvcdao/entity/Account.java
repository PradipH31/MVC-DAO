/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mvcdao.entity;

/**
 *
 * @author HP B&O
 */
public class Account {

    private int id;
    private String name;
    private double interest;
    private int minimumBalance;

    /**
     * Default constructor
     */
    public Account() {
    }

    /**
     *
     * @param id
     * @param name
     * @param interest
     * @param minimumBalance
     */
    public Account(int id, String name, double interest, int minimumBalance) {
        this.id = id;
        this.name = name;
        this.interest = interest;
        this.minimumBalance = minimumBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public int getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(int minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

}
