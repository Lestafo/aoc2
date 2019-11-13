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
        altWrite(cache1, 0, 10);
        //altWrite(cache1, 0, 0);
        //altRead(cache2, 0);
        //altWrite(cache2, 0, 9);
        System.out.println(cache1.cuia + " " + cache1.stat);
        
        
        //System.out.println("Mano eu to com muito");
    }
    
    public static void altRead(Cache cache, int addr){ /**
     * 
     * vai fazer as tigrada lá do read
     */
        ArrayList<Cache> arr = new ArrayList();
        arr.add(cache1);
        arr.add(cache2);
        arr.add(cache3);
        char cachePrevSit = cache.stat; //situacao prévia da chave
        int mam = 0;
        cache.addr = addr;
        for(Cache r : arr){
            if(!r.equals(cache)){
                if(cache.addr != r.addr){
                    cache.stat = 'E';     
                    cache.cuia = Memorio.kukka[addr];
                    mam++;
                }
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
    public static void altWrite(Cache cache, int addr, int valor){
        ArrayList<Cache> arr = new ArrayList();
        arr.add(cache1);
        arr.add(cache2);
        arr.add(cache3);
        cache.addr = addr;
        char cachePrevSit = cache.stat; //situacao prévia da chave
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
}
