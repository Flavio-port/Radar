/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radar.comp.classe;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author junior
 */
public class DataGrid {
    public Stack<Aviao> desativaAviao(int codAviao, Stack<Aviao> tabela){
        int encontrou=0;
        for(int i =0;i<tabela.size();i++){        
            if(tabela.get(i).getStatus().equals(1)){
                if(tabela.get(i).getId()==codAviao){
                encontrou= encontrou+1;                
                tabela.get(i).setStatus(0);
                tabela.get(i).setStatusNome("DESATIVADO");
                break;  
                }
                
            }
        }
        if(encontrou!=0){
           //  insere relatorio
            return tabela;
        }
        else{
            JOptionPane.showMessageDialog(null, "O avião com o ID: "+codAviao+" esta DESATIVADO ou não EXISTE");
            return tabela;
        }
            
    }
    public Stack<Aviao> ativaAviao(int codAviao,Stack<Aviao> tabela){
        int encontrou=0;
       
        for(int i =0;i<tabela.size();i++){        
            if(tabela.get(i).getStatus().equals(0)){
                if(tabela.get(i).getId()==codAviao){
                encontrou= encontrou+1;                
                tabela.get(i).setStatus(1);
                tabela.get(i).setStatusNome("ATIVADO");
                break;
                }
            }
        }
        if(encontrou!=0){
            
          //Adiciona no relatorio
        }
        else{
            JOptionPane.showMessageDialog(null, "O avião com o ID: "+codAviao+" esta ATIVADO ou não EXISTE");
        }
        
        return tabela;
       
    }
     public Stack<Aviao> inverteTabela( Stack<Aviao> tabela){
             
             Stack<Aviao> nova = new Stack<>();
             
             for(int i=0;i<tabela.size();i++){
                 nova.push(tabela.pop());
             }
             
             return nova;
         }
}
