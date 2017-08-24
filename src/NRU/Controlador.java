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
public class Controlador {
    MemoriaLogica ml = new MemoriaLogica();
    MemoriaFisica mf = new MemoriaFisica();
    int aux;
    
    int verificarEspacoML(){
        for(int i=0; i<16;i++){
            if(ml.matrizML[i][1]==null){
                return i;
            } 
        }
        return -1;
    }
    
    int verificarEspacoMF(){
        for(int i=0; i<8;i++){
            if(mf.matrizMF[i][1]==null){
                return i;
            } 
        }
        return -1;
    }
    
    void alocarMemoriaLogica(String INSTRUCAO){
       if(verificarEspacoML()==-1){
           System.out.println("Memoria Logica CHEIA!");
       }else{
           ml.matrizML[verificarEspacoML()][1] = INSTRUCAO;
       } 
    }
    
    void alocarMemoriaFisica(1000/*esse 1000 é o endereço passado no metodo perguntar*/){
        if(verificarEspacoMF()==-1){
           System.out.println("Memoria Fisica CHEIA!");
       }else{
           mf.matrizMF[verificarEspacoMF()][1] = ml.matrizML[verificarEspacoM()][1];
       } 
    }
    
    void perguntar(){
        System.out.println("Qual o endereço da instrução que deseja alocar?");
        //vem um Scanner
        //passar essa instrução como parametro para chamar o metodo que aloca a memoria fisica; 
    }
    
}
