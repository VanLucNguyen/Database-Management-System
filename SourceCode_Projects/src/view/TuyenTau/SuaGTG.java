/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.TuyenTau;

import javax.swing.JOptionPane;
import model.GaTrungGian;
import service.GaTGService;

/**
 *
 * @author nampr
 */
public class SuaGTG extends javax.swing.JFrame {
    private GaTrungGian gatg;
    GaTGService gatgService;
    /**
     * Creates new form sua
     */
    public SuaGTG(String maGa) {
        gatgService = new GaTGService();
        gatg = gatgService.getGTGByMaGa(maGa);
        initComponents();
        this.setLocationRelativeTo(null);
        
        txtMaga.setText(gatg.getMaGa());
        txtMatuyen.setText(gatg.getMaTT());
        txtTGdung.setText(gatg.getThoiGianDung());

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        txtMaga = new javax.swing.JTextField();
        txtMatuyen = new javax.swing.JTextField();
        txtTGdung = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLuu = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EMETRO - TRANG SỬA GA TRUNG GIAN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(52, 152, 219));
        jLabel13.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("SỬA THÔNG TIN GA TRUNG GIAN");
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 75));

        txtMaga.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtMaga.setEnabled(false);
        txtMaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMagaActionPerformed(evt);
            }
        });
        getContentPane().add(txtMaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 135, 400, 38));

        txtMatuyen.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtMatuyen.setEnabled(false);
        txtMatuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatuyenActionPerformed(evt);
            }
        });
        getContentPane().add(txtMatuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 195, 400, 38));

        txtTGdung.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtTGdung, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 255, 400, 38));

        jLabel3.setBackground(new java.awt.Color(52, 152, 219));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Thời gian dừng");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 255, 140, 40));

        jLabel2.setBackground(new java.awt.Color(52, 152, 219));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  Mã tuyến");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 195, 140, 40));

        jLabel1.setBackground(new java.awt.Color(52, 152, 219));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Mã ga");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 135, 140, 40));

        btnLuu.setBackground(new java.awt.Color(52, 152, 219));
        btnLuu.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        getContentPane().add(btnLuu, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 343, 140, -1));

        btnHuy.setBackground(new java.awt.Color(52, 152, 219));
        btnHuy.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Huỷ bỏ");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        getContentPane().add(btnHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 343, 140, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/emetro18.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 700, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMagaActionPerformed

    private void txtMatuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatuyenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatuyenActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:        
        gatg.setMaTT(txtMatuyen.getText());
        gatg.setThoiGianDung(txtTGdung.getText());
        gatgService.updateGaTG(gatg);

        JOptionPane.showMessageDialog(rootPane, "Sửa thành công!");

        this.dispose();
    }//GEN-LAST:event_btnLuuActionPerformed

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
    private javax.swing.JButton btnLuu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtMaga;
    private javax.swing.JTextField txtMatuyen;
    private javax.swing.JTextField txtTGdung;
    // End of variables declaration//GEN-END:variables
}