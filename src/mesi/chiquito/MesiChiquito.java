/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesi.chiquito;

import java.util.ArrayList;

/**
 *
 * @author Lest
 */
public class MesiChiquito {

    static Cache cache1 = new Cache();
    static Cache cache2 = new Cache();
    static Cache cache3 = new Cache();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("Mano eu to com muito");
    }
    
    public static void alt(Cache cache){
        ArrayList<Cache> arr = new ArrayList();
        arr.add(cache1);
        arr.add(cache2);
        arr.add(cache3);
        
        for(Cache r : arr){
            if(cache.cuia == r.cuia && cache.addr == r.addr){
                cache.stat = 'S';
                r.stat = 'S';
            }
        }
    }
}
