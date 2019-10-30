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
    int cache;
    char stat;
    int add;

    public Cpu() {
    }

    public Cpu(int cache, int add) {
        this.cache = cache;
        this.add = add;
        this.stat = 'I';
    }
    
    
    @Override
    public void run() {
        Random r1 = new Random();
        if(r1.nextInt() %5 == 2){
            this.cache++;
            this.stat = 'M';
        }
    
    }
    
    
}
