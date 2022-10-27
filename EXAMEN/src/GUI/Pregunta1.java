/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import LOGICA.Usuario;

/**
 *
 * @author Practica
 */
public class Pregunta1 extends javax.swing.JFrame {

    /**
     * Creates new form Pregunta1
     */
    public Pregunta1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        btnGrpP1 = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        radBtnInt = new javax.swing.JRadioButton();
        radBtnFlt = new javax.swing.JRadioButton();
        radBtnStr = new javax.swing.JRadioButton();
        radBtnBool = new javax.swing.JRadioButton();
        btnNext = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(356, 254));
        setSize(new java.awt.Dimension(356, 254));

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("<html><b>Pregunta 1.</b><p> ¿Cuál es el tipo de dato para numeros reales en Java?<html>");
        lblTitulo.setToolTipText("");

        btnGrpP1.add(radBtnInt);
        radBtnInt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radBtnInt.setText("Integer");
        radBtnInt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnIntActionPerformed(evt);
            }
        });

        btnGrpP1.add(radBtnFlt);
        radBtnFlt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radBtnFlt.setText("Float");

        btnGrpP1.add(radBtnStr);
        radBtnStr.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radBtnStr.setText("String");

        btnGrpP1.add(radBtnBool);
        radBtnBool.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radBtnBool.setText("Boolean");

        btnNext.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnNext.setText("SIGUIENTE");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radBtnInt)
                    .addComponent(radBtnFlt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radBtnBool)
                    .addComponent(radBtnStr))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNext)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radBtnInt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radBtnFlt))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radBtnBool)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radBtnStr)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnNext)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        boolean rta = radBtnFlt.isSelected();
        if (rta){
            Usuario.rtas[0] = true;
        }
        Pregunta2 p2 = new Pregunta2();
        p2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNextActionPerformed

    private void radBtnIntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnIntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radBtnIntActionPerformed

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
            java.util.logging.Logger.getLogger(Pregunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pregunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pregunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pregunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pregunta1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrpP1;
    private javax.swing.JButton btnNext;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton radBtnBool;
    private javax.swing.JRadioButton radBtnFlt;
    private javax.swing.JRadioButton radBtnInt;
    private javax.swing.JRadioButton radBtnStr;
    // End of variables declaration//GEN-END:variables
}
