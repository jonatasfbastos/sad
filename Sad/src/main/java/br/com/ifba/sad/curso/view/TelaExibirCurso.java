/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.sad.curso.view;

import br.com.ifba.sad.infrastructure.service.IFacade;
import br.com.ifba.sad.curso.model.Curso;
import java.awt.HeadlessException;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author KowT
 */
@Component
public class TelaExibirCurso extends javax.swing.JFrame {
    @Autowired
    private IFacade facade;
    @Autowired
    private TelaEdicaoCurso telaEdicao;
    @Autowired
    private TelaCadastroCurso telaCadastro;
    private List<Curso> cursos;

    /**
     * Creates new form TelaExibirCurso
     */
    public TelaExibirCurso() {
        initComponents();
        super.setLocationRelativeTo(null);
    }
    
    @PostConstruct
    public void atualizaTabela() {
          try {
               this.cursos = this.facade.getAllCurso();
          } catch (Exception error) {
               JOptionPane.showMessageDialog(null, error,
                       "Erro ao buscar perfils!", JOptionPane.ERROR_MESSAGE);
               return;
          }

          DefaultTableModel tabelaDados = (DefaultTableModel) tblDados.getModel();
          tabelaDados.setNumRows(0);

          for (Curso curso: cursos) {
               tabelaDados.addRow(new Object[]{curso.getId(),
                    curso.getNome(), curso.getSigla(), curso.getCodigoCurso()});
          }
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();
        pnlDesignLinha = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlContainer.setBackground(new java.awt.Color(220, 224, 230));
        pnlContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 76, 126), 3));

        jScrollPane1.setBackground(new java.awt.Color(217, 217, 217));

        tblDados.setBackground(new java.awt.Color(217, 217, 217));
        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Sigla", "Código"
            }
        ));
        jScrollPane1.setViewportView(tblDados);

        pnlDesignLinha.setBackground(new java.awt.Color(43, 76, 126));

        javax.swing.GroupLayout pnlDesignLinhaLayout = new javax.swing.GroupLayout(pnlDesignLinha);
        pnlDesignLinha.setLayout(pnlDesignLinhaLayout);
        pnlDesignLinhaLayout.setHorizontalGroup(
            pnlDesignLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlDesignLinhaLayout.setVerticalGroup(
            pnlDesignLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        btnEditar.setBackground(new java.awt.Color(217, 217, 217));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
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

        btnDeletar.setBackground(new java.awt.Color(217, 217, 217));
        btnDeletar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeletar.setText("DELETAR");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        txtBuscar.setBackground(new java.awt.Color(217, 217, 217));
        txtBuscar.setText("Buscar Curso");
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDesignLinha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addGap(35, 35, 35)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlDesignLinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                    .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.telaCadastro.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
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
               Tenta realizar a busca pelo id, se não ocorrer erros, instancia a tela de ediçõa e oculta a atual.
               Caso ocorra erro, mostra um JOptionPane.
           */
          try {
               Curso curso = this.facade.findByIdCurso(id);
               this.telaEdicao.setCurso(curso);
               this.setVisible(false);
               this.telaEdicao.setVisible(true);
          } catch (Exception error) {
               JOptionPane.showMessageDialog(null, error,
                       "Erro ao tentar editar!", JOptionPane.ERROR_MESSAGE);
          }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
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
               Tenta realizar a busca pelo id, se não ocorrer erros, deleta o perfil e atualiza a tabela.
               Caso ocorra erro, mostra um JOptionPane.
           */
          try {
               Curso curso = this.facade.findByIdCurso(id);
               
               // Obtém a confirmação do usuário se será deletado o perfil de usuário do banco de dados.
               if(JOptionPane.showConfirmDialog(null, "Deseja realmente deletar " +
                       curso.getNome() + "?", "Deletar Dados", JOptionPane.DEFAULT_OPTION) == 0) {
                    this.facade.deleteCurso(curso);
                    this.atualizaTabela();
               }
          } catch (HeadlessException error) {
               JOptionPane.showMessageDialog(null, error,
                       "Erro ao tentar deletar!", JOptionPane.ERROR_MESSAGE);
          }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // TODO add your handling code here:
        // Obtém a string busca convertendo para letras minúsculas.
          String busca = txtBuscar.getText().toLowerCase();

          /* 
               Se a lista de perfis for nula ou vazia, faz a busca novamente.
               Se ocorrer erros, mostra o JOptionPane.
          */
          if (this.cursos == null || this.cursos.isEmpty()) {
               try {
                    this.cursos = this.facade.findByNomeCurso(busca);
               } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, error,
                            "Erro ao buscar perfils!", JOptionPane.ERROR_MESSAGE);
               }
          }

          // Obtém o modelo atual da tabela.
          DefaultTableModel tabelaDados = (DefaultTableModel) tblDados.getModel();
          tabelaDados.setNumRows(0);

          // Adiciona à tabela todos os perfis em que o nome contenha a busca informada.
          for (Curso curso: cursos) {
               if (curso.getNome().toLowerCase().contains(busca)) {
                    tabelaDados.addRow(new Object[]{curso.getId(),
                         curso.getNome(), curso.getSigla(), curso.getCodigoCurso()});
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
            java.util.logging.Logger.getLogger(TelaExibirCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaExibirCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaExibirCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaExibirCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaExibirCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlDesignLinha;
    private javax.swing.JTable tblDados;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}