/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import static javaapplication3.BancoReg.bancoReg;

/**
 *
 * @author Administrador
 */
public class WO {
    public boolean exec(String[] procop, int res){
        System.out.println("AAA"+res);
        System.out.println("BBB"+procop[1]);
        
        if(procop[1].contains("R")){
            procop[1] = procop[1].replace("R", "");
            
            bancoReg.get(getInt(procop[1])).setValor(res);
            return true;
        }     
        if(procop[1].contains("0X")){
            procop[1] = procop[1].replace("0X", "");
            Memoria.setInst(getInt(procop[1]),String.valueOf(res));
            return true;
        }
        return false;
    }
    public int getInt(String num){
        return  Integer.parseInt(num);//pra facilitar minha vida
    }
}
