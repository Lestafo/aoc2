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
public class Memoria {
    private static ArrayList<String> instruções = new ArrayList();
    
    
    public static String getInst(int address){
        return instruções.get(address);
    }
    public static void setInst(int addr, String instr){
        instruções.set(addr, instr);
    }
}
