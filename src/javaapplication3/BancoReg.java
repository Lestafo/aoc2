/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class BancoReg {
    public final int NUMERO_REG = 4;
    public static ArrayList<Registrador> bancoReg = new ArrayList();
    
    public BancoReg() {
        for(int i = 0;i<NUMERO_REG;i++){
            bancoReg.add(new Registrador(i));
        }
    }
    /*public Registrador getReg(int i){
        
    }*/
}

   
    
        
