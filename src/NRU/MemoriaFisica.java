/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NRU;

/**
 *
 * @author Lucas
 */
public class MemoriaFisica {
    String [][] matrizMF;
    
    MemoriaFisica(){
     matrizMF =  new String[8][2];
    }
    void inicioM(){
        for(int i = 0; i < 8; i++){
            matrizMF[i][0] = converteDecimalEmBinario(i);
            }
    }
    
    public String converteDecimalEmBinario(int i) {
        return Integer.toBinaryString(i);
    }
}
