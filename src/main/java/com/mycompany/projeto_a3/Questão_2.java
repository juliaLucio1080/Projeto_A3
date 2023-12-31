
package com.mycompany.projeto_a3;

import login.controller.LoginController;
import java.sql.SQLException;


/**
 *
 * @author User
 */
public class Questão_2 extends javax.swing.JFrame {
    private LoginController loginController;
    private int id_Usuario;
    /**
     * Creates new form Questão_2
     */
    public Questão_2(int idUsuario) {
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

        Botão1_exc = new javax.swing.JRadioButton();
        botão2_s = new javax.swing.JRadioButton();
        botão3_r = new javax.swing.JRadioButton();
        botão4_mr = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Botão1_exc.setText("Excelente");
        Botão1_exc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botão1_excActionPerformed(evt);
            }
        });

        botão2_s.setText("Satisfatória");
        botão2_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão2_sActionPerformed(evt);
            }
        });

        botão3_r.setText("Ruim");
        botão3_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão3_rActionPerformed(evt);
            }
        });

        botão4_mr.setText("Muito Ruim");
        botão4_mr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão4_mrActionPerformed(evt);
            }
        });

        jLabel3.setText("Quanto a qualidade, que nota você daria para a educação");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Formulário");
        jLabel4.setIconTextGap(10);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Questão 2");

        jLabel1.setText("em sua região?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Botão1_exc)
                            .addComponent(botão2_s))
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botão4_mr)
                            .addComponent(botão3_r)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botão1_exc)
                    .addComponent(botão3_r))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botão4_mr)
                    .addComponent(botão2_s))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Botão1_excActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botão1_excActionPerformed
        // TODO add your handling code here:
        this.dispose();
          try {
           // Supondo que o valor 1 representa a resposta para a Questão 2 (Excelente)
            loginController.respostaFormulario(id_Usuario, 0, 1, 0, 0, 0, 0, 0, 0);
        } catch (SQLException ex) {
            ex.printStackTrace();
    }                                         

        new Questão_3(id_Usuario).setVisible(true);
        
    }//GEN-LAST:event_Botão1_excActionPerformed

    private void botão2_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão2_sActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try{
            // Supondo que o valor 2 representa a resposta para a Questão 2 (Satisfatória)
            loginController.respostaFormulario(id_Usuario, 0, 2, 0, 0, 0, 0, 0, 0);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       new Questão_3(id_Usuario).setVisible(true);
        

        
    }//GEN-LAST:event_botão2_sActionPerformed

    private void botão3_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão3_rActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
        try{
            // Supondo que o valor 3 representa a resposta para a Questão 2 (Ruim)
            loginController.respostaFormulario(id_Usuario, 0, 3, 0, 0, 0, 0, 0, 0);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
               
        new Questão_3(id_Usuario).setVisible(true);
    }//GEN-LAST:event_botão3_rActionPerformed

    private void botão4_mrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão4_mrActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try{
            // Supondo que o valor 4 representa a resposta para a Questão 2 (Muito Ruim)
            loginController.respostaFormulario(id_Usuario, 0, 4, 0, 0, 0, 0, 0, 0);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
                new Questão_3(id_Usuario).setVisible(true);
        
    }//GEN-LAST:event_botão4_mrActionPerformed

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
            java.util.logging.Logger.getLogger(Questão_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Questão_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Questão_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Questão_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JRadioButton botão2_s;
    private javax.swing.JRadioButton botão3_r;
    private javax.swing.JRadioButton botão4_mr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
