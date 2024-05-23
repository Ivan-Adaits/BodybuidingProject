/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controller.LoginController;
import Model.UserModel;
import java.awt.Color;
import javax.swing.JOptionPane;

public class NewLogin extends javax.swing.JFrame {

    public NewLogin() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtuserlogin = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnlogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        signupbtn = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        txtpasswordlogin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/olympia.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 300, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 300, 500));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel3.setText("LOGIN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 390, 50));

        jLabel4.setText("User Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        txtuserlogin.setForeground(new java.awt.Color(204, 204, 204));
        txtuserlogin.setText("Enter your username ");
        txtuserlogin.setBorder(null);
        txtuserlogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtuserloginFocusGained(evt);
            }
        });
        txtuserlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtuserloginMousePressed(evt);
            }
        });
        txtuserlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserloginActionPerformed(evt);
            }
        });
        jPanel1.add(txtuserlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 310, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 310, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 310, -1));

        btnlogin.setBackground(new java.awt.Color(0, 153, 255));
        btnlogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("login");
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnloginMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnloginMouseExited(evt);
            }
        });
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 90, 40));

        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        signupbtn.setForeground(new java.awt.Color(0, 102, 255));
        signupbtn.setText("Registrarse");
        signupbtn.setBorder(null);
        signupbtn.setBorderPainted(false);
        signupbtn.setContentAreaFilled(false);
        signupbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });
        jPanel1.add(signupbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(51, 51, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 60, 10));

        txtpasswordlogin.setForeground(new java.awt.Color(204, 204, 204));
        txtpasswordlogin.setText("********");
        txtpasswordlogin.setBorder(null);
        txtpasswordlogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpasswordloginFocusGained(evt);
            }
        });
        txtpasswordlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtpasswordloginMousePressed(evt);
            }
        });
        txtpasswordlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordloginActionPerformed(evt);
            }
        });
        jPanel1.add(txtpasswordlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 310, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtuserloginMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtuserloginMousePressed

    }// GEN-LAST:event_txtuserloginMousePressed

    private void txtuserloginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtuserloginActionPerformed
    }// GEN-LAST:event_txtuserloginActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnloginActionPerformed

        UserModel user = new UserModel(txtuserlogin.getText(), txtpasswordlogin.getText());

        LoginController lc = new LoginController();
        String role = lc.checkLogin(user);

        if (role.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "CANNOT LOG IN");
        } else if (role.equals("Admin")) {

            this.setVisible(false);
            this.dispose();
            NewAdminView nv = new NewAdminView();
            nv.setVisible(true);
        } else if (role.equals("User")) {

            this.setVisible(false);
            this.dispose();
            UserView uv = new UserView();
            uv.setVisible(true);
            uv.showData();
        }

    }// GEN-LAST:event_btnloginActionPerformed

    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_signupbtnActionPerformed
        NewSignUp sg = new NewSignUp();
        sg.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_signupbtnActionPerformed

    private void txtpasswordloginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtpasswordloginActionPerformed

    }// GEN-LAST:event_txtpasswordloginActionPerformed

    private void txtpasswordloginMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtpasswordloginMousePressed

    }// GEN-LAST:event_txtpasswordloginMousePressed

    private void btnloginMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnloginMouseEntered
        btnlogin.setBackground(Color.black);
        btnlogin.setForeground(Color.red);
    }// GEN-LAST:event_btnloginMouseEntered

    private void btnloginMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnloginMouseExited
        btnlogin.setBackground(Color.blue);
        btnlogin.setForeground(Color.white);
    }// GEN-LAST:event_btnloginMouseExited

    private void txtuserloginFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtuserloginFocusGained
        if (txtuserlogin.getText().equals("Enter your username ")) {
            txtuserlogin.setText("");
            txtuserlogin.setForeground(Color.black);
        }
        if (txtpasswordlogin.getText().isEmpty()) {
            txtpasswordlogin.setText("********");
            txtpasswordlogin.setForeground(Color.gray);
        }
    }// GEN-LAST:event_txtuserloginFocusGained

    private void txtpasswordloginFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtpasswordloginFocusGained
        if (txtpasswordlogin.getText().equals("********")) {
            txtpasswordlogin.setText("");
            txtpasswordlogin.setForeground(Color.black);

        }
        if (txtuserlogin.getText().isEmpty()) {
            txtuserlogin.setText("Enter your username ");
            txtuserlogin.setForeground(Color.gray);

        }
    }// GEN-LAST:event_txtpasswordloginFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton signupbtn;
    private javax.swing.JPasswordField txtpasswordlogin;
    private javax.swing.JTextField txtuserlogin;
    // End of variables declaration//GEN-END:variables
}
