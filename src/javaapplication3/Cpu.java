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
        ci.addReg();//self explanatory
        fullOp = Memoria.getInst(ri.getValor());
        procOp = ula.getOps(fullOp);// faz o parse das operacoes
        String[] operands = {procOp[1],procOp[2]};// pega os operandos
        // escrever codigo pra pegar da memoria, pegar constante ou registrador
        for(int i = 0;i<operands.length;i++){
            if(operands[i].contains("R")){
                operands[i] = operands[i].replace("R", "");
                vals[i] = bancoReg.get(getInt(operands[i])).getValor();
                //TODO, vai chamar uma funcao da ula pra guardar o valor de um reg pro otro
                
            }
            if(operands[i].contains("#")){
                operands[i] = operands[i].replace("#", "");
                vals[i] = getInt(operands[i]);
                //TODO tbm
            }
            if(operands[i].contains("0x")){
                operands[i] = operands[i].replace("0x", "");
                vals[i] = getInt(Memoria.getInst(getInt(operands[i])));
                //TODO tbm
            }
            //func prototype retornando um int
            if(procOp[1].contains("R")){
                bancoReg.get(getInt(operands[0])).setValor(/*return da func*/2);
            }
            if(procOp[1].contains("0x")){
                Memoria.setInst(getInt(operands[0]),"as"/*return da func*/);
            }
            
        }
        
        
               
    }
    public int getInt(String num){
        return  Integer.parseInt(num);//pra facilitar minha vida
    }
    public void addReg(Registrador a){//inutil
        bancoReg.add(a);
    }
    public int getReg(int a){//óbvio
        return bancoReg.get(a).getValor();
    }
}
