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
    final int NUMERO_REG = 4;
    Ula ula = new Ula();
    String fullOp = "ADD R2, #6";
    ArrayList<Registrador> bancoReg = new ArrayList();
    String[] procOp;
    int[] vals = new int[2];
    Registrador ci = new Registrador(1);
    Registrador ri = new Registrador(0);

    public Cpu() {
        for(int i =0;i<NUMERO_REG;i++){
            bancoReg.add(new Registrador(i));
        }
    }
    
//    public void ul(){
//        procOp = ula.getOps(fullOp);
//        for(String op:procOp){
//            if(op.contains("R")){
//                op = op.replace("R", "");
//            }
//            System.out.println(op);
//        }
//    }
    public void Ciclo(){
        while(!Memoria.getInst(ri.getValor()).contains("HALT"))
        ri.setValor(ci.getValor());
        ci.addReg();
        fullOp = Memoria.getInst(ri.getValor());
        procOp = ula.getOps(fullOp);
        String[] operands = {procOp[1],procOp[2]};
        // escrever codigo pra pegar da memoria, pegar constante ou registrador
        for(int i = 0;i<operands.length;i++){
            if(operands[i].contains("R")){
                operands[i] = operands[i].replace("R", "");
                vals[i] = bancoReg.get(getInt(operands[i])).getValor();
            }
            if(operands[i].contains("#")){
                operands[i] = operands[i].replace("#", "");
                vals[i] = getInt(operands[i]);
            }
        }
        
        
               
    }
    public int getInt(String num){
        return  Integer.parseInt(num);
    }
    public void addReg(Registrador a){
        bancoReg.add(a);
    }
    public int getReg(int a){
        return bancoReg.get(a).getValor();
    }
}
