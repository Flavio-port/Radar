/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radar.comp.classe;

import java.util.Stack;
import javax.swing.table.TableModel;

/**
 *
 * @author junior
 */
public class Tabela {
     ModelotabelaAviao modelo;
     Stack<Aviao> tabela = new Stack<>();

    public ModelotabelaAviao getModelo() {
        return modelo;
    }

    public void setModelo(ModelotabelaAviao modelo) {
        this.modelo = modelo;
    }

    public Stack<Aviao> getTabela() {
        return tabela;
    }

    public void setTabela(Stack<Aviao> tabela) {
        this.tabela = tabela;
    }
    public ModelotabelaAviao salvaTabela(Stack<Aviao> tabela){
        modelo= new ModelotabelaAviao(tabela);
        return modelo;
    }
    public ModelotabelaAviao criaTabela(){      
        modelo= new ModelotabelaAviao(tabela);
        return modelo;
    }

    
}
