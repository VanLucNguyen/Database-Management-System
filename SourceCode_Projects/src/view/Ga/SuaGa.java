/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Ga;

import javax.swing.JOptionPane;
import model.Ga;
import service.GaService;

/**
 *
 * @author nampr
 */
public class SuaGa extends javax.swing.JFrame {
    Ga ga;
    GaService gaServices;

    /**
     * Creates new form CapnhatgaFrm
     */
    public SuaGa(String MaGa) {
        ga= new Ga();
        gaServices= new GaService();
        ga = gaServices.getGabymaga(MaGa); 
        initComponents();
        this.setLocationRelativeTo(null);
        txtMaGa.setText(ga.getMaGa());
        txtTenGa.setText(ga.getTenGa());
        txtVitri.setText(ga.getVitri());
        txtTTGa.setText(ga.getTTGa());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTTGa = new javax.swing.JTextField();
        txtVitri = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtMaGa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbMaGa = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenGa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TRANG SỬA GA TÀU CAO TỐC");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTTGa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtTTGa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 258, 40));

        txtVitri.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtVitri, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 258, 40));

        btnLuu.setBackground(new java.awt.Color(52, 152, 219));
        btnLuu.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        getContentPane().add(btnLuu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 130, -1));

        btnHuy.setBackground(new java.awt.Color(52, 152, 219));
        btnHuy.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Huỷ bỏ");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        getContentPane().add(btnHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 130, 40));

        jLabel5.setBackground(new java.awt.Color(52, 152, 219));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SỬA THÔNG TIN GA TÀU CAO TỐC");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 88));

        txtMaGa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtMaGa.setEnabled(false);
        getContentPane().add(txtMaGa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 258, 40));

        jLabel3.setBackground(new java.awt.Color(52, 152, 219));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("  Tình trạng ga");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 130, 40));

        jLabel2.setBackground(new java.awt.Color(52, 152, 219));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("  Tên ga");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 130, 40));

        lbMaGa.setBackground(new java.awt.Color(52, 152, 219));
        lbMaGa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbMaGa.setForeground(new java.awt.Color(255, 255, 255));
        lbMaGa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbMaGa.setText("  Mã ga");
        lbMaGa.setOpaque(true);
        getContentPane().add(lbMaGa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 130, 40));

        jLabel4.setBackground(new java.awt.Color(52, 152, 219));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("  Vị trí");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 130, 40));

        txtTenGa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtTenGa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 258, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/emetro5.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        ga.setTenGa(txtTenGa.getText());
        ga.setVitri(txtVitri.getText());
        ga.setTinhTrangGa(txtTTGa.getText());

        JOptionPane.showMessageDialog(rootPane, "Sửa thành công!");

        gaServices.updateGa(ga);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        this.dispose();
        // TODO add your handling code here:
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbMaGa;
    private javax.swing.JTextField txtMaGa;
    private javax.swing.JTextField txtTTGa;
    private javax.swing.JTextField txtTenGa;
    private javax.swing.JTextField txtVitri;
    // End of variables declaration//GEN-END:variables
}