/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radar.comp.classe;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author junior
 */
public class Tratamentos {
    public int verificaInteiro(String txt){
        int cod =-1;
        while(cod==-1){
            try{
                cod= Integer.parseInt(txt);
            }catch(Exception e){
            txt=JOptionPane.showInputDialog("ID Invalido informe o numero do Avião");
            }
        }
        return cod;
    }
    
}
