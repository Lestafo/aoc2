/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Lest
 */
public class Ula {
    private String op;
    
    
    public String[] getOps(String a){
        a = a.replace(",", "");
        String[] ops = new String[3];
        a = a.toUpperCase();
        ops = a.split(" ");
        return ops;
    }
    
}
