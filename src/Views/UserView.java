/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controller.DataBodybuilderController;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class UserView extends javax.swing.JFrame {

    public UserView() {
        initComponents();

        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datatable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnshowclassic = new javax.swing.JButton();
        btnshowopen = new javax.swing.JButton();
        btnshowmens = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        datatable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(datatable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BODYBUILDERS");

        btnshowclassic.setText("Show Classic");
        btnshowclassic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowclassicActionPerformed(evt);
            }
        });

        btnshowopen.setText("Show Open");
        btnshowopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowopenActionPerformed(evt);
            }
        });

        btnshowmens.setText("Show Men´s");
        btnshowmens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowmensActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(140, 140, 140))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnshowclassic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnshowopen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnshowmens)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnshowclassic)
                    .addComponent(btnshowopen)
                    .addComponent(btnshowmens))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnshowopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowopenActionPerformed
           DefaultTableModel md = new DefaultTableModel();
        DataBodybuilderController dbc = new DataBodybuilderController();
        ResultSet rs = dbc.showDataBodybuilder("Select * from bodybuilder WHERE Category=1");
        md.setColumnIdentifiers(new Object[]{
            "Id", "Name", "Age", "Height", "Weight"
        });

        try {
            while (rs.next()) {
                md.addRow(new Object[]{
                    rs.getInt("Id"), rs.getString("Name"), rs.getInt("Age"), rs.getInt("Height"), rs.getDouble("Weight")});
            }

            datatable.setModel(md);

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnshowopenActionPerformed

    private void btnshowclassicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowclassicActionPerformed
          DefaultTableModel md = new DefaultTableModel();
        DataBodybuilderController dbc = new DataBodybuilderController();
        ResultSet rs = dbc.showDataBodybuilder("Select * from bodybuilder WHERE Category=1");
        md.setColumnIdentifiers(new Object[]{
            "Id", "Name", "Age", "Height", "Weight"
        });

        try {
            while (rs.next()) {
                md.addRow(new Object[]{
                    rs.getInt("Id"), rs.getString("Name"), rs.getInt("Age"), rs.getInt("Height"), rs.getDouble("Weight")});
            }

            datatable.setModel(md);

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnshowclassicActionPerformed

    private void btnshowmensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowmensActionPerformed
            DefaultTableModel md = new DefaultTableModel();
        DataBodybuilderController dbc = new DataBodybuilderController();
        ResultSet rs = dbc.showDataBodybuilder("Select * from bodybuilder WHERE Category=3");
        md.setColumnIdentifiers(new Object[]{
            "Id", "Name", "Age", "Height", "Weight"
        });

        try {
            while (rs.next()) {
                md.addRow(new Object[]{
                    rs.getInt("Id"), rs.getString("Name"), rs.getInt("Age"), rs.getInt("Height"), rs.getDouble("Weight")});
            }

            datatable.setModel(md);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnshowmensActionPerformed

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
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnshowclassic;
    private javax.swing.JButton btnshowmens;
    private javax.swing.JButton btnshowopen;
    private javax.swing.JTable datatable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
 public void showData() {
        DefaultTableModel md = new DefaultTableModel();
        DataBodybuilderController dbc = new DataBodybuilderController();
        ResultSet rs = dbc.showDataBodybuilder("Select * from bodybuilder");
        md.setColumnIdentifiers(new Object[]{
            "Name", "Age", "Height", "Weight"
        });

        try {
            while (rs.next()) {
                md.addRow(new Object[]{
                    rs.getString("Name"), rs.getInt("Age"), rs.getInt("Height"), rs.getDouble("Weight")});
            }

            datatable.setModel(md);

        } catch (Exception e) {
        }
    }
}
