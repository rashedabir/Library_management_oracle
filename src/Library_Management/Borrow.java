/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library_Management;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author rashe
 */
public class Borrow extends javax.swing.JInternalFrame {

    /**
     * Creates new form Borrow
     */
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Borrow() {
        initComponents();
        conn = My_CNX.getConnection();
        autoId();

        LocalDate today = LocalDate.now();
        LocalDate reday = today.plus(10, ChronoUnit.DAYS);
        issu.setText(today.toString());
        ret.setText(reday.toString());

        tablelord();

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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttype = new javax.swing.JTextField();
        txtmid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtbname = new javax.swing.JTextField();
        txtbtype = new javax.swing.JTextField();
        txtbid = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ret = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        issu = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtrno = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1110, 730));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Member Type");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 170, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Member Id");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 140, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, 40));

        txttype.setEditable(false);
        txttype.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttypeActionPerformed(evt);
            }
        });
        jPanel3.add(txttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 200, 40));

        txtmid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtmid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmidKeyReleased(evt);
            }
        });
        jPanel3.add(txtmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 200, 40));

        txtname.setEditable(false);
        txtname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel3.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 200, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 400, 270));

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Type");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 80, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Book Id");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 39, 110, 40));

        txtbname.setEditable(false);
        txtbname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(txtbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 210, 40));

        txtbtype.setEditable(false);
        txtbtype.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(txtbtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 210, 40));

        txtbid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtbid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbidKeyReleased(evt);
            }
        });
        jPanel4.add(txtbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 210, 40));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 360, 270));

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Return Date");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 160, 60));

        ret.setEditable(false);
        ret.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(ret, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 200, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Issue Date");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 60));

        issu.setEditable(false);
        issu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(issu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 200, 40));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 770, 60));

        jPanel6.setBackground(new java.awt.Color(102, 102, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Issue");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 220, 50));

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 220, 50));

        txtrno.setEditable(false);
        txtrno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel6.add(txtrno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, 50));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 260, 340));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new java.awt.BorderLayout());

        table.setBackground(new java.awt.Color(204, 204, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table);

        jPanel7.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 1040, 250));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1060, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void autoId() {
        try {

            String sql = "SELECT record_no  FROM booklend    ORDEr By record_no DESC";

            ps = (PreparedStatement) conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                String rnno = rs.getString("record_no");
                int co = rnno.length();
                String txt = rnno.substring(0, 2);
                String num = rnno.substring(2, co);
                int n = Integer.parseInt(num);
                n++;
                String snum = Integer.toString(n);
                String ftxt = txt + snum;
                txtrno.setText(ftxt);
            } else {
                txtrno.setText("RN1000");
            }

        } catch (NumberFormatException | SQLException e) {

            JOptionPane.showMessageDialog(rootPane, e);

        }

    }

    private void txttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttypeActionPerformed

    private void txtmidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmidKeyReleased

        try {

            String sql = "SELECT nam, typ FROM addmember WHERE mid='" + txtmid.getText() + "'";

            ps = (PreparedStatement) conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {

                txtname.setText(rs.getString("nam"));
                txttype.setText(rs.getString("typ"));

            } else {
                txtname.setText("");
                txttype.setText("");
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(rootPane, e);

        }


    }//GEN-LAST:event_txtmidKeyReleased

    private void txtbidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbidKeyReleased
        try {

            String sql = "SELECT nam, book_type FROM addbook WHERE book_id='" + txtbid.getText() + "'";

            ps = (PreparedStatement) conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {

                txtbname.setText(rs.getString("nam"));
                txtbtype.setText(rs.getString("book_type"));

            } else {
                txtbname.setText("");
                txtbtype.setText("");
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(rootPane, e);

        }
    }//GEN-LAST:event_txtbidKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String rno = txtrno.getText();
        String mid = txtmid.getText();
        String bid = txtbid.getText();
        String idate = issu.getText();
        String rdate = ret.getText();

        try {

            String sql = "INSERT INTO booklend(record_no, member_id, book_id, issue_date, return_date) VALUES ('" + rno + "','" + mid + "','" + bid + "','" + idate + "','" + rdate + "')";
            ps = conn.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(rootPane, "Successfully Insert");

        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(rootPane, e);

        }
        tablelord();
        autoId();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new Color(0,101,183));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new Color(0,101,183));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new Color(0,0,102));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(0,0,102));
    }//GEN-LAST:event_jButton1MouseExited

    private void tablelord() {

        try {

            String sql = "SELECT record_no, member_id, book_id, issue_date, return_date FROM booklend";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            table.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(rootPane, e);

        }

    }

    private void clear() {

        txtbid.setText("");
        txtmid.setText("");
        txtbname.setText("");
        txtname.setText("");
        txttype.setText("");
        txtbtype.setText("");

    }

    private void update() {

        try {

            String sql = "UPDATE addbook SET mark='1' WHERE book_id='" + txtbid.getText() + "'";
            ps = conn.prepareStatement(sql);
            ps.execute();

            JOptionPane.showMessageDialog(rootPane, "Update Successfully");
            tablelord();

        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(rootPane, e);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField issu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ret;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtbid;
    private javax.swing.JTextField txtbname;
    private javax.swing.JTextField txtbtype;
    private javax.swing.JTextField txtmid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtrno;
    private javax.swing.JTextField txttype;
    // End of variables declaration//GEN-END:variables
}