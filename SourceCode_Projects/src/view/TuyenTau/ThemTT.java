/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.TuyenTau;

import javax.swing.JOptionPane;
import model.TuyenTau;
import service.TuyenTauService;

/**
 *
 * @author nampr
 */
public class ThemTT extends javax.swing.JFrame {
    TuyenTauService ttService;
    TuyenTau tuyentau;
    /**
     * Creates new form ThemTT
     */
    public ThemTT() {
        initComponents();
        this.setLocationRelativeTo(null);
        ttService = new TuyenTauService();
        tuyentau = new TuyenTau();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMatt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtTentt = new javax.swing.JTextField();
        txtMacty = new javax.swing.JTextField();
        txtGaxp = new javax.swing.JTextField();
        txtGacuoi = new javax.swing.JTextField();
        txtLoaituyen = new javax.swing.JTextField();
        txtGiave = new javax.swing.JTextField();
        txtTinhtrang = new javax.swing.JTextField();
        txtTgbd = new javax.swing.JTextField();
        txtTgkt = new javax.swing.JTextField();
        txtTgcho = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnHuy = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TRANG THÊM TUYẾN TÀU CAO TỐC");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMatt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtMatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMattActionPerformed(evt);
            }
        });
        getContentPane().add(txtMatt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 400, 40));

        jButton1.setBackground(new java.awt.Color(52, 152, 219));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 800, 130, -1));

        txtTentt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtTentt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 400, 40));

        txtMacty.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtMacty, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 400, 40));

        txtGaxp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtGaxp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 400, 40));

        txtGacuoi.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtGacuoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 400, 40));

        txtLoaituyen.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtLoaituyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 400, 40));

        txtGiave.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtGiave, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 400, 40));

        txtTinhtrang.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtTinhtrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 560, 400, 40));

        txtTgbd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtTgbd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, 400, 40));

        txtTgkt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtTgkt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 680, 400, 40));

        txtTgcho.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtTgcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 740, 400, 40));

        jLabel13.setBackground(new java.awt.Color(52, 152, 219));
        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("THÊM THÔNG TIN TUYẾN TÀU CAO TỐC");
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 88));

        btnHuy.setBackground(new java.awt.Color(52, 152, 219));
        btnHuy.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Huỷ bỏ");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        getContentPane().add(btnHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 800, 130, -1));

        jLabel1.setBackground(new java.awt.Color(52, 152, 219));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Mã tuyến");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 130, 40));

        jLabel2.setBackground(new java.awt.Color(52, 152, 219));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  Tên tuyến");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 130, 40));

        jLabel3.setBackground(new java.awt.Color(52, 152, 219));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  Mã công ty");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 130, 40));

        jLabel4.setBackground(new java.awt.Color(52, 152, 219));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  Ga xuất phát");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 130, 40));

        jLabel6.setBackground(new java.awt.Color(52, 152, 219));
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("  Ga cuối");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 130, 40));

        jLabel7.setBackground(new java.awt.Color(52, 152, 219));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("  Loại tuyến");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 130, 40));

        jLabel8.setBackground(new java.awt.Color(52, 152, 219));
        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("  Giá vé");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 130, 40));

        jLabel9.setBackground(new java.awt.Color(52, 152, 219));
        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("  Tình trạng");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 130, 40));

        jLabel10.setBackground(new java.awt.Color(52, 152, 219));
        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("  TG bắt đầu");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 130, 40));

        jLabel11.setBackground(new java.awt.Color(52, 152, 219));
        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("  TG kết thúc");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 680, 130, 40));

        jLabel12.setBackground(new java.awt.Color(52, 152, 219));
        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("  TG chờ");
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 740, 130, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/emetro_img123.jpg"))); // NOI18N
        jLabel14.setToolTipText("");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMattActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMattActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tuyentau.setMaTT(txtMatt.getText());
        tuyentau.setTenTT(txtTentt.getText());
        tuyentau.setMaCty(txtMacty.getText());
        tuyentau.setGaBD(txtGaxp.getText());
        tuyentau.setGaCuoi(txtGacuoi.getText());
        tuyentau.setLoaiTuyen(txtLoaituyen.getText());
        tuyentau.setGiaTuyen(txtGiave.getText());
        tuyentau.setTinhTrang(txtTinhtrang.getText());
        tuyentau.setTGbatdau(txtTgbd.getText());
        tuyentau.setTGkethuc(txtTgkt.getText());
        tuyentau.setTGcho(txtTgcho.getText());

        ttService.addTT(tuyentau);
        
        String loaituyen = txtLoaituyen.getText();
        if("Tuyến Tốc Hành".equals(loaituyen)){
            tuyentau.setMaTT(txtMatt.getText());
            tuyentau.setDungtram(0);
            ttService.ThemTuyenTocHanh(tuyentau);
        }

        JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtGacuoi;
    private javax.swing.JTextField txtGaxp;
    private javax.swing.JTextField txtGiave;
    private javax.swing.JTextField txtLoaituyen;
    private javax.swing.JTextField txtMacty;
    private javax.swing.JTextField txtMatt;
    private javax.swing.JTextField txtTentt;
    private javax.swing.JTextField txtTgbd;
    private javax.swing.JTextField txtTgcho;
    private javax.swing.JTextField txtTgkt;
    private javax.swing.JTextField txtTinhtrang;
    // End of variables declaration//GEN-END:variables
}
