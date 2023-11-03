/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view;

import com.controller.ControllerAdmin;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class MemberGUI extends javax.swing.JFrame {

    final String userId;
    final ArrayList<String> radioKaryawan;
    
    public MemberGUI(String userId) throws SQLException {
        initComponents();
        setTableContent();
        this.radioKaryawan = setRadioKaryawan();
        setLocationRelativeTo(null);
        setResizable(false);
        tableBuku.getTableHeader().setReorderingAllowed(false);
        tableRiwayat.getTableHeader().setReorderingAllowed(false);
        setTxtEnable(false);
        this.userId = userId;
    }
    
    private void setTxtEnable(boolean choose){
        txtJudul.setEnabled(choose);
        txtKode.setEnabled(choose);
        txtPenulis.setEnabled(choose);
        txtStatus.setEnabled(choose);
    }
    
    private void clearField(){
        txtJudul.setText("");
        txtKode.setText("");
        txtPenulis.setText("");
        txtStatus.setText("");
    }
    
    private ArrayList<String> setRadioKaryawan() throws SQLException{
        ArrayList<String> idPenanggungjawab = ControllerAdmin.setRadioId();
        for (String string : idPenanggungjawab) {
            comboKaryawan.addItem(string);
            
        }return idPenanggungjawab;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        setterPanel = new javax.swing.JPanel();
        panelTabelBuku = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBuku = new javax.swing.JTable();
        panelRiwayat = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableRiwayat = new javax.swing.JTable();
        txtKode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPenulis = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        btnKembali = new javax.swing.JButton();
        btnPinjam = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboKaryawan = new javax.swing.JComboBox<>();
        btnRiwayat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Member Menu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(97, 130, 100));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setterPanel.setLayout(new java.awt.CardLayout());

        panelTabelBuku.setLayout(new java.awt.CardLayout());

        tableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                " Kode Buku", "Judul Buku", "Penulis Buku", "Status Buku"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBuku);

        panelTabelBuku.add(jScrollPane1, "card2");

        setterPanel.add(panelTabelBuku, "card2");

        panelRiwayat.setLayout(new java.awt.CardLayout());

        tableRiwayat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PEMINJAMAN", "USER ID", "KODE BUKU", "TANGGAL PEMINJAMAN", "ID KARYAWAN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableRiwayat);

        panelRiwayat.add(jScrollPane2, "card2");

        setterPanel.add(panelRiwayat, "card3");

        mainPanel.add(setterPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 640, 230));
        mainPanel.add(txtKode, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 170, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Karyawan");
        mainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Judul Buku");
        mainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        mainPanel.add(txtJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 170, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Penulis Buku");
        mainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        mainPanel.add(txtPenulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 170, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Status Buku");
        mainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        mainPanel.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 170, -1));

        btnKembali.setBackground(new java.awt.Color(176, 217, 177));
        btnKembali.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(0, 51, 51));
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        mainPanel.add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 100, -1));

        btnPinjam.setBackground(new java.awt.Color(176, 217, 177));
        btnPinjam.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnPinjam.setForeground(new java.awt.Color(0, 51, 51));
        btnPinjam.setText("Pinjam");
        btnPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPinjamActionPerformed(evt);
            }
        });
        mainPanel.add(btnPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 100, 30));

        btnLogOut.setBackground(new java.awt.Color(176, 217, 177));
        btnLogOut.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(0, 51, 51));
        btnLogOut.setText("LOGOUT");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        mainPanel.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kode Buku");
        mainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        comboKaryawan.setEnabled(false);
        mainPanel.add(comboKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 170, -1));

        btnRiwayat.setBackground(new java.awt.Color(176, 217, 177));
        btnRiwayat.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnRiwayat.setForeground(new java.awt.Color(0, 51, 51));
        btnRiwayat.setText("Riwayat");
        btnRiwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRiwayatActionPerformed(evt);
            }
        });
        mainPanel.add(btnRiwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 100, 30));

        getContentPane().add(mainPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBukuMouseClicked
        comboKaryawan.setEnabled(true);
        int chooseRow = tableBuku.getSelectedRow();
        Object selectedRow = tableBuku.getValueAt(chooseRow, 0);
        String[] rowData = ControllerAdmin.setTextFieldBuku(selectedRow);
        txtKode.setText(rowData[0]);
        txtJudul.setText(rowData[1]);
        txtPenulis.setText(rowData[2]);
        txtStatus.setText(rowData[3]);
    }//GEN-LAST:event_tableBukuMouseClicked

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        setterPanel.removeAll();
        setterPanel.repaint();
        setterPanel.revalidate();
        setterPanel.add(panelTabelBuku);
        setterPanel.repaint();
        setterPanel.revalidate();
        clearField();
        comboKaryawan.setEnabled(false);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPinjamActionPerformed
        int chooseRow = tableBuku.getSelectedRow();
        if (this.radioKaryawan == null) {
            JOptionPane.showMessageDialog(null, "Belum Ada Karyawan Bertugas, Harap Tambahkan Terlebih Dahulu");
        }else if (chooseRow == -1) {
                JOptionPane.showMessageDialog(null, "HARAP PILIH DATA BUKU YANG INGIN DI PINJAM DI TABLE BAWAH");
        }else{
            try {
                if (txtStatus.getText().equals("Tidak Tersedia")) {
                    JOptionPane.showMessageDialog(null, "BUKU TIDAK TERSEDIA");
                    clearField();
                }else{
                    ControllerAdmin.createRiwayatPeminjaman(txtKode.getText(),this.userId,comboKaryawan.getSelectedItem());
                    JOptionPane.showMessageDialog(null, "BUKU BERHASIL DIPINJAM");
                    clearField();
                }
            } catch (SQLException ex) {
                Logger.getLogger(MemberGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnPinjamActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        int answer = JOptionPane.showConfirmDialog(null, "APAKAH ANDA YAKIN ?");
        if (answer == 1 || answer == 2 || answer == -1) {
            
        }else{
           this.dispose(); 
           new LoginGUI().setVisible(true);
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int confirm = JOptionPane.showConfirmDialog(null, "ANDA YAKIN INGIN KELUAR","Konfirmasi Keluar",JOptionPane.YES_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnRiwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRiwayatActionPerformed
        setterPanel.removeAll();
        setterPanel.repaint();
        setterPanel.revalidate();
        setterPanel.add(panelRiwayat);
        setterPanel.repaint();
        setterPanel.revalidate();
        try {
            DefaultTableModel modelRiwayat = (DefaultTableModel) tableRiwayat.getModel();
            modelRiwayat.setRowCount(0);
            ArrayList<Object[]> dataPeminjamById = ControllerAdmin.getRiwayatById(this.userId);
            for (Object[] peminjaman : dataPeminjamById) {
                modelRiwayat.addRow(peminjaman);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MemberGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRiwayatActionPerformed

    private void setTableContent(){
        try {
            DefaultTableModel tableModelBuku = (DefaultTableModel) tableBuku.getModel();
            tableModelBuku.setRowCount(0);
            ArrayList<Object> tableContent= ControllerAdmin.createTableContent("buku");
            ArrayList<String[]> barisBuku = ControllerAdmin.showTableContent(tableContent);
            for (String[] strings : barisBuku) {
                tableModelBuku.addRow(strings);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(MemberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MemberGUI("Guest").setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MemberGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnPinjam;
    private javax.swing.JButton btnRiwayat;
    private javax.swing.JComboBox<String> comboKaryawan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelRiwayat;
    private javax.swing.JPanel panelTabelBuku;
    private javax.swing.JPanel setterPanel;
    private javax.swing.JTable tableBuku;
    private javax.swing.JTable tableRiwayat;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtPenulis;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}