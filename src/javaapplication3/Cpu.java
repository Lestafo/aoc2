/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.ArrayList;

/**
 *
 * @author Lest
 */
public class Cpu {
    Ula ula = new Ula();
    String fullOp = "ADD R0, R1";
    ArrayList<Registrador> bancoReg = new ArrayList();
    String[] procOp;
    
    public void ul(){
        procOp = ula.getOps(fullOp);
        for(String op:procOp){
            if(op.contains("R")){
                op = op.replace("R", "");
            }
            System.out.println(op);
        }
    }
    public void Ciclo(){
        procOp = ula.getOps(fullOp);
        String[] operands = {procOp[1],procOp[2]};
        // escrever codigo pra pegar da memoria, pegar constante ou registrador
        for(String op:operands){
            if(op.contains("R")){
                
            }
        }
               
    }
}
