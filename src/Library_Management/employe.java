/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library_Management;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rashe
 */
public class employe extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public employe() {
        initComponents();
        conn = My_CNX.getConnection();
        tablelord();
        autoId();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        emid = new javax.swing.JTextField();
        na = new javax.swing.JTextField();
        nu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ad = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        sel = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        bday = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sel1 = new javax.swing.JComboBox<>();
        add1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Employe");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 250, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 1100, 100));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("       Address :");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 170, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("            Status :");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 180, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("           Name :");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 170, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("       Number :");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 170, 30));

        emid.setEditable(false);
        emid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(emid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 250, 40));

        na.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(na, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 250, 40));

        nu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(nu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 250, 40));

        ad.setColumns(20);
        ad.setRows(5);
        jScrollPane1.setViewportView(ad);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 250, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Employe ID :");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 170, 30));

        sel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Active", "Deactive" }));
        jPanel4.add(sel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 140, 40));

        add.setBackground(new java.awt.Color(0, 0, 102));
        add.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel4.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 240, 160, 40));
        jPanel4.add(bday, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 220, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Employe Type :");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 200, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date of Birth :");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 180, 40));

        sel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sel1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Supporter", "Manager", "Delivary man" }));
        jPanel4.add(sel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 140, 40));

        add1.setBackground(new java.awt.Color(0, 0, 102));
        add1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        add1.setForeground(new java.awt.Color(255, 255, 255));
        add1.setText("Update");
        add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add1MouseExited(evt);
            }
        });
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });
        jPanel4.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, 160, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1060, 290));

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 255));

        table.setBackground(new java.awt.Color(204, 204, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 1060, 270));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1080, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        String id = emid.getText();
        String name = na.getText();
        String num = nu.getText();
        String typ = sel1.getSelectedItem().toString();
        String add = ad.getText();
        String dob = ((JTextField) bday.getDateEditor().getUiComponent()).getText();
        String stat = sel.getSelectedItem().toString();

        if (id.equals("")) {
            JOptionPane.showMessageDialog(null, "ID is Empty");
        } else if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name is Empty");
        } else if (num.equals("")) {
            JOptionPane.showMessageDialog(null, "Number is Empty");
        } else if (typ.equals("")) {
            JOptionPane.showMessageDialog(null, "Type is Empty");
        } else if (add.equals("")) {
            JOptionPane.showMessageDialog(null, "Address is Empty");
        } else if (dob.equals("")) {
            JOptionPane.showMessageDialog(null, "D.O.B is Empty");
        } else if (stat.equals("")) {
            JOptionPane.showMessageDialog(null, "Status is Empty");
        } else {
            try {

                String sql = "INSERT INTO employe(emp_id, emp_name, emp_num, emp_typ, emp_add, dob, stats) VALUES (?,?,?,?,?,?,?)";
                ps = conn.prepareStatement(sql);
                ps.setString(1, id);
                ps.setString(2, name);
                ps.setString(3, num);
                ps.setString(4, typ);
                ps.setString(5, add);
                ps.setString(6, dob);
                ps.setString(7, stat);
                ps.execute();
                JOptionPane.showMessageDialog(rootPane, "Successfully Insert");

            } catch (HeadlessException | SQLException e) {

                JOptionPane.showMessageDialog(rootPane, e);

            }
            autoId();
            clearFild();
            tablelord();
        }


    }//GEN-LAST:event_addActionPerformed

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered

        add.setBackground(new Color(0, 101, 183));


    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited

        add.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_addMouseExited

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
        int selectrowindex = table.getSelectedRow();

        emid.setText(tmodel.getValueAt(selectrowindex, 0).toString());
        na.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        nu.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        ((JTextField) bday.getDateEditor().getUiComponent()).setText(tmodel.getValueAt(selectrowindex, 5).toString());
        sel1.setSelectedItem(tmodel.getValueAt(selectrowindex, 3).toString());
        sel.setSelectedItem(tmodel.getValueAt(selectrowindex, 6).toString());
        ad.setText(tmodel.getValueAt(selectrowindex, 4).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void add1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseEntered
        add1.setBackground(new Color(0, 101, 183));

    }//GEN-LAST:event_add1MouseEntered

    private void add1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseExited
        add1.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_add1MouseExited

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed

        String id = emid.getText();
        String name = na.getText();
        String nub = nu.getText();
        String typ = sel1.getSelectedItem().toString();
        String addr = ad.getText();
        String date = ((JTextField) bday.getDateEditor().getUiComponent()).getText();
        String stat = sel.getSelectedItem().toString();

        if (id.equals("")) {
            JOptionPane.showMessageDialog(null, "ID is Empty");
        } else if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name is Empty");
        } else if (nub.equals("")) {
            JOptionPane.showMessageDialog(null, "Number is Empty");
        } else if (typ.equals("")) {
            JOptionPane.showMessageDialog(null, "Type is Empty");
        } else if (addr.equals("")) {
            JOptionPane.showMessageDialog(null, "Address is Empty");
        } else if (date.equals("")) {
            JOptionPane.showMessageDialog(null, "D.O.B is Empty");
        } else if (stat.equals("")) {
            JOptionPane.showMessageDialog(null, "Status is Empty");
        } else {
            try {

                String sql = "UPDATE employe SET emp_name='" + name + "',emp_num='" + nub + "',emp_typ='" + typ + "',emp_add='" + addr + "',dob='" + date + "',stats='" + stat + "' WHERE emp_id='" + id + "'";
                ps = conn.prepareStatement(sql);
                ps.execute();

                JOptionPane.showMessageDialog(rootPane, "Update Successfully");
                tablelord();
                clearFild();

            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }


    }//GEN-LAST:event_add1ActionPerformed

    private void tablelord() {

        try {

            String sql = "SELECT emp_id, emp_name, emp_num, emp_typ, emp_add, dob, stats FROM employe";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            table.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(rootPane, e);

        }

    }

    private void autoId() {
        try {

            String sql = "SELECT emp_id  FROM employe    ORDEr By emp_id DESC";

            ps = (PreparedStatement) conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                String rnno = rs.getString("emp_id");
                int co = rnno.length();
                String txt = rnno.substring(0, 2);
                String num = rnno.substring(2, co);
                int n = Integer.parseInt(num);
                n++;
                String snum = Integer.toString(n);
                String ftxt = txt + snum;
                emid.setText(ftxt);
            } else {
                emid.setText("EM1000");
            }

        } catch (NumberFormatException | SQLException e) {

            JOptionPane.showMessageDialog(rootPane, e);

        }

    }

    private void clearFild() {

        //  mid.setText("");
        na.setText("");
        nu.setText("");
        sel.setSelectedIndex(0);
        sel1.setSelectedIndex(0);
        ad.setText("");
        ((JTextField) bday.getDateEditor().getUiComponent()).setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ad;
    private javax.swing.JButton add;
    private javax.swing.JButton add1;
    private com.toedter.calendar.JDateChooser bday;
    private javax.swing.JTextField emid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField na;
    private javax.swing.JTextField nu;
    private javax.swing.JComboBox<String> sel;
    private javax.swing.JComboBox<String> sel1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
