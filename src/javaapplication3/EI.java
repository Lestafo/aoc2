/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import static javaapplication3.Cpu.sreg;

/**
 *
 * @author Administrador
 */
public class EI {
    private Ula ula = new Ula();
    public int exec(String op, int[] vals){
        /*if(op.equals("SBRS")){
                    if(op.contains("1")){
                        if (sreg.isNeg())
                            FI.ci.addReg();
                    }
                        else if(op.contains("0")){
                            if (sreg.isZero())
                                FI.ci.addReg();

                        }
                            
            }*/
        System.out.println("tamanho do vals" + vals.length);
        if (vals.length == 1){
            return ula.solv(op, vals[0]);
        }else{
            return ula.solv(op, vals[0], vals[1]);
        }
        
    }
}
