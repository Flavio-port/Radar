/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radar.comp.frames;

import com.sun.java.swing.plaf.windows.resources.windows;
import java.io.IOException;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.TableModel;
import radar.comp.classe.Aviao;
import radar.comp.classe.DataGrid;
import radar.comp.classe.ModelotabelaAviao;
import radar.comp.classe.Tabela;
import radar.comp.classe.Transformacao;
import radar.comp.classe.Tratamentos;

/**
 *
 * @author lab102a
 */
public class TelaRadar extends javax.swing.JFrame{
   
     Tabela tabela = new Tabela();
     Transformacao tranforma = new Transformacao();
     int idAviao =0;
   
    /**
     * Creates new form Telaradar
     */
    public TelaRadar() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        jTabelaAviao.setModel(tabela.criaTabela());
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtAviaoAnguloX = new javax.swing.JTextField();
        txtAviaoRaio = new javax.swing.JTextField();
        txtAviaoVelocidade = new javax.swing.JTextField();
        txtAviaoAnguloY = new javax.swing.JTextField();
        txtAviaoAngulo = new javax.swing.JTextField();
        txtAviaoDirecao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAngulo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnInserirDados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jlbRadarGif = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTransladarX = new javax.swing.JTextField();
        txtTransladarY = new javax.swing.JTextField();
        txtEscalonarY = new javax.swing.JTextField();
        txtEslonarX = new javax.swing.JTextField();
        btnTransladar = new javax.swing.JButton();
        btnEscalonar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaRelatorio = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtRotacionarAngulo = new javax.swing.JTextField();
        txtRotacionarX = new javax.swing.JTextField();
        txtRotacionarY = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnRotacionar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtDistAero = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        btnDistAero = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        btnDistAvioes = new javax.swing.JButton();
        txtDistAvioes = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtTempoColisao = new javax.swing.JTextField();
        btnRotaColisao = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTabelaAviao = new javax.swing.JTable();
        btnDesativar = new javax.swing.JButton();
        btnAtivar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(540, 590, 600, 370);

        txtAviaoAnguloX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAviaoAnguloXActionPerformed(evt);
            }
        });
        getContentPane().add(txtAviaoAnguloX);
        txtAviaoAnguloX.setBounds(110, 20, 60, 30);

        txtAviaoRaio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAviaoRaioActionPerformed(evt);
            }
        });
        getContentPane().add(txtAviaoRaio);
        txtAviaoRaio.setBounds(110, 60, 60, 30);
        getContentPane().add(txtAviaoVelocidade);
        txtAviaoVelocidade.setBounds(110, 100, 60, 30);
        getContentPane().add(txtAviaoAnguloY);
        txtAviaoAnguloY.setBounds(360, 20, 60, 30);
        getContentPane().add(txtAviaoAngulo);
        txtAviaoAngulo.setBounds(360, 60, 60, 30);
        getContentPane().add(txtAviaoDirecao);
        txtAviaoDirecao.setBounds(360, 100, 60, 30);

        jLabel3.setText("X:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 30, 20, 14);

        jLabel4.setText("Raio:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 70, 40, 14);

        jLabel5.setText("Velocidade:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 100, 80, 30);

        jLabel6.setText("Y:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(320, 30, 10, 14);

        txtAngulo.setText("Ângulo:");
        getContentPane().add(txtAngulo);
        txtAngulo.setBounds(290, 60, 70, 30);

        jLabel8.setText("Direção:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(290, 100, 50, 30);

        btnInserirDados.setText("Inserir");
        btnInserirDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInserirDadosMouseClicked(evt);
            }
        });
        btnInserirDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirDadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnInserirDados);
        btnInserirDados.setBounds(190, 130, 90, 23);

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Novo Avião", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setFocusable(false);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 0, 460, 160);

        jlbRadarGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/radar/comp/imagens/radar.gif"))); // NOI18N
        jlbRadarGif.setText("jLabel7");
        getContentPane().add(jlbRadarGif);
        jlbRadarGif.setBounds(510, 0, 640, 560);
        jlbRadarGif.getAccessibleContext().setAccessibleName("");

        jLabel2.setText("X:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 220, 10, 14);

        jLabel7.setText("Y:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 220, 10, 14);

        jLabel9.setText("Y:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(360, 220, 10, 14);

        jLabel10.setText("X:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(270, 220, 10, 14);

        txtTransladarX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransladarXActionPerformed(evt);
            }
        });
        getContentPane().add(txtTransladarX);
        txtTransladarX.setBounds(80, 210, 35, 30);

        txtTransladarY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransladarYActionPerformed(evt);
            }
        });
        getContentPane().add(txtTransladarY);
        txtTransladarY.setBounds(160, 210, 35, 30);

        txtEscalonarY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEscalonarYActionPerformed(evt);
            }
        });
        getContentPane().add(txtEscalonarY);
        txtEscalonarY.setBounds(390, 210, 35, 30);
        getContentPane().add(txtEslonarX);
        txtEslonarX.setBounds(300, 210, 35, 30);

        btnTransladar.setText("Transladar");
        btnTransladar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransladarActionPerformed(evt);
            }
        });
        getContentPane().add(btnTransladar);
        btnTransladar.setBounds(80, 260, 100, 23);

        btnEscalonar.setText("Escalonar");
        btnEscalonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscalonarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEscalonar);
        btnEscalonar.setBounds(310, 250, 100, 23);

        jLabel11.setToolTipText("");
        jLabel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Transladar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jLabel11.setFocusable(false);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 190, 180, 100);

        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Escalonar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(240, 190, 220, 100);

        jLabel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Console", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(520, 560, 640, 430);

        jLabel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DataGrid", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(1170, 0, 650, 540);

        txtAreaRelatorio.setColumns(20);
        txtAreaRelatorio.setRows(5);
        jScrollPane3.setViewportView(txtAreaRelatorio);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(1190, 560, 610, 420);

        jLabel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Relatório", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(1170, 540, 650, 460);

        jLabel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Rotacionar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(40, 300, 420, 140);
        getContentPane().add(txtRotacionarAngulo);
        txtRotacionarAngulo.setBounds(150, 320, 35, 30);
        getContentPane().add(txtRotacionarX);
        txtRotacionarX.setBounds(280, 330, 35, 30);
        getContentPane().add(txtRotacionarY);
        txtRotacionarY.setBounds(390, 330, 35, 30);

        jLabel17.setText("X:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(250, 340, 10, 14);

        jLabel18.setText("Y:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(360, 340, 10, 14);

        jLabel19.setText("Angulo:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(110, 320, 80, 30);

        jLabel20.setText("Centro de Rotação");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(310, 290, 170, 50);

        btnRotacionar.setText("Rotacionar");
        btnRotacionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotacionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRotacionar);
        btnRotacionar.setBounds(160, 390, 150, 30);

        jLabel21.setText("º");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(190, 320, 10, 14);

        jLabel22.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Rota de colisão", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        getContentPane().add(jLabel22);
        jLabel22.setBounds(20, 870, 460, 120);

        jLabel23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Distancia Aeroporto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        getContentPane().add(jLabel23);
        jLabel23.setBounds(20, 530, 460, 150);

        jLabel24.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Distancia Avioes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        getContentPane().add(jLabel24);
        jLabel24.setBounds(20, 700, 460, 160);

        jLabel25.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "FUNÇÕES DE RASTREAMENTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        getContentPane().add(jLabel25);
        jLabel25.setBounds(20, 470, 460, 520);

        jLabel26.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "FUNÇÕES DE TRANSFORMAÇÃO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        getContentPane().add(jLabel26);
        jLabel26.setBounds(20, 170, 460, 290);
        getContentPane().add(txtDistAero);
        txtDistAero.setBounds(160, 560, 100, 30);

        jLabel27.setText("DISTANCIA MINIMA:");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(40, 560, 120, 40);

        btnDistAero.setText("PROCESSAR DISTÂNCIA");
        getContentPane().add(btnDistAero);
        btnDistAero.setBounds(110, 620, 170, 30);

        jLabel28.setText("DISTANCIA MÍNIMA:");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(60, 740, 140, 30);

        btnDistAvioes.setText("PROCESSAR DISTÂNCIA");
        getContentPane().add(btnDistAvioes);
        btnDistAvioes.setBounds(100, 790, 170, 30);

        txtDistAvioes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDistAvioes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistAvioesActionPerformed(evt);
            }
        });
        getContentPane().add(txtDistAvioes);
        txtDistAvioes.setBounds(190, 740, 100, 30);

        jLabel29.setText("TEMPO MÍNIMO:");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(130, 890, 130, 40);
        getContentPane().add(txtTempoColisao);
        txtTempoColisao.setBounds(230, 890, 100, 30);

        btnRotaColisao.setText("PROCESSAR ROTA DE COLISÃO");
        getContentPane().add(btnRotaColisao);
        btnRotaColisao.setBounds(100, 940, 220, 30);

        jTabelaAviao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Título 5", "Título 6", "Título 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTabelaAviao);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(1180, 20, 630, 350);

        btnDesativar.setText("DESATIVAR AVIÃO");
        btnDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesativarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDesativar);
        btnDesativar.setBounds(1610, 420, 150, 30);

        btnAtivar.setText("ATIVAR AVIÃO");
        btnAtivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtivarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtivar);
        btnAtivar.setBounds(1250, 420, 160, 30);

        setSize(new java.awt.Dimension(1835, 1043));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAviaoAnguloXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAviaoAnguloXActionPerformed
      
    }//GEN-LAST:event_txtAviaoAnguloXActionPerformed

    private void txtAviaoRaioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAviaoRaioActionPerformed
  
    }//GEN-LAST:event_txtAviaoRaioActionPerformed

    private void btnInserirDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirDadosActionPerformed
        
         Aviao aviao= new Aviao();
         Aviao aviao2= new Aviao();      
         // float raio, float angulo, float velocidade, float direcao, Stack<Aviao> tabela
         /*aviao.novoAviao(aviao,Float.parseFloat(txtAviaoAnguloX.getText()), Float.parseFloat(txtAviaoAnguloY.getText()), Float.parseFloat(txtAviaoRaio.getText()), 
          Float.parseFloat(txtAviaoAnguloX.getText()), Float.parseFloat(txtAviaoAnguloX.getText()), tabela);*/ // Pega dos campos
         tabela.setTabela(aviao.novoAviao(aviao, 3, 2, 2, 2, 2,2,tabela.getTabela(),1));        
         tabela.setTabela(aviao2.novoAviao(aviao2, 1, 1, 1, 1,1,1, tabela.getTabela(),2));
         jTabelaAviao.setModel(tabela.salvaTabela(tabela.getTabela()));
        
         
         
    }//GEN-LAST:event_btnInserirDadosActionPerformed

    private void btnInserirDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInserirDadosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInserirDadosMouseClicked

    private void txtTransladarXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransladarXActionPerformed
       
    }//GEN-LAST:event_txtTransladarXActionPerformed

    private void txtTransladarYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransladarYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransladarYActionPerformed

    private void txtDistAvioesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistAvioesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistAvioesActionPerformed

    private void btnTransladarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransladarActionPerformed
 
        tabela.setTabela(tranforma.translandarAviao(1,1,tabela.getTabela()));
        jTabelaAviao.setModel(tabela.salvaTabela(tabela.getTabela()));     
        // Desenhar no radar
       
    }//GEN-LAST:event_btnTransladarActionPerformed

    private void btnEscalonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscalonarActionPerformed
       
    tabela.setTabela(tranforma.escalonarAviao(100,50,tabela.getTabela()));
    jTabelaAviao.setModel(tabela.salvaTabela(tabela.getTabela()));
        // Desenhar nova tela

    }//GEN-LAST:event_btnEscalonarActionPerformed

    private void btnRotacionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotacionarActionPerformed
      
        tabela.setTabela(tranforma.rotacionarAviao(0,0,45,tabela.getTabela()));
        jTabelaAviao.setModel(tabela.salvaTabela(tabela.getTabela()));
        // Desenhar nova tela
     
    }//GEN-LAST:event_btnRotacionarActionPerformed

    private void btnDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesativarActionPerformed
        String idAviaoDesativar;
        idAviaoDesativar=JOptionPane.showInputDialog("Informe o Id do Avião que deseja Desativar");         
        Tratamentos trat = new Tratamentos();
        int codAviao=trat.verificaInteiro(idAviaoDesativar);
        DataGrid dataGrid = new DataGrid();
      //  tabela=dataGrid.desativaAviao(codAviao, tabela);
       // modelo= new ModelotabelaAviao(tabela);
       // jTabelaAviao.setModel(modelo);
          
    }//GEN-LAST:event_btnDesativarActionPerformed

    private void btnAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtivarActionPerformed
         String idAviaoAtivar;
         idAviaoAtivar=JOptionPane.showInputDialog("Informe o Id do Avião que deseja Desativar");         
         Tratamentos trat = new Tratamentos();
         int codAviao=trat.verificaInteiro(idAviaoAtivar);
         DataGrid dataGrid = new DataGrid();
       //  tabela=dataGrid.ativaAviao(codAviao, tabela);
       //  modelo= new ModelotabelaAviao(tabela);
        // jTabelaAviao.setModel(modelo);
    }//GEN-LAST:event_btnAtivarActionPerformed

    private void txtEscalonarYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEscalonarYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEscalonarYActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaRadar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRadar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRadar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRadar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRadar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtivar;
    private javax.swing.JButton btnDesativar;
    private javax.swing.JButton btnDistAero;
    private javax.swing.JButton btnDistAvioes;
    private javax.swing.JButton btnEscalonar;
    private javax.swing.JButton btnInserirDados;
    private javax.swing.JButton btnRotaColisao;
    private javax.swing.JButton btnRotacionar;
    private javax.swing.JButton btnTransladar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTabelaAviao;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlbRadarGif;
    private javax.swing.JLabel txtAngulo;
    private javax.swing.JTextArea txtAreaRelatorio;
    private javax.swing.JTextField txtAviaoAngulo;
    private javax.swing.JTextField txtAviaoAnguloX;
    private javax.swing.JTextField txtAviaoAnguloY;
    private javax.swing.JTextField txtAviaoDirecao;
    private javax.swing.JTextField txtAviaoRaio;
    private javax.swing.JTextField txtAviaoVelocidade;
    private javax.swing.JTextField txtDistAero;
    private javax.swing.JTextField txtDistAvioes;
    private javax.swing.JTextField txtEscalonarY;
    private javax.swing.JTextField txtEslonarX;
    private javax.swing.JTextField txtRotacionarAngulo;
    private javax.swing.JTextField txtRotacionarX;
    private javax.swing.JTextField txtRotacionarY;
    private javax.swing.JTextField txtTempoColisao;
    private javax.swing.JTextField txtTransladarX;
    private javax.swing.JTextField txtTransladarY;
    // End of variables declaration//GEN-END:variables
}
