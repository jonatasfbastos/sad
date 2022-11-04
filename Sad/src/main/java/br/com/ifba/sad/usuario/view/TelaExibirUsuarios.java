/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.sad.usuario.view;

import br.com.ifba.sad.infrastructure.service.IFacade;
import br.com.ifba.sad.usuario.model.Usuario;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Leo
 */
@Component
public class TelaExibirUsuarios extends javax.swing.JFrame {

    @Autowired
    private IFacade facade;
    @Autowired
    private TelaEditarUsuario telaEditar;
    @Autowired
    private TelaCadastroUsuario telaCadastro;

    private List<Usuario> usuarios;
       
    public TelaExibirUsuarios() {
        initComponents();
        this.setLocationRelativeTo(null);//comando para iniciar a tela no centro do monitor
    }
    
    // Metodo para atualizar a tabela na view
    @PostConstruct
    public void atualizarTabela() {
          try {
               this.usuarios = this.facade.getAllUsuario();
          } catch (Exception error) {
               JOptionPane.showMessageDialog(null, error,
                       "Erro ao buscar usuários!", JOptionPane.ERROR_MESSAGE);
               return;
          }

          DefaultTableModel tabelaDados = (DefaultTableModel) tblDados.getModel();
          tabelaDados.setNumRows(0);
          
        for (Usuario usuario : usuarios) {          
            tabelaDados.addRow(new Object[] { usuario.getId(), usuario.getNome(), 
                usuario.getLogin(), usuario.getPerfilusuario().getNome()});
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
        pnlLinha = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        lblProcurar = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlContainer.setBackground(new java.awt.Color(220, 224, 230));
        pnlContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 76, 126), 3));

        tblDados.setBackground(new java.awt.Color(217, 217, 217));
        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Login", "Perfil do usuário"
            }
        ));
        jScrollPane1.setViewportView(tblDados);

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

        lblProcurar.setBackground(new java.awt.Color(217, 217, 217));
        lblProcurar.setText("Procurar usuário");
        lblProcurar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblProcurarKeyPressed(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContainerLayout.createSequentialGroup()
                        .addComponent(lblProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContainerLayout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContainerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnlLinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
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
        this.telaCadastro.setVisible(true);
        this.setVisible(false);
        this.telaCadastro.preencheComboBox();        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // Obtendo linha selecionada
        long linha = tblDados.getSelectedRow();

        if (linha == -1) {
            // Exibe mensagem de erro
            JOptionPane.showMessageDialog(rootPane, "Por favor, selecione uma linha da tabela.");

            // Só dá continuidade à remoção se o usuário confirmar.
        } else if (JOptionPane.showConfirmDialog(rootPane, "Os dados serão modificados."
                + "\nDeseja continuar?") == 0) {

            String login = (String) tblDados.getModel().getValueAt((int) linha, 2);
            
            // Acessando fachada para excluir dados
            List<Usuario> usuarioRemover = this.facade.findByLoginUsuario(login);
            
            // Removendo usuário
            this.facade.deleteUsuario(usuarioRemover.get(0));
            
            // Mensagem de sucesso.
            JOptionPane.showMessageDialog(rootPane, "Dados removidos com sucesso!");
            
            this.atualizarTabela();
        } else {
            
            // Se o usuário não confirmar o processo, exibe mensagem de cancelamento
            JOptionPane.showMessageDialog(rootPane, "Exclusão cancelada." +
                    "\nOs dados não foram alterados.");
            
        }
        
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Obtendo linha selecionada
        long linha = tblDados.getSelectedRow();

        if (linha == -1) {
            // Exibe mensagem de erro
            JOptionPane.showMessageDialog(rootPane, "Por favor, selecione uma linha da tabela.");

        } else {
            String login = (String) tblDados.getModel().getValueAt((int) linha, 2);
            
            // Acessando fachada para editar dados
            List<Usuario> usuarioEditar = this.facade.findByLoginUsuario(login);
            
            // Obtendo usuario a ser editado
            Usuario usrEdit = usuarioEditar.get(0);
            
            // Ocultando tela atual
            this.setVisible(false);
            
            //Abrindo tela de edição
            this.telaEditar.setVisible(true);
            this.setVisible(false);
            this.telaEditar.setUsuario(usrEdit);
            this.telaEditar.preencheComboBox();
        }
      
    }//GEN-LAST:event_btnEditarActionPerformed

    private void lblProcurarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblProcurarKeyPressed
          // Obtém a string busca convertendo para letras minúsculas.
          String nome = lblProcurar.getText().toLowerCase();

          if (this.usuarios == null || this.usuarios.isEmpty()) {
               try {
                    this.usuarios = this.facade.findByNomeUsuario(nome);
               } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, error,
                            "Erro ao buscar usuários!", JOptionPane.ERROR_MESSAGE);
               }
          }
          // Obtém o modelo atual da tabela.
          DefaultTableModel tabelaDados = (DefaultTableModel) tblDados.getModel();
          tabelaDados.setNumRows(0);

          // Adiciona à tabela todos os usuários em que o nome contenha a busca informada.
          for (Usuario usuario: usuarios) {
               if (usuario.getNome().toLowerCase().contains(nome)) {
                    tabelaDados.addRow(new Object[] { usuario.getId(), usuario.getNome(), 
                         usuario.getLogin(), usuario.getPerfilusuario().getNome()});
               }
          }
    }//GEN-LAST:event_lblProcurarKeyPressed

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
            java.util.logging.Logger.getLogger(TelaExibirUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaExibirUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaExibirUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaExibirUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaExibirUsuarios().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lblProcurar;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLinha;
    protected javax.swing.JTable tblDados;
    // End of variables declaration//GEN-END:variables
}
