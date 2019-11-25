/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radar.comp.classe;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.swing.table.AbstractTableModel;


   
    
public class ModelotabelaAviao extends AbstractTableModel {
    private final Stack<Aviao> bufferAvioes;
    private final List<String> titulo;
    
    public ModelotabelaAviao(Stack<Aviao> bufferAvioes) {
        this.bufferAvioes = bufferAvioes;
        titulo = new ArrayList<>();
        titulo.add("STATUS");
        titulo.add("ID");
        titulo.add("POSIÇÃO X");
        titulo.add("POSIÇÃO Y");
        titulo.add("ANGULO");
        titulo.add("VELOCIADDE");
        titulo.add("DIREÇÃO");
       
    }

    @Override
    public int getRowCount() {
        return bufferAvioes.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int num) {
        return this.titulo.get(num);
    }

        @Override
        public Object getValueAt(int linha, int coluna) {
            if (coluna == 0) {
                return bufferAvioes.get(linha).getStatusNome();
            } else if (coluna == 1) {
                return bufferAvioes.get(linha).getId();
            } else if (coluna == 2) {
                return bufferAvioes.get(linha).getX();
            } else if (coluna == 3) {
                return bufferAvioes.get(linha).getY();
            } else if (coluna == 4) {
                return bufferAvioes.get(linha).getAngulo();
            } else if (coluna == 5) {
                return bufferAvioes.get(linha).getVelocidade();
            } else {
                return bufferAvioes.get(linha).getDirecao();
            }
        }
        public void imprimeTabela(Stack<Aviao> tabela){
            for(int i=0;i<tabela.size();i++){
                System.out.println(tabela.elementAt(i).getId());
            }
        }
    @Override
         public boolean isCellEditable(int row, int col) {
         return true;
         }
        
    }

