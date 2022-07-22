/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.CongTy;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CongTy;
import service.CongTyService;
import view.DangNhap.TrangChonQL;

/**
 *
 * @author nampr
 */
public class TrangQLCTy extends javax.swing.JFrame {
    CongTyService congtyService;
    DefaultTableModel tblModel;
    List<CongTy> congTy = new ArrayList<CongTy>();
    /**
     * Creates new form QuanLyCongTy
     */
    public TrangQLCTy() {
        initComponents();    
        congtyService = new CongTyService();
        this.setLocationRelativeTo(null);
        
        tblModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
        
        CongTyTable.setModel(tblModel);
        tblModel.addColumn("MA_CTY");
        tblModel.addColumn("TEN_CTY");
        tblModel.addColumn("WEBSITE");
        tblModel.addColumn("DIA_CHI");
        tblModel.addColumn("SDT");                       
        
        setTableData(congtyService.getAllCongTy()); 
        
    }
    
    private void setTableData(List<CongTy> congTy){
        for (CongTy congty : congTy){
            tblModel.addRow(new Object[]{congty.getMaCTy(), congty.getTenCTy(), 
                                congty.getDCWeb(), congty.getDiaChi(), congty.getSDT()});
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
        jScrollPane1 = new javax.swing.JScrollPane();
        CongTyTable = new javax.swing.JTable();
        btnOut = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnTraCuu = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EMETRO - TRANG QUẢN LÝ CÔNG TY TÀU CAO TỐC");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(52, 152, 219));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ THÔNG TIN CÔNG TY TÀU CAO TỐC");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 100));

        CongTyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Công Ty", "Tên Công Ty", "Địa chỉ Web", "Địa Chỉ ", "Số Điện Thoại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        CongTyTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(CongTyTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 640, 340));

        btnOut.setBackground(new java.awt.Color(52, 152, 219));
        btnOut.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnOut.setForeground(new java.awt.Color(255, 255, 255));
        btnOut.setText("THOÁT");
        btnOut.setBorderPainted(false);
        btnOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 570, -1, -1));

        btnRefresh.setBackground(new java.awt.Color(52, 152, 219));
        btnRefresh.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("REFRESH");
        btnRefresh.setBorderPainted(false);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 140));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnThem.setBackground(new java.awt.Color(205, 248, 241));
        btnThem.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnThem.setForeground(new java.awt.Color(0, 0, 0));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(205, 248, 241));
        btnSua.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnSua.setForeground(new java.awt.Color(0, 0, 0));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(52, 152, 219));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HOẠT ĐỘNG");
        jLabel2.setOpaque(true);

        btnTraCuu.setBackground(new java.awt.Color(205, 248, 241));
        btnTraCuu.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnTraCuu.setForeground(new java.awt.Color(0, 0, 0));
        btnTraCuu.setText("Tra cứu");
        btnTraCuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraCuuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTraCuu, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnThem)
                .addGap(35, 35, 35)
                .addComponent(btnTraCuu)
                .addGap(34, 34, 34)
                .addComponent(btnSua)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 340));

        btnBack.setBackground(new java.awt.Color(52, 152, 219));
        btnBack.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("TRỞ VỀ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/emetro6.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutActionPerformed
        int resConfirmDialog = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "XÁC NHẬN", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (resConfirmDialog == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnOutActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        tblModel.setRowCount(0);
        setTableData(congtyService.getAllCongTy());
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        ThemCTy themGa = new ThemCTy();
        themGa.setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int row = CongTyTable.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(TrangQLCTy.this, "Vui lòng chọn công ty cần sửa", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            String MaCTy = String.valueOf(CongTyTable.getValueAt(row, 0));

            new SuaCTy(MaCTy).setVisible(true);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTraCuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraCuuActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog(this, "Nhập tên công ty cần tra cứu:");
        if(input.length() > 0){
            congTy = congtyService.TraCuuCongTy(input);

            tblModel.setRowCount(0);

            setTableData(congTy);

        }
    }//GEN-LAST:event_btnTraCuuActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TrangChonQL().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CongTyTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOut;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTraCuu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
