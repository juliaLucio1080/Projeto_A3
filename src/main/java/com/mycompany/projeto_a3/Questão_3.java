
package com.mycompany.projeto_a3;

import java.sql.SQLException;
import login.controller.LoginController;

/**
 *
 * @author User
 */
public class Questão_3 extends javax.swing.JFrame {
    private LoginController loginController;
    private int id_Usuario;

    /**
     * Creates new form Questão_3
     */
    public Questão_3(int idUsuario) {
        initComponents();
        this.loginController = new LoginController();
        this.id_Usuario = idUsuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Botão1_exc = new javax.swing.JRadioButton();
        botão3_s = new javax.swing.JRadioButton();
        botão2_r = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        botão4_s1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Formulário");
        jLabel4.setIconTextGap(10);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Questão 3");

        Botão1_exc.setText("Ensino fundamental completo (Ensino médio incompleto)");
        Botão1_exc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botão1_excActionPerformed(evt);
            }
        });

        botão3_s.setText("Ensino superior completo ou cursando");
        botão3_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão3_sActionPerformed(evt);
            }
        });

        botão2_r.setText("Ensino médio completo ou cursando (Superior incompleto)");
        botão2_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão2_rActionPerformed(evt);
            }
        });

        jLabel3.setText("Qual seu nível de escolaridade?");

        botão4_s1.setText("Mestrado ou Doutorado");
        botão4_s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão4_s1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botão2_r)
                            .addComponent(botão3_s)
                            .addComponent(Botão1_exc)
                            .addComponent(botão4_s1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(Botão1_exc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botão2_r)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botão3_s)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botão4_s1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botão3_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão3_sActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
        try{
            // Supondo que o valor 3 representa a resposta para a Questão 3 (Ensino superior completo ou cursando)
        loginController.respostaFormulario(id_Usuario, 0, 0, 3, 0, 0, 0, 0, 0);
    } catch (SQLException ex) {
        ex.printStackTrace();
        }

       new Questão_4(id_Usuario).setVisible(true);
    }//GEN-LAST:event_botão3_sActionPerformed

    private void Botão1_excActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botão1_excActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try{
                 // Supondo que o valor 1 representa a resposta para a Questão 3 (Ensino fundamental completo (Ensino médio incompleto)
        loginController.respostaFormulario(id_Usuario, 0, 0, 1, 0, 0, 0, 0, 0);
    } catch (SQLException ex) {
        ex.printStackTrace();
    
        }

        new Questão_4(id_Usuario).setVisible(true);
    }//GEN-LAST:event_Botão1_excActionPerformed

    private void botão2_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão2_rActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
        try{
            // Supondo que o valor 2 representa a resposta para a Questão 3 (Ensino médio completo ou cursando (Superior incompleto)
        loginController.respostaFormulario(id_Usuario, 0, 0, 2, 0, 0, 0, 0, 0);
    } catch (SQLException ex) {
        ex.printStackTrace();
        }

        new Questão_4(id_Usuario).setVisible(true);
    }//GEN-LAST:event_botão2_rActionPerformed

    private void botão4_s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão4_s1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
        try{
        // Supondo que o valor 4 representa a resposta para a Questão 3(Mestrado ou Doutorado)
        loginController.respostaFormulario(id_Usuario, 0, 0, 4, 0, 0, 0, 0, 0);
    } catch (SQLException ex) {
        ex.printStackTrace();
        }
       
        new Questão_4(id_Usuario).setVisible(true);
    }//GEN-LAST:event_botão4_s1ActionPerformed

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
            java.util.logging.Logger.getLogger(Questão_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Questão_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Questão_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Questão_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Botão1_exc;
    private javax.swing.JRadioButton botão2_r;
    private javax.swing.JRadioButton botão3_s;
    private javax.swing.JRadioButton botão4_s1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
