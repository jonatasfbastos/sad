/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.professor.view;

import br.com.ifba.disciplina.model.Disciplina;
import br.com.ifba.infrastructure.service.IFacade;
import br.com.ifba.professor.model.Professor;
import java.awt.HeadlessException;
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
public class TelaExibirProfessor extends javax.swing.JFrame {

    @Autowired
    private IFacade facade;
    @Autowired
    private TelaCadastroProfessor telaCadastro;
    @Autowired
    private TelaEdicaoProfessor telaEdicao;

    private List<Professor> professores;

    /**
     * Creates new form TelaExibirProfessor
     */
    public TelaExibirProfessor() {
        initComponents();
        this.setLocationRelativeTo(null);//comando para iniciar a tela no centro do monitor
    }

    // Metodo para atualizar a tabela na view
    @PostConstruct
    public void atualizarTabela() {
        try {
            this.professores = this.facade.getAllProfessor();
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error,
                    "Erro ao buscar professores!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel tabelaDados = (DefaultTableModel) tblTabela.getModel();
        tabelaDados.setNumRows(0);
        
        for (Professor professor : professores) {
            List<Disciplina> disciplinas = professor.getDisciplina();
            String nomesDisciplinas = new String();
            for (Disciplina disciplina : disciplinas) {
                nomesDisciplinas = nomesDisciplinas + disciplina.getNome() + "\n";
            }
            tabelaDados.addRow(new Object[]{
                professor.getId(),
                professor.getNome(),
                professor.getUsuario().getLogin(),
                professor.getSiape(),
                professor.getTelefone(),
                professor.getEmail(),
                professor.getCpf(),
                nomesDisciplinas
            });
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(220, 224, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 76, 126), 3));

        tblTabela.setBackground(new java.awt.Color(217, 217, 217));
        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "LOGIN", "SIAPE", "TELEFONE", "E-MAIL", "CPF", "DISCIPLINAS"
            }
        ));
        jScrollPane1.setViewportView(tblTabela);

        jPanel2.setBackground(new java.awt.Color(43, 76, 126));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        btnExcluir.setBackground(new java.awt.Color(217, 217, 217));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setText("DELETAR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(217, 217, 217));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        txtBuscar.setBackground(new java.awt.Color(217, 217, 217));
        txtBuscar.setForeground(new java.awt.Color(51, 51, 51));
        txtBuscar.setText("Buscar");

        btnCadastrar.setBackground(new java.awt.Color(217, 217, 217));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 383, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // Obtém a linha selecionada da tabela.
        int linhaSelecionada = tblTabela.getSelectedRow();

        // Se for igual a -1, significa que não há linha selecionada.
        if (linhaSelecionada == - 1) {
            JOptionPane.showMessageDialog(null, "Não há linha selecionada, tente novamente.",
                    "Erro ao selecionar linha!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtém o id na linha selecionada e coluna zero.
        Long id = (Long) tblTabela.getValueAt(linhaSelecionada, 0);

        /*
               Tenta realizar a busca pelo id, se não ocorrer erros, deleta o professor e atualiza a tabela.
               Caso ocorra erro, mostra um JOptionPane.
         */
        try {
            Professor professor = this.facade.findById(id);

            // Obtém a confirmação do usuário se será deletado o professor do banco de dados.
            if (JOptionPane.showConfirmDialog(null, "Deseja realmente deletar "
                    + professor.getNome() + "?", "Deletar Dados", JOptionPane.DEFAULT_OPTION) == 0) {
                this.facade.deleteProfessor(professor);
                this.atualizarTabela();
            }
        } catch (HeadlessException error) {
            JOptionPane.showMessageDialog(null, error,
                    "Erro ao tentar deletar!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        this.telaCadastro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Obtém a linha selecionada da tabela.
        int linhaSelecionada = tblTabela.getSelectedRow();

        // Se for igual a -1, significa que não há linha selecionada.
        if (linhaSelecionada == - 1) {
            JOptionPane.showMessageDialog(null, "Não há linha selecionada, tente novamente.",
                    "Erro ao selecionar linha!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtém o id na linha selecionada e coluna zero.
        Long id = (Long) tblTabela.getValueAt(linhaSelecionada, 0);

        /*
               Tenta realizar a busca pelo id, se não ocorrer erros, mostra a tela de edição.
               Caso ocorra erro, mostra um JOptionPane.
         */
        try {
            Professor professor = this.facade.findById(id);
            this.telaEdicao.setProfessor(professor);
            this.telaEdicao.setVisible(true);
            this.setVisible(false);
        } catch (HeadlessException error) {
            JOptionPane.showMessageDialog(null, error,
                    "Erro ao tentar editar!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // Obtém a string busca convertendo para letras minúsculas.
        String nome = txtBuscar.getText().toLowerCase();

        if (this.professores == null || this.professores.isEmpty()) {
            try {
                this.professores = this.facade.findByNomeProfessor(nome);
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, error,
                        "Erro ao buscar usuários!", JOptionPane.ERROR_MESSAGE);
            }
        }
        // Obtém o modelo atual da tabela.
        DefaultTableModel tabelaDados = (DefaultTableModel) tblTabela.getModel();
        tabelaDados.setNumRows(0);

        // Adiciona à tabela todos os professores em que o nome contenha a busca informada.
        
        for (Professor professor : professores) {
            List<Disciplina> disciplinas = professor.getDisciplina();
            String nomesDisciplinas = new String();
            for (Disciplina disciplina : disciplinas) {
                nomesDisciplinas = nomesDisciplinas + disciplina.getNome() + "\n";
            }
            if (professor.getNome().toLowerCase().contains(nome)) {
                tabelaDados.addRow(new Object[]{
                    professor.getId(),
                    professor.getNome(),
                    professor.getUsuario().getLogin(),
                    professor.getSiape(),
                    professor.getTelefone(),
                    professor.getEmail(),
                    professor.getCpf(),
                    nomesDisciplinas
                });
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
            java.util.logging.Logger.getLogger(TelaExibirProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaExibirProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaExibirProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaExibirProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaExibirProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
