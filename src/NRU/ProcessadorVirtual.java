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
public class ProcessadorVirtual {
    String instrucao = "01010101";
    Controlador controlador = new Controlador();
    MemoriaLogica ml = new MemoriaLogica();
    MemoriaFisica mf = new MemoriaFisica();
    
    
    
    public void enviarInstrucao(){
        controlador.alocarMemoriaLogica(instrucao);
    }        
    
}
