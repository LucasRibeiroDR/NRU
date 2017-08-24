/*
 * To change this license header, choose License Headers in Project Properties.
 * To cha;nge this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NRU;

/**
 *
 * @author Lucas
 */
public class MemoriaLogica {
    
    String [][] matrizML;
        
    MemoriaLogica(){
     matrizML =  new String[16][2];
    }
    void inicioM(){
        for(int i = 0; i < 16; i++){
            matrizML[i][0] = converteDecimalEmBinario(i);
            }
    }

    public String converteDecimalEmBinario(int i) {
        return Integer.toBinaryString(i);
    }
    
}    
