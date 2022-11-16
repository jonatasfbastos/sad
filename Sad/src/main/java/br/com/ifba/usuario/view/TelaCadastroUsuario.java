/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.usuario.view;

import br.com.ifba.infrastructure.service.IFacade;
import br.com.ifba.infrastructure.support.StringUtil;
import br.com.ifba.perfilusuario.model.PerfilUsuario;
import br.com.ifba.usuario.model.Usuario;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author João P. Arquim
 */
@Component
public class TelaCadastroUsuario extends javax.swing.JFrame {
    
    @Autowired
    private IFacade facade;
    @Autowired @Lazy
    private TelaExibirUsuario telaExibir;
    
    public TelaCadastroUsuario() {
        initComponents();
        //comando para iniciar a tela no centro do monitor
        this.setLocationRelativeTo(null);
    }
    
    public void preencheComboBox() {
        List<PerfilUsuario> perfis = facade.getAllPerfilUsuario();
        DefaultComboBoxModel combo = (DefaultComboBoxModel) cbxPerfil.getModel();
        combo.removeAllElements();
        
        for (PerfilUsuario perfil: perfis) {
            combo.addElement(perfil.getNome());
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
        pnlLinha = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        lblInsiraDados = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        cbxPerfil = new javax.swing.JComboBox<>();
        lblTipoConta = new javax.swing.JLabel();
        lblLogoSad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlContainer.setBackground(new java.awt.Color(220, 224, 230));
        pnlContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 76, 126), 3));

        pnlLinha.setBackground(new java.awt.Color(43, 76, 126));

        javax.swing.GroupLayout pnlLinhaLayout = new javax.swing.GroupLayout(pnlLinha);
        pnlLinha.setLayout(pnlLinhaLayout);
        pnlLinhaLayout.setHorizontalGroup(
            pnlLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlLinhaLayout.setVerticalGroup(
            pnlLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        txtNome.setBackground(new java.awt.Color(217, 217, 217));
        txtNome.setText("nome");

        txtMatricula.setBackground(new java.awt.Color(217, 217, 217));
        txtMatricula.setText("login");

        txtSenha.setBackground(new java.awt.Color(217, 217, 217));
        txtSenha.setText("senha");

        btnVoltar.setBackground(new java.awt.Color(217, 217, 217));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblInsiraDados.setBackground(new java.awt.Color(0, 0, 0));
        lblInsiraDados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblInsiraDados.setText("INSIRA OS DADOS PARA O CADASTRO");

        btnCadastrar.setBackground(new java.awt.Color(217, 217, 217));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        cbxPerfil.setBackground(new java.awt.Color(217, 217, 217));
        cbxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Discente", "Doscente" }));

        lblTipoConta.setText("Tipo de conta:");

        lblLogoSad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/sad/imagens/logo_sad.png"))); // NOI18N

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addComponent(pnlLinha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addComponent(lblTipoConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContainerLayout.createSequentialGroup()
                        .addComponent(lblInsiraDados)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContainerLayout.createSequentialGroup()
                        .addComponent(lblLogoSad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContainerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblLogoSad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInsiraDados, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoConta)
                    .addComponent(cbxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlLinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private boolean validaCampos(Usuario usuario) {
       StringUtil validacao = StringUtil.getInstance();
         if (validacao.isEmpty(usuario.getNome()) || validacao.isEmpty(usuario.getLogin()) ||
                 validacao.isEmpty(usuario.getSenha())) {
             return false;
         }
        return true;
   }
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Usuario usuario = new Usuario();
        
        String nome = txtNome.getText();
        String login = txtMatricula.getText();
        String senha = txtSenha.getText();
        String perfil = cbxPerfil.getSelectedItem().toString();
        
        PerfilUsuario perfilUsuario = facade.findByNomePerfilUsuario(perfil).get(0);
        
        usuario.setNome(nome);
        usuario.setLogin(login);
        usuario.setSenha(senha);
        usuario.setPerfilUsuario(perfilUsuario);
        
        if (this.validaCampos(usuario) == false) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos e tente novamente!", 
                    "Preencha os Campos!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        try {
            this.facade.saveUsuario(usuario);
            this.setVisible(false);
            this.telaExibir.setVisible(true);
            this.telaExibir.atualizarTabela();
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error, 
                    "Erro ao cadastrar!", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        this.telaExibir.setVisible(true);
        this.telaExibir.atualizarTabela();        
    }//GEN-LAST:event_btnVoltarActionPerformed
    
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
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    protected javax.swing.JComboBox<String> cbxPerfil;
    private javax.swing.JLabel lblInsiraDados;
    private javax.swing.JLabel lblLogoSad;
    private javax.swing.JLabel lblTipoConta;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLinha;
    public javax.swing.JTextField txtMatricula;
    public javax.swing.JTextField txtNome;
    public javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}