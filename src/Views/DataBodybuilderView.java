/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controller.DataBodybuilderController;
import Model.BodybuilderModel;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DataBodybuilderView extends javax.swing.JFrame {

    int xMouse, yMouse;

    public DataBodybuilderView() {
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
        btnshowopen = new javax.swing.JButton();
        btnshowClassic = new javax.swing.JButton();
        btnshowmens = new javax.swing.JButton();
        btndeletebodybuilder = new javax.swing.JButton();
        btnupdatebodybuilder = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        btnshowdata = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

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

        btnshowopen.setText("Show Open");
        btnshowopen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnshowopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowopenActionPerformed(evt);
            }
        });

        btnshowClassic.setText("Show Classic");
        btnshowClassic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnshowClassic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowClassicActionPerformed(evt);
            }
        });

        btnshowmens.setText("Show Men´s");
        btnshowmens.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnshowmens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowmensActionPerformed(evt);
            }
        });

        btndeletebodybuilder.setText("Delete");
        btndeletebodybuilder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletebodybuilderActionPerformed(evt);
            }
        });

        btnupdatebodybuilder.setText("Update");
        btnupdatebodybuilder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatebodybuilderActionPerformed(evt);
            }
        });

        btnsearch.setText("Buscar");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        btnshowdata.setText("Show");
        btnshowdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowdataActionPerformed(evt);
            }
        });

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        btnback.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnback.setText("X");
        btnback.setBorder(null);
        btnback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnshowdata, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsearch)
                                .addGap(2, 2, 2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnshowopen, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnshowClassic, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnshowmens, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndeletebodybuilder, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnupdatebodybuilder, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(26, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnshowClassic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndeletebodybuilder)
                    .addComponent(btnupdatebodybuilder)
                    .addComponent(btnshowopen)
                    .addComponent(btnshowmens)
                    .addComponent(btnshowdata))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))
        );

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

    private void btnshowClassicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowClassicActionPerformed
        DefaultTableModel md = new DefaultTableModel();
        DataBodybuilderController dbc = new DataBodybuilderController();
        ResultSet rs = dbc.showDataBodybuilder("Select * from bodybuilder WHERE Category=2");
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
    }//GEN-LAST:event_btnshowClassicActionPerformed

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

    private void btndeletebodybuilderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletebodybuilderActionPerformed
        DataBodybuilderController dbc = new DataBodybuilderController();
        Boolean b = dbc.deleteBodybuilder(datatable.getValueAt(datatable.getSelectedRow(), 0).toString());

        int fila = datatable.getSelectedRowCount();
        if (fila < 1) {
            JOptionPane.showMessageDialog(null, "Selecione un Registro");
        } else {
            System.out.println(b);
            if (b != false) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                showData();

            }
        }
    }//GEN-LAST:event_btndeletebodybuilderActionPerformed

    private void btnupdatebodybuilderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatebodybuilderActionPerformed
        int fila = datatable.getSelectedRow();
        BodybuilderModel bodybuilder = new BodybuilderModel();
        DataBodybuilderController dbc = new DataBodybuilderController();

        bodybuilder.setId(Integer.parseInt(datatable.getValueAt(fila, 0).toString()));
        bodybuilder.setName(datatable.getValueAt(fila, 1).toString());
        bodybuilder.setAge(Integer.parseInt(datatable.getValueAt(fila, 2).toString()));
        bodybuilder.setHeight(Integer.parseInt(datatable.getValueAt(fila, 3).toString()));
        bodybuilder.setWeight(Double.parseDouble(datatable.getValueAt(fila, 4).toString()));
//        bodybuilder.setName(txtbuscar.getText());

        if (dbc.updateBodybuilder(bodybuilder)) {
            JOptionPane.showMessageDialog(null, "Registro Actualizado");
            showData();
        }
    }//GEN-LAST:event_btnupdatebodybuilderActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        DefaultTableModel md = new DefaultTableModel();
        DataBodybuilderController dbc = new DataBodybuilderController();
        ResultSet rs = dbc.showDataBodybuilder("SELECT * FROM bodybuilder WHERE Name LIKE '%" + txtbuscar.getText() + "%'");

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
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnshowdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowdataActionPerformed
        DefaultTableModel md = new DefaultTableModel();
        DataBodybuilderController dbc = new DataBodybuilderController();
        ResultSet rs = dbc.showDataBodybuilder("Select * from bodybuilder");
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

    }//GEN-LAST:event_btnshowdataActionPerformed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void btnbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseEntered
        btnback.setBackground(Color.red);
    }//GEN-LAST:event_btnbackMouseEntered

    private void btnbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseExited
        btnback.setBackground(Color.white);
    }//GEN-LAST:event_btnbackMouseExited

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

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
            java.util.logging.Logger.getLogger(DataBodybuilderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataBodybuilderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataBodybuilderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataBodybuilderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataBodybuilderView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btndeletebodybuilder;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnshowClassic;
    private javax.swing.JButton btnshowdata;
    private javax.swing.JButton btnshowmens;
    private javax.swing.JButton btnshowopen;
    private javax.swing.JButton btnupdatebodybuilder;
    public javax.swing.JTable datatable;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
 public void showData() {
        DefaultTableModel md = new DefaultTableModel();
        DataBodybuilderController dbc = new DataBodybuilderController();
        ResultSet rs = dbc.showDataBodybuilder("Select * from bodybuilder");
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
    }
}
