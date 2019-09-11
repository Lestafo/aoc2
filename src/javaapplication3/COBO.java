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
public class COBO {
    public int[] exec(String[] a){
        int vals[] = new int[a.length];
        for(int i = 1;i<a.length;i++){
                if(a[i].contains("R")){
                    a[i] = a[i].replace("R", "");
                    vals[i] = bancoReg.get(getInt(a[i])).getValor();
                    
                }
                if(a[i].contains("#")){
                    a[i] = a[i].replace("#", "");
                    vals[i] = getInt(a[i]);
                    
                }
                if(a[i].contains("0X")){
                    a[i] = a[i].replace("0X", "");
                    vals[i] = getInt(Memoria.getInst(getInt(a[i])));
                    
                }
            }
        return vals;
    }
    public int getInt(String num){
        return  Integer.parseInt(num);//pra facilitar minha vida
    }
}
