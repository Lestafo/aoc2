/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesi.chiquito;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Lest
 */
public class MesiChiquito implements Runnable {

    Cache cache1;
    Cache cache2;
    Cache cache3;
    /**
     * @param args the command line arguments
     */
   /* public static void main(String[] args){
        runa();
        runa();
        runa();
        System.out.println("Status > " + cache1.stat + " Addr > " + cache1.addr);
        System.out.println("Status > " + cache2.stat + " Addr > " + cache2.addr);
        System.out.println("Status > " + cache3.stat + " Addr > " + cache3.addr);
    }*/
    
    
    public MesiChiquito(Cache cache1, Cache cache2, Cache cache3){
        this.cache1 = cache1;
        this.cache2 = cache2;
        this.cache3 = cache3;
    }

    

    public void altRead(Cache cache, int addr) {
        /**
         *
         * vai fazer as tigrada lá do read
         */
        ArrayList<Cache> arr = new ArrayList();
        arr.add(cache1);
        arr.add(cache2);
        arr.add(cache3);
        //char cachePrevSit = cache.stat; //situacao prévia da chave
        int mam = 0;
        cache.addr = addr;
        for(Cache r : arr){
            if(!r.equals(cache)){
                /*if(cache.addr != r.addr){
                    cache.stat = 'E';     
                    cache.cuia = Memorio.kukka[addr];
                    mam++;
                }*/
                if(cache.addr == r.addr && r.stat == 'E'){
                    cache.stat = 'S';
                    r.stat = 'S';
                    cache.cuia = Memorio.kukka[addr];
                    mam++;
                }else
                    if(r.stat == 'M' && r.addr == addr){
                        Memorio.kukka[addr] = r.cuia;
                        r.stat = 'S';
                        cache.stat = 'S';
                        cache.cuia = Memorio.kukka[addr];
                        mam++;
                    }else
                        if(r.stat == 'S' && r.addr == addr){
                            cache.stat = 'S';
                            cache.cuia = Memorio.kukka[addr];
                            mam++;
                        }
                
                
            }   
        }
        if(mam == 0){
            cache.stat = 'E';
            cache.cuia = Memorio.kukka[addr];
        }
    }
    public void altWrite(Cache cache, int addr, int valor){
        ArrayList<Cache> arr = new ArrayList();
        arr.add(cache1);
        arr.add(cache2);
        arr.add(cache3);
        cache.addr = addr;
       // char cachePrevSit = cache.stat; //situacao prévia da chave
        int mam = 0;
        for(Cache r : arr){
            if (!r.equals(cache)){
                if(r.stat == 'E' && r.addr == addr){
                    r.stat = 'S';
                    cache.stat = 'S';
                    cache.cuia = valor;
                    System.out.println("ee");
                    mam++;
                }
                if(r.stat == 'M' && r.addr == addr){
                    Memorio.kukka[addr] = r.cuia;
                    r.stat = 'S';
                    cache.cuia = valor;
                    cache.stat = 'S';
                    System.out.println("mm");mam++;
                }
                if(r.stat == 'S' && r.addr == addr){
                    r.stat = 'I';
                    cache.stat = 'E';
                    cache.cuia = valor;
                    Memorio.kukka[addr] = valor;
                    System.out.println("ss");mam++;
                }else
                if(cache.stat == 'E' && addr == cache.addr){
                    cache.stat = 'M';
                    System.out.println("Elsei");
                    cache.cuia = valor;mam++;
                }
                    
                System.out.println("mam = " + mam);
            }
        }
        if(mam == 0){
            cache.stat = 'E';
            cache.cuia = valor;
        }
    }

  @Override
    public void run() {
        Random r1 = new Random();
        Random r2 = new Random();
        Cache current = cache1;
        switch (r1.nextInt() %3){
            case 0:
                current = cache1;
            break;
            case 1:
                current = cache2;
            break;
            case 2:
                current = cache3;
            break;
        }
        int ran = r2.nextInt();
        int rin = r2.nextInt() %3;
        rin = Math.abs(rin);
        ran = Math.abs(ran);
        System.out.println(ran%3);
        System.out.println("RIN > " + rin);
        if(ran % 3 == 0){
            altRead(current, rin);
            
        }else if(ran % 3 == 1){
            altWrite(current, rin, ran);
        }return;
        
    }

   /*// @Override
    public static void runa() {
        Random r1 = new Random();
        Random r2 = new Random();
        Cache current = cache1;
        switch (r1.nextInt() %3){
            case 0:
                current = cache1;
            break;
            case 1:
                current = cache2;
            break;
            case 2:
                current = cache3;
            break;
        }
        int ran = r2.nextInt();
        int rin = r2.nextInt() %3;
        rin = Math.abs(rin);
        ran = Math.abs(ran);
        System.out.println(ran%3);
        System.out.println("RIN > " + rin);
        if(ran % 3 == 0){
            altRead(current, rin);
            
        }else if(ran % 3 == 1){
            altWrite(current, rin, ran);
        }return;
        
    }*/
}