/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.gui;

import com.dienmaydo.entity.KhachHang;
import com.dienmaydo.service.KhachHangService;
import com.dienmaydo.utils.Msgbox;
import com.dienmaydo.utils.XImage;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DO TAT HOA
 */
public class KhachHangJframe extends javax.swing.JFrame {

    KhachHangService KHService = new KhachHangService();
    int row = -1;

    public static String maKH = null;
    public static String tenKH = null;

    /**
     * Creates new form KhachHangJframe
     */
    public KhachHangJframe() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        FillTable();
        rdoNam.setSelected(true);
        rdoConHoatDong.setSelected(true);
        
        setIconImage(new ImageIcon("./logos/Logo.jpg").getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Tabs = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQuanLyKhacHang = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtDienThoai = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        rdoConHoatDong = new javax.swing.JRadioButton();
        rdoNgungHoatDong = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Th??ng tin Kh??ch h??ng");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Tabs.setBackground(new java.awt.Color(255, 204, 0));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tblQuanLyKhacHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? KH", "T??n KH", "Gi???i t??nh", "S??T", "Email", "?????a ch???", "Tr???ng th??ii"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQuanLyKhacHang.setRowHeight(20);
        tblQuanLyKhacHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuanLyKhacHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQuanLyKhacHang);

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Ch???n");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("T??m ki???m:");

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtTimKiem)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        Tabs.addTab("Danh s??ch kh??ch h??ng", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("M?? kh??ch h??ng:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("T??n kh??ch h??ng:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Gi???i t??nh:");

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("N???");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("S??? ??i???n tho???i:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Email:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Tr???ng th??i:");

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        jScrollPane2.setViewportView(txtDiaChi);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("?????a ch???:");

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Th??m");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 204, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("S???a");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 204, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("L??m m???i");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdoConHoatDong);
        rdoConHoatDong.setText("C??n ho???t ?????ng");

        buttonGroup2.add(rdoNgungHoatDong);
        rdoNgungHoatDong.setText("Ng???ng ho???t ?????ng");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(rdoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoNu, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDienThoai, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTenKH, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMaKH, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(rdoConHoatDong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoNgungHoatDong)))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rdoConHoatDong)
                    .addComponent(rdoNgungHoatDong))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        Tabs.addTab("C???p nh???t kh??ch h??ng", jPanel5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tabs)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tabs)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        chonKhachHang();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
        timKiem();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        lamMoi();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tblQuanLyKhacHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuanLyKhacHangMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            row = tblQuanLyKhacHang.getSelectedRow();
            setForm();
            Tabs.setSelectedIndex(1);
            txtMaKH.setEditable(false);
        }
    }//GEN-LAST:event_tblQuanLyKhacHangMouseClicked

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
            java.util.logging.Logger.getLogger(KhachHangJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhachHangJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhachHangJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhachHangJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhachHangJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdoConHoatDong;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNgungHoatDong;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblQuanLyKhacHang;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtDienThoai;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
void FillTable() {
        DefaultTableModel model = (DefaultTableModel) tblQuanLyKhacHang.getModel();
        model.setRowCount(0);
        List<KhachHang> listKH = KHService.selectAll();
        for (KhachHang x : listKH) {
            model.addRow(new Object[]{
                x.getMaKH(), x.getTenKh(), x.isGioiTinh() ? "Nam" : "N???", x.getSDT(), x.getEmail(), x.getDiaChi(), x.isTrangthai() ? "C??n ho???t ?????ng" : "Ng???ng ho???t ?????ng"
            });
        }
    }

    void timKiem() {
        DefaultTableModel model = (DefaultTableModel) tblQuanLyKhacHang.getModel();
        model.setRowCount(0);
        List<KhachHang> listKH = KHService.selectByTimKiem(txtTimKiem.getText());
        for (KhachHang x : listKH) {
            model.addRow(new Object[]{
                x.getMaKH(), x.getTenKh(), x.isGioiTinh() ? "Nam" : "N???", x.getSDT(), x.getEmail(), x.getDiaChi(), x.isTrangthai() ? "C??n ho???t ?????ng" : "Ng???ng ho???t ?????ng"
            });
        }
    }

    void chonKhachHang() {
        row = tblQuanLyKhacHang.getSelectedRow();
        maKH = tblQuanLyKhacHang.getValueAt(row, 0).toString();
        tenKH = tblQuanLyKhacHang.getValueAt(row, 1).toString();
        dispose();
    }

    void insert() {
        KhachHang kh = getForm();
        try {
            String dinhDangEmail = "\\w+@\\w+(\\.\\w+){1,2}";
            String dinhDangSDT = "0\\d{9}";
            if (txtMaKH.getText().trim().equals("")) {
                Msgbox.alert(this, "Vui l??ng kh??ng b??? tr??ng ?? m?? kh??ch h??ng");
                return;
            } else if (txtTenKH.getText().trim().equals("")) {
                Msgbox.alert(this, "Vui l??ng kh??ng b??? tr??ng ?? t??n kh??ch h??ng");
                return;
            } else if (txtDienThoai.getText().trim().equals("")) {
                Msgbox.alert(this, "Vui l??ng kh??ng b??? tr??ng ?? ??i???n tho???i kh??ch h??ng");
                return;
            } else if (txtEmail.getText().trim().equals("")) {
                Msgbox.alert(this, "Vui l??ng kh??ng b??? tr??ng ?? email kh??ch h??ng");
                return;
            }else if (txtDiaChi.getText().trim().equals("")) {
                Msgbox.alert(this, "Vui l??ng kh??ng b??? tr??ng ?? ?????a ch??? kh??ch h??ng");
                return;
            } else if (!txtDienThoai.getText().matches(dinhDangSDT)) {
                Msgbox.alert(this, "Vui l??ng nh???p ????ng ?????nh d???ng s??? ??i???n tho???i");
                return;
            } else if (!txtEmail.getText().matches(dinhDangEmail)) {
                Msgbox.alert(this, "Vui l??ng nh???p ????ng ?????nh d???ng Email");
                return;
            }else if (checkTrung()) {
                Msgbox.alert(this, "M?? kh??ch h??ng ???? t???n t???i");
                return;
            }  else {
                KHService.insertData(kh);
                FillTable();
                lamMoi();
                Msgbox.alert(this, "Th??m kh??ch h??ng th??nh c??ng");
            }
        } catch (Exception e) {
            Msgbox.alert(this, "Th??m kh??ch h??ng th???t b???i!");
            e.printStackTrace();
        }
    }

    void update() {
        KhachHang kh = getForm();
        try {
            String dinhDangEmail = "\\w+@\\w+(\\.\\w+){1,2}";
            String dinhDangSDT = "0\\d{9}";
            if (txtMaKH.getText().trim().equals("")) {
                Msgbox.alert(this, "Vui l??ng kh??ng b??? tr??ng ?? m?? kh??ch h??ng");
                return;
            } else if (txtTenKH.getText().trim().equals("")) {
                Msgbox.alert(this, "Vui l??ng kh??ng b??? tr??ng ?? t??n kh??ch h??ng");
                return;
            } else if (txtDienThoai.getText().trim().equals("")) {
                Msgbox.alert(this, "Vui l??ng kh??ng b??? tr??ng ?? ??i???n tho???i kh??ch h??ng");
                return;
            } else if (txtEmail.getText().trim().equals("")) {
                Msgbox.alert(this, "Vui l??ng kh??ng b??? tr??ng ?? email kh??ch h??ng");
                return;
            } else if (txtDiaChi.getText().trim().equals("")) {
                Msgbox.alert(this, "Vui l??ng kh??ng b??? tr??ng ?? ?????a ch??? kh??ch h??ng");
                return;
            } else if (!txtDienThoai.getText().matches(dinhDangSDT)) {
                Msgbox.alert(this, "Vui l??ng nh???p ????ng ?????nh d???ng s??? ??i???n tho???i");
                return;
            } else if (!txtEmail.getText().matches(dinhDangEmail)) {
                Msgbox.alert(this, "Vui l??ng nh???p ????ng ?????nh d???ng Email");
                return;
            } else {
                KHService.updateData(kh);
                FillTable();
                Msgbox.alert(this, "S???a kh??ch h??ng th??nh c??ng");
            }
        } catch (Exception e) {
            Msgbox.alert(this, "S???a kh??ch h??ng th???t b???i!");
            e.printStackTrace();
        }
    }

    KhachHang getForm() {
        KhachHang kh = new KhachHang();
        kh.setMaKH(txtMaKH.getText());
        kh.setTenKh(txtTenKH.getText());
        kh.setSDT(txtDienThoai.getText());
        kh.setEmail(txtEmail.getText());
        kh.setTrangthai(rdoConHoatDong.isSelected());
        kh.setDiaChi(txtDiaChi.getText());
        kh.setGioiTinh(rdoNam.isSelected() ? true : false);
        return kh;
    }

    void setForm() {
        txtMaKH.setText(tblQuanLyKhacHang.getValueAt(row, 0) + "");
        txtTenKH.setText(tblQuanLyKhacHang.getValueAt(row, 1) + "");
        if (tblQuanLyKhacHang.getValueAt(row, 2).toString().equals("Nam")) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        txtDienThoai.setText(tblQuanLyKhacHang.getValueAt(row, 3) + "");
        txtEmail.setText(tblQuanLyKhacHang.getValueAt(row, 4) + "");
        txtDiaChi.setText(tblQuanLyKhacHang.getValueAt(row, 5) + "");
        if (tblQuanLyKhacHang.getValueAt(row, 6).toString().equals("C??n ho???t ?????ng")) {
            rdoConHoatDong.setSelected(true);
        } else {
            rdoNgungHoatDong.setSelected(true);
        }
    }

    boolean checkTrung(){
        boolean check = false;
        List<KhachHang> list = KHService.selectAll();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaKH().equalsIgnoreCase(txtMaKH.getText())) {
                check = true;
                break;
            }
        }
        return check;
    }
    
    void lamMoi() {
        txtMaKH.setText("");
        txtTenKH.setText("");
        txtDienThoai.setText("");
        txtEmail.setText("");
        rdoConHoatDong.setSelected(true);
        txtDiaChi.setText("");
        rdoNam.setSelected(true);
        row = -1;
        txtMaKH.setEditable(true);
    }
}
