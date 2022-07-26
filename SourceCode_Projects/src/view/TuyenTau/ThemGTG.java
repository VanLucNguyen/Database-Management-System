/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.TuyenTau;

import controller.ConnectionSQLServer;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.GaTrungGian;
import service.GaTGService;

/**
 *
 * @author nampr
 */
public class ThemGTG extends javax.swing.JFrame {
    GaTGService gatgService;
    GaTrungGian gatg;
    Connection cn = null;
    ResultSet rs = null;
    CallableStatement stored_pro = null;
    String loaituyen;
    String maTT;
    /**
     * Creates new form ThemTT
     */
    public ThemGTG(String matt) {
        initComponents();
        this.setLocationRelativeTo(null);
        maTT = matt;
        gatgService = new GaTGService();
        txtMatt.setText(matt);
        gatg = new GaTrungGian();
    }
    
    public void LayLoaiTuyen(String MaTT){
        try {
            cn = ConnectionSQLServer.getConnectionDB();
            String sql = "SELECT LOAI_TUYEN FROM TUYEN_TAU WHERE MA_TUYEN = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, MaTT);
            rs = pst.executeQuery();
            
            if(rs.next()){
                loaituyen = rs.getString("LOAI_TUYEN");
            }
        } catch (Exception e) {
        }
    }
    
    public void KtraDungTram(String MaTT){
        try {
            cn = ConnectionSQLServer.getConnectionDB();
            stored_pro = cn.prepareCall("{call PROC_DUNG_TRAM(?)}");
            stored_pro.setString(1, MaTT);
            rs = stored_pro.executeQuery();
            System.out.println(rs);
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "OK!");
                rs.close();
                stored_pro.close();
                cn.close(); 
            }
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMaga = new javax.swing.JTextField();
        txtMatt = new javax.swing.JTextField();
        txtTGdung = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EMETRO - TRANG THÊM GA TRUNG GIAN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMaga.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtMaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMagaActionPerformed(evt);
            }
        });
        getContentPane().add(txtMaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 400, 40));

        txtMatt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtMatt.setEnabled(false);
        getContentPane().add(txtMatt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 400, 40));

        txtTGdung.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtTGdung, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 400, 40));

        jLabel13.setBackground(new java.awt.Color(52, 152, 219));
        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("THÊM THÔNG TIN GA TRUNG GIAN");
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 88));

        jLabel1.setBackground(new java.awt.Color(52, 152, 219));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Mã ga");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 140, 40));

        jLabel2.setBackground(new java.awt.Color(52, 152, 219));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  Mã tuyến");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 140, 40));

        jLabel3.setBackground(new java.awt.Color(52, 152, 219));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Thời gian dừng");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 140, 40));

        btnThem.setBackground(new java.awt.Color(52, 152, 219));
        btnThem.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 343, 130, -1));

        btnHuy.setBackground(new java.awt.Color(52, 152, 219));
        btnHuy.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Huỷ bỏ");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        getContentPane().add(btnHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 343, 130, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/emetro18.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 700, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMagaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        gatg.setMaGa(txtMaga.getText());
        gatg.setMaTT(txtMatt.getText());
        gatg.setThoiGianDung(txtTGdung.getText());

        gatgService.addGaTG(gatg);
        
        LayLoaiTuyen(maTT);
        
        if("Tuyến Tốc Hành".equals(loaituyen)){
            KtraDungTram(maTT);
        }

        JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
        this.dispose();
    }//GEN-LAST:event_btnThemActionPerformed

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
    private javax.swing.JButton btnThem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtMaga;
    private javax.swing.JTextField txtMatt;
    private javax.swing.JTextField txtTGdung;
    // End of variables declaration//GEN-END:variables
}
