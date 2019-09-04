/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Administrador
 */
public class DI {
    Ula ula = new Ula();
    
    public String[] exec(String operacaoInteira){
        return ula.getOps(operacaoInteira);
    }
}
