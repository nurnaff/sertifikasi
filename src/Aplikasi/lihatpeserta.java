package Aplikasi;
import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.*;
public class lihatpeserta extends javax.swing.JFrame {
    private Connection conn;
    private ResultSet rsl;
    private Statement stm;
    private String[] header={"ID_PESERTA","NIP_PESERTA","NUPTK_PESERTA","NAMA_PESERTA","TEMPAT_LAHIR","TANGGAL_LAHIR","ALAMAT","PANGKAT_GOL","NAMA_SEKOLAH","ALAMAT_SEKOLAH","STATUS_PEGAWAI","STATUS_SEKOLAH"};
    private Object[][] data=null;
    private entrypeserta anak;
    public lihatpeserta() {
        initComponents();
        konnek();
        bacadt();
    }
 public void bacadt() {
        try {
          stm=conn.createStatement();
          rsl=stm.executeQuery("SELECT * FROM peserta");
          ResultSetMetaData meta=rsl.getMetaData();
          int col=meta.getColumnCount();
          int baris=0;
          while(rsl.next()) {
              baris=rsl.getRow();
          }
          data=new Object[baris][col];
          int x=0;
          rsl.beforeFirst();
          while(rsl.next()) {
              data[x][0]=rsl.getString("ID_PESERTA");
              data[x][1]=rsl.getString("NIP_PESERTA");
              data[x][2]=rsl.getString("NUPTK_PESERTA");
              data[x][3]=rsl.getString("NAMA_PESERTA");
              data[x][4]=rsl.getString("TEMPAT_LAHIR");
              data[x][5]=rsl.getString("TANGGAL_LAHIR");
              data[x][6]=rsl.getString("ALAMAT");
              data[x][7]=rsl.getString("PANGKAT_GOL");
              data[x][8]=rsl.getString("NAMA_SEKOLAH");
              data[x][9]=rsl.getString("ALAMAT_SEKOLAH");
              data[x][10]=rsl.getString("STATUS_PESERTA");
              data[x][11]=rsl.getString("STATUS_SEKOLAH");
              x++;
          }
          jTable1.setModel(new DefaultTableModel(data,header));
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);        }
    }
    public void konnek() {
       try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sertifikasi","root","");
            //System.out.println("Koneksi Berhasil");
       } catch (ClassNotFoundException ex) {
       //     System.out.println("Driver Error");
       }
         catch(SQLException e) {
         //   System.out.println("Koneksi Gagal");
         }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 153, 153));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Batang", 0, 14)); // NOI18N
        jLabel1.setText("DATA GURU");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("Kembali");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(478, 478, 478)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel1)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(661, 542));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        MenuUtama v=new MenuUtama();
        v.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lihatpeserta().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}