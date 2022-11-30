package br.com.ifba;

import br.com.ifba.curso.view.TelaExibirCurso;
import br.com.ifba.disciplina.view.TelaExibirDisciplinas;
import br.com.ifba.etapacurso.view.TelaExibirEtapaCurso;
import br.com.ifba.infrastructure.service.IFacade;
import br.com.ifba.modalidadecurso.view.TelaExibirModalidade;
import br.com.ifba.perfilusuario.view.TelaExibirPerfilUsuario;
import br.com.ifba.professor.view.TelaExibirProfessor;
import br.com.ifba.turma.view.TelaExibirTurma;
import br.com.ifba.usuario.view.TelaExibirUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TelaDeTestes extends javax.swing.JFrame {
    
    // Usar para realizar testes dos que não tem tela.
    @Autowired
    IFacade facade;
    
    @Autowired
    private TelaExibirPerfilUsuario telaPerfilUsuario;
    @Autowired
    private TelaExibirUsuario telaUsuario;
    @Autowired
    private TelaExibirTurma telaTurma;
    @Autowired
    private TelaExibirProfessor telaProfessor;
    @Autowired
    private TelaExibirCurso telaCurso;
    @Autowired
    private TelaExibirDisciplinas telaDisciplina;
    @Autowired
    private TelaExibirEtapaCurso telaEtapa;
    @Autowired
    private TelaExibirModalidade telaModalidade;
    
    public TelaDeTestes() {
        initComponents();
        super.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlContainer = new javax.swing.JPanel();
        lblAlerta = new javax.swing.JLabel();
        btnTelaPerfil = new javax.swing.JButton();
        btnTelaCurso = new javax.swing.JButton();
        btnTelaProfessor = new javax.swing.JButton();
        btnTelaTurma = new javax.swing.JButton();
        btnTelaEtapa = new javax.swing.JButton();
        btnTelaUsuario = new javax.swing.JButton();
        btnTelaModalidade = new javax.swing.JButton();
        btnTelaDisciplina = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnlContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainer.setPreferredSize(new java.awt.Dimension(600, 500));

        lblAlerta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAlerta.setForeground(new java.awt.Color(204, 0, 0));
        lblAlerta.setText("ESSA É APENAS UMA TELA PARA REALIZAR TESTES NO SISTEMA.");

        btnTelaPerfil.setBackground(new java.awt.Color(0, 0, 0));
        btnTelaPerfil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTelaPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnTelaPerfil.setText("TELA PERFIL USUÁRIO");
        btnTelaPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaPerfilActionPerformed(evt);
            }
        });

        btnTelaCurso.setBackground(new java.awt.Color(0, 0, 0));
        btnTelaCurso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTelaCurso.setForeground(new java.awt.Color(255, 255, 255));
        btnTelaCurso.setText("TELA CURSO");
        btnTelaCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaCursoActionPerformed(evt);
            }
        });

        btnTelaProfessor.setBackground(new java.awt.Color(0, 0, 0));
        btnTelaProfessor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTelaProfessor.setForeground(new java.awt.Color(255, 255, 255));
        btnTelaProfessor.setText("TELA PROFESSOR");
        btnTelaProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaProfessorActionPerformed(evt);
            }
        });

        btnTelaTurma.setBackground(new java.awt.Color(0, 0, 0));
        btnTelaTurma.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTelaTurma.setForeground(new java.awt.Color(255, 255, 255));
        btnTelaTurma.setText("TELA TURMA");
        btnTelaTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaTurmaActionPerformed(evt);
            }
        });

        btnTelaEtapa.setBackground(new java.awt.Color(0, 0, 0));
        btnTelaEtapa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTelaEtapa.setForeground(new java.awt.Color(255, 255, 255));
        btnTelaEtapa.setText("TELA ETAPA CURSO");
        btnTelaEtapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaEtapaActionPerformed(evt);
            }
        });

        btnTelaUsuario.setBackground(new java.awt.Color(0, 0, 0));
        btnTelaUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTelaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnTelaUsuario.setText("TELA USUÁRIO");
        btnTelaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaUsuarioActionPerformed(evt);
            }
        });

        btnTelaModalidade.setBackground(new java.awt.Color(0, 0, 0));
        btnTelaModalidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTelaModalidade.setForeground(new java.awt.Color(255, 255, 255));
        btnTelaModalidade.setText("TELA MODALIDADE");
        btnTelaModalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaModalidadeActionPerformed(evt);
            }
        });

        btnTelaDisciplina.setBackground(new java.awt.Color(0, 0, 0));
        btnTelaDisciplina.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTelaDisciplina.setForeground(new java.awt.Color(255, 255, 255));
        btnTelaDisciplina.setText("TELA DISCIPLINA");
        btnTelaDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaDisciplinaActionPerformed(evt);
            }
        });

        btn01.setBackground(new java.awt.Color(0, 0, 0));
        btn01.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn01.setForeground(new java.awt.Color(255, 255, 255));
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTelaPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTelaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTelaEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTelaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTelaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTelaModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTelaProfessor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTelaDisciplina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(lblAlerta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAlerta)
                .addGap(31, 31, 31)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTelaPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTelaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContainerLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnTelaDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlContainerLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnTelaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTelaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnTelaEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTelaModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(btnTelaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.ipady = 133;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(pnlContainer, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTelaPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaPerfilActionPerformed
        this.telaPerfilUsuario.setVisible(true);
    }//GEN-LAST:event_btnTelaPerfilActionPerformed

    private void btnTelaCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaCursoActionPerformed
        this.telaCurso.setVisible(true);
    }//GEN-LAST:event_btnTelaCursoActionPerformed

    private void btnTelaProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaProfessorActionPerformed
         this.telaProfessor.setVisible(true);
    }//GEN-LAST:event_btnTelaProfessorActionPerformed

    private void btnTelaTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaTurmaActionPerformed
         this.telaTurma.setVisible(true);
    }//GEN-LAST:event_btnTelaTurmaActionPerformed

    private void btnTelaEtapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaEtapaActionPerformed
         this.telaEtapa.setVisible(true);
    }//GEN-LAST:event_btnTelaEtapaActionPerformed

    private void btnTelaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaUsuarioActionPerformed
         this.telaUsuario.setVisible(true);
    }//GEN-LAST:event_btnTelaUsuarioActionPerformed

    private void btnTelaModalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaModalidadeActionPerformed
         this.telaModalidade.setVisible(true);
    }//GEN-LAST:event_btnTelaModalidadeActionPerformed

    private void btnTelaDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaDisciplinaActionPerformed
        this.telaDisciplina.setVisible(true);
    }//GEN-LAST:event_btnTelaDisciplinaActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
    
    }//GEN-LAST:event_btn01ActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDeTestes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeTestes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeTestes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeTestes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeTestes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn01;
    private javax.swing.JButton btnTelaCurso;
    private javax.swing.JButton btnTelaDisciplina;
    private javax.swing.JButton btnTelaEtapa;
    private javax.swing.JButton btnTelaModalidade;
    private javax.swing.JButton btnTelaPerfil;
    private javax.swing.JButton btnTelaProfessor;
    private javax.swing.JButton btnTelaTurma;
    private javax.swing.JButton btnTelaUsuario;
    private javax.swing.JLabel lblAlerta;
    private javax.swing.JPanel pnlContainer;
    // End of variables declaration//GEN-END:variables
}
