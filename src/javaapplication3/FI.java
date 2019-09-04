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
public class FI {
    Registrador ci = new Registrador(0);
    Registrador ri = new Registrador(0);

    public Registrador getCi() {
        return ci;
    }

    public void setCi(Registrador ci) {
        this.ci = ci;
    }

    public Registrador getRi() {
        return ri;
    }

    public void setRi(Registrador ri) {
        this.ri = ri;
    }
    public void resetCi(){
        ci.setValor(0);
        ri.setValor(0);
    }
    public String exec(){
        ri.setValor(ci.getValor());
        ci.addReg();
        return Memoria.getInst(ri.getValor());
        
    }
}
