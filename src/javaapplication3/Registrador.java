/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Lest
 */
public class Registrador {//obviamente um registrador
    int valor;

    public Registrador() {
        this.valor=0;
    }
    
    public Registrador(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    public void addReg(){
        this.valor++;
    }
    
}
