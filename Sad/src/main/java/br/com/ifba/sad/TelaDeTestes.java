package br.com.ifba.sad;

import br.com.ifba.perfilusuario.view.TelaExibirPerfilUsuario;
import br.com.ifba.professor.view.TelaExibirProfessor;
import br.com.ifba.turma.view.TelaExibirTurma;
import br.com.ifba.usuario.view.TelaExibirUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TelaDeTestes extends javax.swing.JFrame {
    
    @Autowired
    private TelaExibirPerfilUsuario telaPerfilUsuario;
    @Autowired
    private TelaExibirUsuario telaUsuario;
    @Autowired
    private TelaExibirTurma telaTurma;
    @Autowired
    private TelaExibirProfessor telaProfessor;
    
    public TelaDeTestes() {
        initComponents();
        super.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        lblAlerta = new javax.swing.JLabel();
        btnTelaPerfil = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btnTelaProfessor = new javax.swing.JButton();
        btnTelaTurma = new javax.swing.JButton();
        btn03 = new javax.swing.JButton();
        btn06 = new javax.swing.JButton();
        btn09 = new javax.swing.JButton();
        btnTelaUsuario = new javax.swing.JButton();
        btn04 = new javax.swing.JButton();
        btn07 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn05 = new javax.swing.JButton();
        btn08 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlContainer.setBackground(new java.awt.Color(255, 255, 255));

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

        btn01.setBackground(new java.awt.Color(0, 0, 0));
        btn01.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn01.setForeground(new java.awt.Color(255, 255, 255));
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
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

        btn03.setBackground(new java.awt.Color(0, 0, 0));
        btn03.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn03.setForeground(new java.awt.Color(255, 255, 255));
        btn03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn03ActionPerformed(evt);
            }
        });

        btn06.setBackground(new java.awt.Color(0, 0, 0));
        btn06.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn06.setForeground(new java.awt.Color(255, 255, 255));
        btn06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn06ActionPerformed(evt);
            }
        });

        btn09.setBackground(new java.awt.Color(0, 0, 0));
        btn09.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn09.setForeground(new java.awt.Color(255, 255, 255));
        btn09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn09ActionPerformed(evt);
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

        btn04.setBackground(new java.awt.Color(0, 0, 0));
        btn04.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn04.setForeground(new java.awt.Color(255, 255, 255));
        btn04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn04ActionPerformed(evt);
            }
        });

        btn07.setBackground(new java.awt.Color(0, 0, 0));
        btn07.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn07.setForeground(new java.awt.Color(255, 255, 255));
        btn07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn07ActionPerformed(evt);
            }
        });

        btn10.setBackground(new java.awt.Color(0, 0, 0));
        btn10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn10.setForeground(new java.awt.Color(255, 255, 255));
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn02.setBackground(new java.awt.Color(0, 0, 0));
        btn02.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn02.setForeground(new java.awt.Color(255, 255, 255));
        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });

        btn05.setBackground(new java.awt.Color(0, 0, 0));
        btn05.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn05.setForeground(new java.awt.Color(255, 255, 255));
        btn05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn05ActionPerformed(evt);
            }
        });

        btn08.setBackground(new java.awt.Color(0, 0, 0));
        btn08.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn08.setForeground(new java.awt.Color(255, 255, 255));
        btn08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn08ActionPerformed(evt);
            }
        });

        btn11.setBackground(new java.awt.Color(0, 0, 0));
        btn11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn11.setForeground(new java.awt.Color(255, 255, 255));
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
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
                    .addComponent(btn03, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn06, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn09, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTelaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn04, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn07, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTelaProfessor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn05, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn08, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(lblAlerta)
                .addContainerGap(170, Short.MAX_VALUE))
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
                                .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btn05, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btn08, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlContainerLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnTelaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn03, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn04, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn06, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn07, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn09, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(btnTelaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTelaPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaPerfilActionPerformed
        this.telaPerfilUsuario.setVisible(true);
    }//GEN-LAST:event_btnTelaPerfilActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
      
    }//GEN-LAST:event_btn01ActionPerformed

    private void btnTelaProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaProfessorActionPerformed
         this.telaProfessor.setVisible(true);
    }//GEN-LAST:event_btnTelaProfessorActionPerformed

    private void btnTelaTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaTurmaActionPerformed
         this.telaTurma.setVisible(true);
    }//GEN-LAST:event_btnTelaTurmaActionPerformed

    private void btn03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn03ActionPerformed
        
    }//GEN-LAST:event_btn03ActionPerformed

    private void btn06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn06ActionPerformed
        
    }//GEN-LAST:event_btn06ActionPerformed

    private void btn09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn09ActionPerformed
       
    }//GEN-LAST:event_btn09ActionPerformed

    private void btnTelaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaUsuarioActionPerformed
         this.telaUsuario.setVisible(true);
    }//GEN-LAST:event_btnTelaUsuarioActionPerformed

    private void btn04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn04ActionPerformed
        
    }//GEN-LAST:event_btn04ActionPerformed

    private void btn07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn07ActionPerformed
        
    }//GEN-LAST:event_btn07ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
       
    }//GEN-LAST:event_btn02ActionPerformed

    private void btn05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn05ActionPerformed
       
    }//GEN-LAST:event_btn05ActionPerformed

    private void btn08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn08ActionPerformed
       
    }//GEN-LAST:event_btn08ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        
    }//GEN-LAST:event_btn11ActionPerformed

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
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn03;
    private javax.swing.JButton btn04;
    private javax.swing.JButton btn05;
    private javax.swing.JButton btn06;
    private javax.swing.JButton btn07;
    private javax.swing.JButton btn08;
    private javax.swing.JButton btn09;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btnTelaPerfil;
    private javax.swing.JButton btnTelaProfessor;
    private javax.swing.JButton btnTelaTurma;
    private javax.swing.JButton btnTelaUsuario;
    private javax.swing.JLabel lblAlerta;
    private javax.swing.JPanel pnlContainer;
    // End of variables declaration//GEN-END:variables
}
