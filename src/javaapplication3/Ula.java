/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Lest
 * 
 * TODO: criar as functions de soma mov, etc...
 */
public class Ula {
    private String op;
    
    
    public String[] getOps(String a){ // só o parser por enquanto
        a = a.replace(",", "");
        String[] ops = new String[3];
        a = a.toUpperCase();
        ops = a.split(" ");
        return ops;
    }
    public int solv(String op,int val1,int val2){
        if(op.contains("ADD")){
            val1 = val1+val2;
        }
        if (op.contains("MOV")){
            val1 = val2;
        }
        if (op.contains("SUB")){
            val1 -= val2;
        }
        return val1;
    }
    
}
