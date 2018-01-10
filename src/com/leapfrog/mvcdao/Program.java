/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mvcdao;

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
        List<String> names = new ArrayList<>();
        names.add(0, "Raj");
        names.add("Pradip");
        names.remove(0);
        System.out.println(names.get(0));

    }

}
