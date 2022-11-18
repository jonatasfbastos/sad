/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.aluno.view;

import br.com.ifba.infrastructure.service.IFacade;
import br.com.ifba.infrastructure.support.StringUtil;
import br.com.ifba.aluno.model.Aluno;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author Leo
 */
@Component
public class TelaCadastroAluno extends javax.swing.JFrame {

    @Autowired
    private IFacade facade;
    @Autowired @Lazy
    private TelaExibirAluno telaExibir;
    
    /**
     * Creates new form TelaCadastrarAluno
     */
    public TelaCadastroAluno() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private boolean validarCampos(Aluno aluno) {
        StringUtil validacao = StringUtil.getInstance();
        if(validacao.isEmpty(aluno.getNome()) ||
                validacao.isEmpty(aluno.getUsuario().getLogin()) ||
                validacao.isEmpty(aluno.getMatricula()) ||
                validacao.isEmpty(aluno.getTelefone()) ||
                validacao.isEmpty(aluno.getEmail()) ||
                validacao.isEmpty(aluno.getCpf()) ||
                validacao.isEmpty(aluno.getUsuario().getSenha())) {
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtSenha = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(220, 224, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 76, 126), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(43, 76, 126));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 400, -1));

        txtSenha.setBackground(new java.awt.Color(217, 217, 217));
        txtSenha.setText("Senha");
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 252, 40));

        txtLogin.setBackground(new java.awt.Color(217, 217, 217));
        txtLogin.setText("Login");
        jPanel1.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 252, 40));

        txtCpf.setBackground(new java.awt.Color(217, 217, 217));
        txtCpf.setText("CPF");
        jPanel1.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 252, 40));

        btnVoltar.setBackground(new java.awt.Color(217, 217, 217));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 125, 50));

        btnCadastrar.setBackground(new java.awt.Color(217, 217, 217));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 125, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("INSIRA OS DADOS PARA CADASTRAR O ALUNO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/sad/imagens/logo_sad.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 16, 160, 80));

        txtNome.setBackground(new java.awt.Color(217, 217, 217));
        txtNome.setText("Nome");
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 252, 40));

        txtMatricula.setBackground(new java.awt.Color(217, 217, 217));
        txtMatricula.setText("Matrícula");
        jPanel1.add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 252, 40));

        txtTelefone.setBackground(new java.awt.Color(217, 217, 217));
        txtTelefone.setText("Telefone");
        jPanel1.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 252, 40));

        txtEmail.setBackground(new java.awt.Color(217, 217, 217));
        txtEmail.setText("E-mail");
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 252, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        // Instanciando novo objeto aluno para cadastro
        Aluno aluno = new Aluno();
        
        // Variáveis para armazenar novos dados
        String nome = txtNome.getText();
        String login = txtLogin.getText();
        String matricula = txtMatricula.getText();
        String telefone = txtTelefone.getText();
        String email = txtEmail.getText();
        String cpf = txtCpf.getText();
        String senha = txtSenha.getText();
        
        // Preenchendo objeto aluno com os novos dados
        aluno.setNome(nome);
        aluno.getUsuario().setLogin(login);
        aluno.setMatricula(matricula);
        aluno.setTelefone(telefone);
        aluno.setEmail(email);
        aluno.setCpf(cpf);
        aluno.getUsuario().setSenha(senha);
        
        if(this.validarCampos(aluno) == false) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos e tente novamente!",
                    "Preencha os campos!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        try {
            this.facade.saveAluno(aluno);
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
            java.util.logging.Logger.getLogger(TelaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}