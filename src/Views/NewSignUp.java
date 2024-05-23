/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controller.SignUpController;
import Model.UserModel;
import java.awt.Color;
import javax.swing.JOptionPane;

public class NewSignUp extends javax.swing.JFrame {

    public NewSignUp() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtname = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txtsurnames = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        btnsignup = new javax.swing.JButton();
        comborole = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        signupbtn = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/olympia.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 500));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel2.setText("Sign Up");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 420, -1));

        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        jLabel5.setText("Surnames");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));

        jLabel7.setText("Role");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 340, 10));

        txtname.setForeground(new java.awt.Color(204, 204, 204));
        txtname.setText("Enter your name");
        txtname.setBorder(null);
        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnameFocusGained(evt);
            }
        });
        txtname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtnameMousePressed(evt);
            }
        });
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 340, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 340, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 340, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 340, 10));

        txtsurnames.setForeground(new java.awt.Color(204, 204, 204));
        txtsurnames.setText("Enter your last name");
        txtsurnames.setBorder(null);
        txtsurnames.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtsurnamesFocusGained(evt);
            }
        });
        txtsurnames.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtsurnamesMousePressed(evt);
            }
        });
        jPanel1.add(txtsurnames, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 340, -1));

        txtemail.setForeground(new java.awt.Color(204, 204, 204));
        txtemail.setText("Enter your email");
        txtemail.setBorder(null);
        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtemailFocusGained(evt);
            }
        });
        txtemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtemailMousePressed(evt);
            }
        });
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 340, -1));

        txtpassword.setForeground(new java.awt.Color(204, 204, 204));
        txtpassword.setText("********");
        txtpassword.setBorder(null);
        txtpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpasswordFocusGained(evt);
            }
        });
        txtpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtpasswordMousePressed(evt);
            }
        });
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 310, -1));

        btnsignup.setBackground(new java.awt.Color(0, 153, 255));
        btnsignup.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsignup.setForeground(new java.awt.Color(255, 255, 255));
        btnsignup.setText("sign up");
        btnsignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsignupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsignupMouseExited(evt);
            }
        });
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        jPanel1.add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 120, 40));

        comborole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "User", "Admin" }));
        comborole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboroleActionPerformed(evt);
            }
        });
        jPanel1.add(comborole, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        jLabel8.setText("Create Your Password ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        signupbtn.setForeground(new java.awt.Color(0, 102, 255));
        signupbtn.setText("login");
        signupbtn.setBorder(null);
        signupbtn.setBorderPainted(false);
        signupbtn.setContentAreaFilled(false);
        signupbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });
        jPanel1.add(signupbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 60, -1));

        jSeparator6.setForeground(new java.awt.Color(51, 51, 255));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpasswordMousePressed

    }//GEN-LAST:event_txtpasswordMousePressed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed

    }//GEN-LAST:event_txtpasswordActionPerformed

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed

        UserModel user = new UserModel(txtname.getText(), txtsurnames.getText(), txtemail.getText(), txtpassword.getText(), comborole.getSelectedItem().toString());

        SignUpController sc = new SignUpController();

        String result = sc.signup(user);

        if (result.equals("ErrorName")) {
            JOptionPane.showMessageDialog(rootPane, "Fill in the Name field");
        } else if (result.equals("ErrorSurName")) {
            JOptionPane.showMessageDialog(rootPane, "Fill in the Last Name field");
        } else if (result.equals("ErrorEmail")) {
            JOptionPane.showMessageDialog(rootPane, "Fill in the Email field");
        } else if (result.equals("ErrorPassword")) {
            JOptionPane.showMessageDialog(rootPane, "Fill in the Password field");
        } else if (result.equals("ErrorRole")) {
            JOptionPane.showMessageDialog(rootPane, "Select the role");
        } else {
            clean();
            NewLogin lg = new NewLogin();
            lg.setVisible(true);
        }
    }//GEN-LAST:event_btnsignupActionPerformed

    private void comboroleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboroleActionPerformed
    }//GEN-LAST:event_comboroleActionPerformed

    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
        NewLogin lg = new NewLogin();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signupbtnActionPerformed

    private void txtnameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnameMousePressed

    }//GEN-LAST:event_txtnameMousePressed

    private void txtsurnamesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsurnamesMousePressed

    }//GEN-LAST:event_txtsurnamesMousePressed

    private void txtemailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtemailMousePressed

    }//GEN-LAST:event_txtemailMousePressed

    private void btnsignupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsignupMouseEntered
        btnsignup.setBackground(Color.black);
        btnsignup.setForeground(Color.red);
    }//GEN-LAST:event_btnsignupMouseEntered

    private void btnsignupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsignupMouseExited
        btnsignup.setBackground(Color.blue);
        btnsignup.setForeground(Color.white);
    }//GEN-LAST:event_btnsignupMouseExited

    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained
        if (txtname.getText().equals("Enter your name")) {
            txtname.setText("");
            txtname.setForeground(Color.black);
        }
        if (txtsurnames.getText().isEmpty()) {
            txtsurnames.setText("Enter your last name");
            txtsurnames.setForeground(Color.gray);
        }
        if (txtemail.getText().isEmpty()) {
            txtemail.setText("Enter your email");
            txtemail.setForeground(Color.gray);
        }

        if (txtpassword.getText().isEmpty()) {
            txtpassword.setText("********");
            txtpassword.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtnameFocusGained

    private void txtsurnamesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsurnamesFocusGained
        if (txtsurnames.getText().equals("Enter your last name")) {
            txtsurnames.setText("");
            txtsurnames.setForeground(Color.black);
        }
        if (txtname.getText().isEmpty()) {
            txtname.setText("Enter your name");
            txtname.setForeground(Color.gray);
        }

        if (txtemail.getText().isEmpty()) {
            txtemail.setText("Enter your email");
            txtemail.setForeground(Color.gray);
        }

        if (txtpassword.getText().isEmpty()) {
            txtpassword.setText("********");
            txtpassword.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtsurnamesFocusGained

    private void txtemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusGained
        if (txtemail.getText().equals("Enter your email")) {
            txtemail.setText("");
            txtemail.setForeground(Color.black);
        }

        if (txtname.getText().isEmpty()) {
            txtname.setText("Enter your name");
            txtname.setForeground(Color.gray);
        }
        if (txtsurnames.getText().isEmpty()) {
            txtsurnames.setText("Enter your last name");
            txtsurnames.setForeground(Color.gray);
        }
        if (txtpassword.getText().isEmpty()) {
            txtpassword.setText("********");
            txtpassword.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtemailFocusGained

    private void txtpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusGained
        if (txtpassword.getText().equals("********")) {
            txtpassword.setText("");
            txtpassword.setForeground(Color.black);
        }

        if (txtname.getText().isEmpty()) {
            txtname.setText("Enter your name");
            txtname.setForeground(Color.gray);
        }
        if (txtsurnames.getText().isEmpty()) {
            txtsurnames.setText("Enter your last name");
            txtsurnames.setForeground(Color.gray);
        }

        if (txtemail.getText().isEmpty()) {
            txtemail.setText("Enter your email");
            txtemail.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtpasswordFocusGained

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

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
            java.util.logging.Logger.getLogger(NewSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsignup;
    private javax.swing.JComboBox<String> comborole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton signupbtn;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtsurnames;
    // End of variables declaration//GEN-END:variables
//METODO LIMPIAR
    public void clean() {
        txtname.setText("");
        txtsurnames.setText("");
        txtemail.setText("");
        txtpassword.setText("");
    }
}
