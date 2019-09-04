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
    String fullOp = "";
    ArrayList<Registrador> bancoReg = new ArrayList();
    String[] procOp;
    int[] vals = new int[2];
    FI fi = new FI();
    DI di = new DI();
    Sreg sreg = new Sreg();
    int res;
    
    public Cpu() {
        for(int i =0;i<NUMERO_REG;i++){
            bancoReg.add(new Registrador(i));
        }
    }
    
    public void FI(){
        
    }

    public void Ciclo(){
        //while(!Memoria.getInst(ci.getValor()).contains("HALT")){
            
            fullOp = fi.exec();
            procOp = di.exec(fullOp);// faz o parse das operacoes
            
            if(procOp.length == 3){
                String[] operands = {procOp[1],procOp[2]};// pega os operandos
            // escrever codigo pra pegar da memoria, pegar constante ou registrador
            for(int i = 0;i<operands.length;i++){
                if(operands[i].contains("R")){
                    operands[i] = operands[i].replace("R", "");
                    vals[i] = bancoReg.get(getInt(operands[i])).getValor();
                    
                
                }
                if(operands[i].contains("#")){
                    operands[i] = operands[i].replace("#", "");
                    vals[i] = getInt(operands[i]);
                    //TODO tbm
                }
                if(operands[i].contains("0X")){
                    operands[i] = operands[i].replace("0X", "");
                    vals[i] = getInt(Memoria.getInst(getInt(operands[i])));
                    //TODO tbm
                }
            }
            res = ula.solv(procOp[0],vals[0], vals[1]);
                if(res == 0){
                   sreg.setZero(true);
                }else{
                   sreg.setZero(false);
                }
                if(res < 0){
                    sreg.setNeg(true);
                }else{
                   sreg.setNeg(false);
                }
            
            if(procOp[1].contains("R")){
                bancoReg.get(getInt(operands[0])).setValor(res);
            }
            if(procOp[1].contains("0x")){
                Memoria.setInst(getInt(operands[0]),Integer.toString(res));
            }
            }if(procOp.length == 2){
                
                String operands = procOp[1];
                
                //int a = bancoReg.get(getInt(operands)).getValor();
                //System.out.println(a);
                if(procOp[0].equals("INC")){
                    operands = operands.replace("R", "");                  
                    bancoReg.get(getInt(operands)).addReg();
                    //System.out.println(bancoReg.get(getInt()));    
                        
                } else if(procOp[0].equals("JUMP")){
                    if(procOp[1].contains("0X")){
                        operands = operands.replace("0X", "");
                        System.out.println(operands);
                        ci.setValor(getInt(operands));
                        
                        
                    }
                }
                
                if(procOp[0].equals("SBRS")){
                    if(procOp[1].contains("1")){
                        if (sreg.isNeg())
                            ci.addReg();
                    }
                        else if(procOp[1].contains("0")){
                            if (sreg.isZero())
                                ci.addReg();

                        }
                            
            }
            
        }
        System.out.println(bancoReg.get(1).getValor());
        resetCi();
        System.out.println(ci.getValor());
        
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
