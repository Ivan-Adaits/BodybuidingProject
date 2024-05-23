/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controller.DataUserController;
import Model.UserModel;
import Service.LoginService;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AdminViewProfile extends javax.swing.JFrame {

    public AdminViewProfile() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnwritecommentview = new javax.swing.JButton();
        btnshowcomments = new javax.swing.JButton();
        btnback4 = new javax.swing.JButton();
        txtnameprofile = new javax.swing.JTextField();
        txtsurnamesprofile = new javax.swing.JTextField();
        txtemailprofile = new javax.swing.JTextField();
        txtpasswordprofile = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        txtidprofile = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/profile png.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, 66));

        btnback.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnback.setText("X");
        btnback.setBorder(null);
        btnback.setPreferredSize(new java.awt.Dimension(40, 40));
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnbackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnbackMouseExited(evt);
            }
        });
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel2.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 214, 34, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Profile");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel3.setText("Your");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 130, 50));

        btnwritecommentview.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnwritecommentview.setText("Write Your Comment");
        btnwritecommentview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwritecommentviewActionPerformed(evt);
            }
        });
        jPanel2.add(btnwritecommentview, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        btnshowcomments.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnshowcomments.setText("Show Comments");
        btnshowcomments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowcommentsActionPerformed(evt);
            }
        });
        jPanel2.add(btnshowcomments, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 150, -1));

        btnback4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnback4.setText("X");
        btnback4.setBorder(null);
        btnback4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnback4.setPreferredSize(new java.awt.Dimension(40, 40));
        btnback4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnback4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnback4MouseExited(evt);
            }
        });
        btnback4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnback4ActionPerformed(evt);
            }
        });
        jPanel2.add(btnback4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 140));

        txtnameprofile.setBackground(new java.awt.Color(0, 204, 255));
        txtnameprofile.setBorder(null);
        jPanel1.add(txtnameprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 243, -1));

        txtsurnamesprofile.setBackground(new java.awt.Color(0, 204, 255));
        txtsurnamesprofile.setBorder(null);
        jPanel1.add(txtsurnamesprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 243, -1));

        txtemailprofile.setBackground(new java.awt.Color(0, 204, 255));
        txtemailprofile.setBorder(null);
        jPanel1.add(txtemailprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 243, -1));

        txtpasswordprofile.setBackground(new java.awt.Color(0, 204, 255));
        txtpasswordprofile.setBorder(null);
        txtpasswordprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordprofileActionPerformed(evt);
            }
        });
        jPanel1.add(txtpasswordprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 243, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SurNames");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 240, 20));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 240, 20));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 240, 20));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 240, 20));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, -1, -1));

        txtidprofile.setBackground(new java.awt.Color(0, 204, 255));
        txtidprofile.setForeground(new java.awt.Color(0, 204, 255));
        txtidprofile.setBorder(null);
        txtidprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidprofileActionPerformed(evt);
            }
        });
        jPanel1.add(txtidprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseEntered
        btnback.setBackground(Color.red);
    }//GEN-LAST:event_btnbackMouseEntered

    private void btnbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseExited
        btnback.setBackground(Color.white);

    }//GEN-LAST:event_btnbackMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UserModel user = new UserModel();
        DataUserController duc = new DataUserController();
        user.setUserName(txtnameprofile.getText());
        user.setUserSurName(txtsurnamesprofile.getText());
        user.setEmail(txtemailprofile.getText());
        user.setPassword(txtpasswordprofile.getText());
        user.setUid(Integer.parseInt(txtidprofile.getText()));

        if (duc.updateUser(user)) {
            JOptionPane.showMessageDialog(null, "Registro Actualizado");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtpasswordprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordprofileActionPerformed
    }//GEN-LAST:event_txtpasswordprofileActionPerformed

    private void txtidprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidprofileActionPerformed

    }//GEN-LAST:event_txtidprofileActionPerformed

    private void btnwritecommentviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwritecommentviewActionPerformed
        WriteCommentsView wcv = new WriteCommentsView();
        wcv.setVisible(true);
    }//GEN-LAST:event_btnwritecommentviewActionPerformed

    private void btnshowcommentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowcommentsActionPerformed
       CommentView cv = new CommentView();
       cv.setVisible(true);
       cv.showcomentario();
    }//GEN-LAST:event_btnshowcommentsActionPerformed

    private void btnback4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnback4MouseEntered
        btnback4.setBackground(Color.red);
    }//GEN-LAST:event_btnback4MouseEntered

    private void btnback4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnback4MouseExited
        btnback4.setBackground(Color.white);
    }//GEN-LAST:event_btnback4MouseExited

    private void btnback4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnback4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnback4ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnback1;
    private javax.swing.JButton btnback2;
    private javax.swing.JButton btnback3;
    private javax.swing.JButton btnback4;
    private javax.swing.JButton btnshowcomments;
    private javax.swing.JButton btnwritecommentview;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField txtemailprofile;
    private javax.swing.JTextField txtidprofile;
    private javax.swing.JTextField txtnameprofile;
    private javax.swing.JTextField txtpasswordprofile;
    private javax.swing.JTextField txtsurnamesprofile;
    // End of variables declaration//GEN-END:variables
public void showDataProfile() {
        DataUserController dbc = new DataUserController();
        ResultSet rs = dbc.showDataUser("Select * from user WHERE Username='" + LoginService.nombre + "'");
        try {
            while (rs.next()) {
                txtnameprofile.setText(rs.getString("Username"));
                txtsurnamesprofile.setText(rs.getString("UserSurname"));
                txtemailprofile.setText(rs.getString("Email"));
                txtpasswordprofile.setText(rs.getString("Password"));
                txtidprofile.setText(rs.getString("Uid"));
            }

        } catch (Exception e) {
        }
    }
}
