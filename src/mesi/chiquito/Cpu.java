/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesi.chiquito;
import java.util.Random;
/**
 *
 * @author Lest
 */
public class Cpu implements Runnable {
    Cache cache = new Cache();
    

    public Cpu() {
    }

    
    
    
    @Override
    public void run() {
        Random r1 = new Random();
        if(r1.nextInt() %5 == 2){
            this.cache.cu++;
        }
    
    }
    public void read(){
        Random r2 = new Random();
        
    }
    
    
}
