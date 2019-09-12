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
    String instruct;
    String[] procOp;
    int[] vals = new int[2];
    FI fi = new FI();
    DI di = new DI();
    COBO cobo = new COBO();
    EI ei = new EI();
    WO wo = new WO();
    String[] AAA;
    static Sreg sreg = new Sreg();
    int res;
    
    public Cpu() {
        BancoReg ban = new BancoReg();
    }
    


    public void Ciclo(){
        while(!Memoria.getInst(FI.ci.getValor()).contains("HALT")){
            
            fullOp = fi.exec();
            procOp = di.exec(fullOp);// faz o parse das operacoes
            instruct = procOp[0];
            vals = cobo.exec(procOp);
            //System.out.println("O VALS É" + vals[0] + " " + vals[1]);
            res = ei.exec(instruct, vals);
            //System.out.println("E o RES: "+res);
            AAA = di.exec(fullOp);
            wo.exec(AAA, res);
        }
            /*if(res == 0){
                sreg.setZero(true);
            }else{
                sreg.setZero(false);
            }
            if(res < 0){
                sreg.setNeg(true);
            }else{
                sreg.setNeg(false);
            }
            
            
            if(procOp.length == 2){
                
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
                
                
            
        }
        System.out.println(bancoReg.get(1).getValor());
        resetCi();
        System.out.println(ci.getValor());
        */
        }
    
   
        
        
               

    public int getInt(String num){
        return  Integer.parseInt(num);//pra facilitar minha vida
    }
    
    public int getReg(int a){//óbvio
        return BancoReg.bancoReg.get(a).getValor();
    }
}
