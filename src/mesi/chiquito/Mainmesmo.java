/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesi.chiquito;

/**
 *
 * @author Lest
 */
public class Mainmesmo {
    static Cache cache1 = new Cache();
    static Cache cache2 = new Cache();
    static Cache cache3 = new Cache();
    static MesiChiquito chico = new MesiChiquito(cache1, cache2, cache3);
    static MesiChiquito ricoChico = new MesiChiquito(cache1, cache2, cache3);
    static Thread t1 = new Thread(chico);
    static Thread t2 = new Thread(ricoChico);
    
    public static void main(String[] args) {
        t1.run();
        t2.run();
        System.out.println("Status > " + cache1.stat + " Addr > " + cache1.addr);
        System.out.println("Status > " + cache2.stat + " Addr > " + cache2.addr);
        System.out.println("Status > " + cache3.stat + " Addr > " + cache3.addr);
    }
}
