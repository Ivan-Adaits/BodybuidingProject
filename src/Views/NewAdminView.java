/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import java.awt.Color;
import javax.swing.JFrame;

public class NewAdminView extends javax.swing.JFrame {

    public NewAdminView() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        brnprofile = new javax.swing.JButton();
        btndatabodybuilder = new javax.swing.JButton();
        btnmanageusers2 = new javax.swing.JButton();
        btnformbodybuilder1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4.jpg"))); // NOI18N
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentHidden(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 400));

        brnprofile.setBackground(new java.awt.Color(204, 153, 0));
        brnprofile.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        brnprofile.setForeground(new java.awt.Color(255, 255, 255));
        brnprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/profile png.png"))); // NOI18N
        brnprofile.setBorder(null);
        brnprofile.setBorderPainted(false);
        brnprofile.setContentAreaFilled(false);
        brnprofile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brnprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnprofileActionPerformed(evt);
            }
        });
        jPanel1.add(brnprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 80, 50));

        btndatabodybuilder.setBackground(new java.awt.Color(0, 0, 0));
        btndatabodybuilder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btndatabodybuilder.setForeground(new java.awt.Color(255, 255, 255));
        btndatabodybuilder.setText("SEE BODYBUILDERS");
        btndatabodybuilder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btndatabodybuilderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndatabodybuilderMouseExited(evt);
            }
        });
        btndatabodybuilder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndatabodybuilderActionPerformed(evt);
            }
        });
        jPanel1.add(btndatabodybuilder, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 200, 50));

        btnmanageusers2.setBackground(new java.awt.Color(0, 0, 0));
        btnmanageusers2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnmanageusers2.setForeground(new java.awt.Color(255, 255, 255));
        btnmanageusers2.setText("Manager User");
        btnmanageusers2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnmanageusers2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmanageusers2MouseExited(evt);
            }
        });
        btnmanageusers2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanageusers2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnmanageusers2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 50));

        btnformbodybuilder1.setBackground(new java.awt.Color(0, 0, 0));
        btnformbodybuilder1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnformbodybuilder1.setForeground(new java.awt.Color(255, 255, 255));
        btnformbodybuilder1.setText("ADD BODYBUILDER ");
        btnformbodybuilder1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnformbodybuilder1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnformbodybuilder1MouseExited(evt);
            }
        });
        btnformbodybuilder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnformbodybuilder1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnformbodybuilder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 210, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentHidden
    }//GEN-LAST:event_jLabel1ComponentHidden

    private void btndatabodybuilderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndatabodybuilderActionPerformed
        DataBodybuilderView db = new DataBodybuilderView();
        db.setVisible(true);
        db.showData();
    }//GEN-LAST:event_btndatabodybuilderActionPerformed

    private void btnmanageusers2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanageusers2ActionPerformed
        UserManagerView umv = new UserManagerView();
        umv.setVisible(true);
        umv.showData();
    }//GEN-LAST:event_btnmanageusers2ActionPerformed

    private void brnprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnprofileActionPerformed
        AdminViewProfile avp = new AdminViewProfile();
        avp.setVisible(true);
        avp.showDataProfile();
    }//GEN-LAST:event_brnprofileActionPerformed

    private void btndatabodybuilderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndatabodybuilderMouseEntered
        btndatabodybuilder.setBackground(Color.blue);
    }//GEN-LAST:event_btndatabodybuilderMouseEntered

    private void btndatabodybuilderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndatabodybuilderMouseExited
        btndatabodybuilder.setBackground(Color.black);
    }//GEN-LAST:event_btndatabodybuilderMouseExited

    private void btnmanageusers2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmanageusers2MouseEntered
        btnmanageusers2.setBackground(Color.blue);

    }//GEN-LAST:event_btnmanageusers2MouseEntered

    private void btnmanageusers2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmanageusers2MouseExited
        btnmanageusers2.setBackground(Color.black);

    }//GEN-LAST:event_btnmanageusers2MouseExited

    private void btnformbodybuilder1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnformbodybuilder1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnformbodybuilder1MouseEntered

    private void btnformbodybuilder1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnformbodybuilder1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnformbodybuilder1MouseExited

    private void btnformbodybuilder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnformbodybuilder1ActionPerformed
        FormBodybuilder fb = new FormBodybuilder();
        fb.setVisible(true);
        fb.show();
    }//GEN-LAST:event_btnformbodybuilder1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewAdminView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnprofile;
    private javax.swing.JButton btndatabodybuilder;
    private javax.swing.JButton btnformbodybuilder1;
    private javax.swing.JButton btnmanageusers2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
