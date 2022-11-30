/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.professor.view;

import br.com.ifba.infrastructure.service.IFacade;
import br.com.ifba.infrastructure.support.StringUtil;
import br.com.ifba.professor.model.Professor;
import br.com.ifba.disciplina.model.Disciplina;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author Leo
 */
@Component
public class TelaCadastroProfessor extends javax.swing.JFrame {

    @Autowired
    private IFacade facade;
    @Autowired @Lazy
    private TelaExibirProfessor telaExibir;
    
    /**
     * Creates new form TelaCadastrarDisciplinas
     */
    public TelaCadastroProfessor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    //lista global
    //ArrayList<String> listaDisciplina = new ArrayList<String>();
    // Verifica se algum dado está vazio
    private boolean validarCampos(Professor professor) {
        StringUtil validacao = StringUtil.getInstance();
        if(validacao.isEmpty(professor.getNome()) ||
                validacao.isEmpty(professor.getUsuario().getLogin()) ||
                validacao.isEmpty(professor.getSiape()) ||
                validacao.isEmpty(professor.getTelefone()) ||
                validacao.isEmpty(professor.getEmail()) ||
                validacao.isEmpty(professor.getCpf()) ||
                validacao.isEmpty(professor.getDataNascimento().toString()) ||
                validacao.isEmpty(professor.getUsuario().getSenha())) {
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
        txtDisciplina = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSiape = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblDataNascimento = new javax.swing.JLabel();
        spnDataNascimento = new javax.swing.JSpinner();
        btnAdiconarDisciplina = new javax.swing.JButton();
        txtSenha1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(220, 224, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 76, 126), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(43, 76, 126));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 400, -1));

        txtDisciplina.setBackground(new java.awt.Color(217, 217, 217));
        txtDisciplina.setText("Disciplina");
        jPanel1.add(txtDisciplina, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 252, 40));

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
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 710, 125, 50));

        btnCadastrar.setBackground(new java.awt.Color(217, 217, 217));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 710, 125, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("INSIRA OS DADOS PARA CADASTRAR O PROFESSOR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/sad/imagens/logo_sad.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 16, 160, 80));

        txtNome.setBackground(new java.awt.Color(217, 217, 217));
        txtNome.setText("Nome");
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 252, 40));

        txtSiape.setBackground(new java.awt.Color(217, 217, 217));
        txtSiape.setText("Siape");
        jPanel1.add(txtSiape, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 252, 40));

        txtTelefone.setBackground(new java.awt.Color(217, 217, 217));
        txtTelefone.setText("Telefone");
        jPanel1.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 252, 40));

        txtEmail.setBackground(new java.awt.Color(217, 217, 217));
        txtEmail.setText("E-mail");
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 252, 40));

        lblDataNascimento.setText("Data de nascimento:");
        jPanel1.add(lblDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        spnDataNascimento.setModel(new javax.swing.SpinnerDateModel());
        jPanel1.add(spnDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 472, 250, 30));

        btnAdiconarDisciplina.setText("Adicionar disciplina");
        btnAdiconarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdiconarDisciplinaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdiconarDisciplina, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 640, -1, -1));

        txtSenha1.setBackground(new java.awt.Color(217, 217, 217));
        txtSenha1.setText("Senha");
        jPanel1.add(txtSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 252, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        // Instanciando novo objeto professor para cadastro
        Professor professor = new Professor();
        
        // Variáveis para armazenar novos dados
        String nome = txtNome.getText();
        String login = txtLogin.getText();
        String siape = txtSiape.getText();
        String telefone = txtTelefone.getText();
        String email = txtEmail.getText();
        String cpf = txtCpf.getText();
        Date nascimento = (Date) spnDataNascimento.getValue();
        String senha = txtDisciplina.getText();
        
        // Preenchendo objeto professor com os novos dados
        professor.setNome(nome);
        professor.getUsuario().setLogin(login);
        professor.setSiape(siape);
        professor.setTelefone(telefone);
        professor.setEmail(email);
        professor.setCpf(cpf);
        professor.setDataNascimento(nascimento);
        professor.getUsuario().setSenha(senha);
       // professor.getDisciplina(listaDisciplina);
        
        if(this.validarCampos(professor) == false) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos e tente novamente!",
                    "Preencha os campos!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        try {
            this.facade.saveProfessor(professor);
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

    private void btnAdiconarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdiconarDisciplinaActionPerformed
        // TODO add your handling code here:
        //criando a lista
       // ArrayList<String> listaDisciplina = new ArrayList<String>();
        //armazenando o dado da variavel
        String disciplina = txtDisciplina.getText();
        //listaDisciplina.add(disciplina);
 
        
    }//GEN-LAST:event_btnAdiconarDisciplinaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdiconarDisciplina;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JSpinner spnDataNascimento;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDisciplina;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha1;
    private javax.swing.JTextField txtSiape;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
