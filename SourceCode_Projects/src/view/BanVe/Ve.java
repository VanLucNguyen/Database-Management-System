/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.BanVe;

import controller.ConnectionSQLServer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.sql.Date;
import model.ThongTinVe;
import model.TuyenTau;
import service.BanVeService;

/**
 *
 * @author Luc
 */
public class Ve extends javax.swing.JFrame {
    private TuyenTau tuyentau;
    BanVeService banveService;
    DefaultTableModel defaultTableModel;   
    ThongTinVe thongtinve;
    
    public Ve(String MaTuyen) {
        initComponents();
        //ChonLoaiVe();
        ChonDoiTuong();
        banveService = new BanVeService();
        thongtinve = new ThongTinVe();
        tuyentau = banveService.getTuyenTauByMaTuyen(MaTuyen);
        this.setLocationRelativeTo(null);
        
        txtMaTuyen.setText(tuyentau.getMaTT());
        txtTenTuyen.setText(tuyentau.getTenTT());
        txtTGDi.setText(tuyentau.getTGbatdau());
        txtTGDen.setText(tuyentau.getTGkethuc());
        
         defaultTableModel = new DefaultTableModel(){    
            @Override
            public boolean isCellEditable(int row, int column){
            return false;
            }
        };
        
        KHTable.setModel(defaultTableModel);
        defaultTableModel.addColumn("Mã Khách Hàng");
        defaultTableModel.addColumn("Họ Tên");
        defaultTableModel.addColumn("Loại Khách Hàng"); 
        defaultTableModel.addColumn("Mã Vé");
                       
        setTableData(banveService.getAllKhachHang());       
    }
    
    private void setTableData(List<ThongTinVe> thongTinVe){
        for (ThongTinVe thongtinve : thongTinVe){
            defaultTableModel.addRow(new Object[]{thongtinve.getMaKhachHang(),thongtinve.getTenKhachHang(),
                thongtinve.getLoaiKhachHang(),thongtinve.getMaVe(),thongtinve.getMaKM()});
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtCMND = new javax.swing.JTextField();
        jcbLoaiVe = new javax.swing.JComboBox<>();
        jcbDoiTuong = new javax.swing.JComboBox<>();
        btnXacNhan = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        KHTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtMaTuyen = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTenTuyen = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTGDen = new javax.swing.JTextField();
        txtTGDi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtMaVe = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EMETRO - TRANG NHẬP THÔNG TIN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(52, 152, 219));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NHẬP THÔNG TIN KHÁCH HÀNG");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 66));

        jLabel2.setBackground(new java.awt.Color(52, 152, 219));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  Họ Và Tên");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 160, 30));

        jLabel3.setBackground(new java.awt.Color(52, 152, 219));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  Số Điện Thoại");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 194, 30));

        jLabel4.setBackground(new java.awt.Color(52, 152, 219));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  CMND/CCCD");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 194, 30));

        jLabel5.setBackground(new java.awt.Color(52, 152, 219));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("  Loại Vé");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 160, 30));

        jLabel6.setBackground(new java.awt.Color(52, 152, 219));
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("  Đối Tượng");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 194, 30));

        txtTenKH.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtTenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 300, -1));

        txtSDT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 300, -1));

        txtCMND.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCMND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCMNDActionPerformed(evt);
            }
        });
        getContentPane().add(txtCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 300, -1));

        jcbLoaiVe.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jcbLoaiVe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Loại Vé", "Vé Thường", "Vé Tháng" }));
        jcbLoaiVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbLoaiVeActionPerformed(evt);
            }
        });
        getContentPane().add(jcbLoaiVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 300, 30));

        jcbDoiTuong.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jcbDoiTuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Loại Đối Tượng" }));
        jcbDoiTuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDoiTuongActionPerformed(evt);
            }
        });
        getContentPane().add(jcbDoiTuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 310, 300, -1));

        btnXacNhan.setBackground(new java.awt.Color(52, 152, 219));
        btnXacNhan.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        btnXacNhan.setText("Xác Nhận");
        btnXacNhan.setBorderPainted(false);
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });
        getContentPane().add(btnXacNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 680, -1, 50));

        jLabel7.setBackground(new java.awt.Color(52, 152, 219));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("  Mã Khách Hàng");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 160, 30));

        txtMaKH.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtMaKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 300, -1));

        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        KHTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Khách Hàng", "Tên Khách Hàng", "Loai Khách Hàng", "Mã Vé"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(KHTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 622, 170));

        jLabel8.setBackground(new java.awt.Color(52, 152, 219));
        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("  Mã Tuyến");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 160, 30));

        txtMaTuyen.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtMaTuyen.setEnabled(false);
        txtMaTuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaTuyenActionPerformed(evt);
            }
        });
        getContentPane().add(txtMaTuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 300, -1));

        jLabel9.setBackground(new java.awt.Color(52, 152, 219));
        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("  Tên Tuyến");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 194, 30));

        txtTenTuyen.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtTenTuyen.setEnabled(false);
        getContentPane().add(txtTenTuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 300, -1));

        jLabel10.setBackground(new java.awt.Color(52, 152, 219));
        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" Thời Gian Bắt Đầu");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 160, 30));

        jLabel11.setBackground(new java.awt.Color(52, 152, 219));
        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("  Thời Gian Kết Thúc");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 194, 30));

        txtTGDen.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtTGDen.setEnabled(false);
        txtTGDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTGDenActionPerformed(evt);
            }
        });
        getContentPane().add(txtTGDen, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, 300, -1));

        txtTGDi.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtTGDi.setEnabled(false);
        txtTGDi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTGDiActionPerformed(evt);
            }
        });
        getContentPane().add(txtTGDi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 300, -1));

        jLabel12.setBackground(new java.awt.Color(52, 152, 219));
        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("  Mã Vé");
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 160, 30));

        txtMaVe.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtMaVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaVeActionPerformed(evt);
            }
        });
        getContentPane().add(txtMaVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 300, -1));

        jLabel13.setBackground(new java.awt.Color(52, 152, 219));
        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("  Mã Nhân Viên");
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 194, 30));

        txtMaNV.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, 300, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/emetro14.jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 1110, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
             
        String loaidt = (String) jcbDoiTuong.getSelectedItem();
        thongtinve.setMaKhachHang(txtMaKH.getText());
        thongtinve.setTenKhachHang(txtTenKH.getText());
        thongtinve.setCMND(txtCMND.getText());
        thongtinve.setSDT(txtSDT.getText());
        thongtinve.setLoaiKhachHang((String)jcbDoiTuong.getSelectedItem());
        
        banveService.ThemKhachHang(thongtinve);
        
         thongtinve.setMaVe(txtMaVe.getText());
        thongtinve.setTriGia("0");
        thongtinve.setMaTuyen(txtMaTuyen.getText());
        thongtinve.setNgayMua(Date.valueOf(LocalDate.now()));
        thongtinve.setMaKM(banveService.getMaKMByLoaiKH(loaidt));
        thongtinve.setMaKhachHang(txtMaKH.getText());
        thongtinve.setMaNV(txtMaNV.getText());
        thongtinve.setLoaiVe((String) jcbLoaiVe.getSelectedItem());
        
        banveService.ThemVe(thongtinve); 
        
        System.out.println(thongtinve.getMaKM());
        String mave = txtMaVe.getText();
        String makh = txtMaKH.getText();
        String tenkh = txtTenKH.getText();
        String sdt = txtSDT.getText();
        String loaive = (String) jcbLoaiVe.getSelectedItem();
        String cmnd = txtCMND.getText();
        String thoigiandi = txtTGDi.getText();
        String tentuyen = txtTenTuyen.getText();
        HoaDon hoadon = new HoaDon(mave,makh,tenkh,sdt,loaive,loaidt,cmnd,thoigiandi,tentuyen);
        hoadon.setVisible(true);
        this.dispose();    
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void txtCMNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCMNDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCMNDActionPerformed

    private void jcbDoiTuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDoiTuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbDoiTuongActionPerformed

    private void txtTGDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTGDenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTGDenActionPerformed

    private void jcbLoaiVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbLoaiVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbLoaiVeActionPerformed

    private void txtMaVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaVeActionPerformed

    private void txtTGDiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTGDiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTGDiActionPerformed

    private void txtMaTuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaTuyenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaTuyenActionPerformed
    /*public void ChonLoaiVe(){
        try {
            Connection connection = (Connection) ConnectionUntil.getConnection();
        
            String sql = "SELECT DISTINCT LOAI_VE FROM VE"; 
        
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next())
            {
                jcbLoaiVe.addItem(rs.getString("LOAI_VE"));
            }
            }catch(Exception e){
            e.printStackTrace();
            }
    }*/
    
    public void ChonDoiTuong(){
        try {
            Connection connection = (Connection) ConnectionSQLServer.getConnectionDB();
        
            String sql = "SELECT LOAI_DT FROM KHUYEN_MAI"; 
        
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next())
            {
                jcbDoiTuong.addItem(rs.getString("LOAI_DT"));
            }
            }catch(Exception e){
            e.printStackTrace();
            }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable KHTable;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbDoiTuong;
    private javax.swing.JComboBox<String> jcbLoaiVe;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaTuyen;
    private javax.swing.JTextField txtMaVe;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTGDen;
    private javax.swing.JTextField txtTGDi;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTenTuyen;
    // End of variables declaration//GEN-END:variables
}