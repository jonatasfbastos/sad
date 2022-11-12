/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sad.etapacurso.view;

import br.com.ifba.sad.etapacurso.model.EtapaCurso;
import br.com.ifba.infrastructure.service.IFacade;
import java.awt.HeadlessException;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jonas Dias
 */
@Component
public class TelaExibirEtapaCurso extends javax.swing.JFrame {
    
    @Autowired
    private IFacade facade;
    @Autowired
    private TelaEdicaoEtapaCurso telaEdicao;
    @Autowired
    private TelaCadastroEtapaCurso telaCadastro;
    private List<EtapaCurso> etapas;
     
     public TelaExibirEtapaCurso() {
          initComponents();
          super.setLocationRelativeTo(null);
     }

     // Método que realiza a atualização dos dados na tabela.
     @PostConstruct
     public void atualizaTabela() {
          try {
               this.etapas = this.facade.getAllEtapaCurso();
          } catch (Exception error) {
               JOptionPane.showMessageDialog(null, error,
                       "Erro ao buscar etapas!", JOptionPane.ERROR_MESSAGE);
               return;
          }

          DefaultTableModel tabelaDados = (DefaultTableModel) tblDados.getModel();
          tabelaDados.setNumRows(0);

          for (EtapaCurso etapa: etapas) {
               tabelaDados.addRow(new Object[]{etapa.getId(),etapa.getNome(), 
                   etapa.getPeriodo(), etapa.getCargaHoraria(), etapa.isConcluinte()});
          }

     }

     /**
      * This method is called from within the constructor to initialize the
      * form. WARNING: Do NOT modify this code. The content of this method is
      * always regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        srcScrollDados = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();
        pnlLinha = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlContainer.setBackground(new java.awt.Color(220, 224, 230));
        pnlContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 76, 126), 3));
        pnlContainer.setPreferredSize(new java.awt.Dimension(428, 455));

        tblDados.setBackground(new java.awt.Color(217, 217, 217));
        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Período", "Carga Horária", "Concluinte"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        srcScrollDados.setViewportView(tblDados);

        pnlLinha.setBackground(new java.awt.Color(43, 76, 126));

        javax.swing.GroupLayout pnlLinhaLayout = new javax.swing.GroupLayout(pnlLinha);
        pnlLinha.setLayout(pnlLinhaLayout);
        pnlLinhaLayout.setHorizontalGroup(
            pnlLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlLinhaLayout.setVerticalGroup(
            pnlLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        btnEditar.setBackground(new java.awt.Color(217, 217, 217));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnDeletar.setBackground(new java.awt.Color(217, 217, 217));
        btnDeletar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeletar.setText("DELETAR");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        txtBuscar.setBackground(new java.awt.Color(217, 217, 217));
        txtBuscar.setText("Buscar Etapa");
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(217, 217, 217));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLinha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addComponent(srcScrollDados, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContainerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(srcScrollDados, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlLinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
          // Obtém a linha selecionada da tabela.
          int linhaSelecionada = tblDados.getSelectedRow();

          // Se for igual a -1, significa que não há linha selecionada.
          if (linhaSelecionada == - 1) {
               JOptionPane.showMessageDialog(null, "Não há linha selecionada, tente novamente.",
                       "Erro ao selecionar linha!", JOptionPane.ERROR_MESSAGE);
               return;
          }

          // Obtém o id na linha selecionada e coluna zero.
          Long id = (Long) tblDados.getValueAt(linhaSelecionada, 0);

          /*
               Tenta realizar a busca pelo id, se não ocorrer erros, instancia a tela de edição e oculta a atual.
               Caso ocorra erro, mostra um JOptionPane.
           */
          try {
               EtapaCurso etapa = this.facade.findByIdEtapaCurso(id);
               this.telaEdicao.setEtapa(etapa);
               this.setVisible(false);
               this.telaEdicao.setVisible(true);
          } catch (Exception error) {
               JOptionPane.showMessageDialog(null, error,
                       "Erro ao tentar editar!", JOptionPane.ERROR_MESSAGE);
          }

     }//GEN-LAST:event_btnEditarActionPerformed

     private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
          // Obtém a linha selecionada da tabela.
          int linhaSelecionada = tblDados.getSelectedRow();

          // Se for igual a -1, significa que não há linha selecionada.
          if (linhaSelecionada == - 1) {
               JOptionPane.showMessageDialog(null, "Não há linha selecionada, tente novamente.",
                       "Erro ao selecionar linha!", JOptionPane.ERROR_MESSAGE);
               return;
          }

          // Obtém o id na linha selecionada e coluna zero.
          Long id = (Long) tblDados.getValueAt(linhaSelecionada, 0);

          /*
               Tenta realizar a busca pelo id, se não ocorrer erros, deleta a etapa e atualiza a tabela.
               Caso ocorra erro, mostra um JOptionPane.
           */
          try {
               EtapaCurso etapa = this.facade.findByIdEtapaCurso(id);
               
               // Obtém a confirmação do usuário se será deletado a etapa do banco de dados.
               if(JOptionPane.showConfirmDialog(null, "Deseja realmente deletar " +
                       etapa.getNome() + "?", "Deletar Dados", JOptionPane.DEFAULT_OPTION) == 0) {
                    this.facade.deleteEtapaCurso(etapa);
                    this.atualizaTabela();
               }
          } catch (HeadlessException error) {
               JOptionPane.showMessageDialog(null, error,
                       "Erro ao tentar deletar!", JOptionPane.ERROR_MESSAGE);
          }
     }//GEN-LAST:event_btnDeletarActionPerformed

     private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
          this.setVisible(false);
          this.telaCadastro.setVisible(true);
     }//GEN-LAST:event_btnCadastrarActionPerformed

     private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
          // Obtém a string busca convertendo para letras minúsculas.
          String busca = txtBuscar.getText().toLowerCase();

          /* 
               Se a lista de etapas for nula ou vazia, faz a busca novamente.
               Se ocorrer erros, mostra o JOptionPane.
          */
          if (this.etapas == null || this.etapas.isEmpty()) {
               try {
                    this.etapas = this.facade.findByNomeEtapaCurso(busca);
               } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, error,
                            "Erro ao buscar etapas!", JOptionPane.ERROR_MESSAGE);
               }
          }

          // Obtém o modelo atual da tabela.
          DefaultTableModel tabelaDados = (DefaultTableModel) tblDados.getModel();
          tabelaDados.setNumRows(0);

          // Adiciona à tabela todos as etapas em que o nome contenha a busca informada.
          for (EtapaCurso etapa: etapas) {
               if (etapa.getNome().toLowerCase().contains(busca)) {
                   tabelaDados.addRow(new Object[]{etapa.getId(),etapa.getNome(), 
                   etapa.getPeriodo(), etapa.getCargaHoraria(), etapa.isConcluinte()});
               }
          }
     }//GEN-LAST:event_txtBuscarKeyPressed

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
               java.util.logging.Logger.getLogger(TelaExibirEtapaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(TelaExibirEtapaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(TelaExibirEtapaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(TelaExibirEtapaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>
          //</editor-fold>
          //</editor-fold>
          //</editor-fold>
    
          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new TelaExibirEtapaCurso().setVisible(true);
               }
          });
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLinha;
    private javax.swing.JScrollPane srcScrollDados;
    private javax.swing.JTable tblDados;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
