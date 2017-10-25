package Aplikasi;
import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.*;
public class entrypeserta extends javax.swing.JFrame {
    private Connection conn;
    private ResultSet rsl;
    private Statement stm;
    private String[] header={"ID_PESERTA","NIP_PESERTA","NUPTK_PESERTA","NAMA_PESERTA","TEMPAT_LAHIR","TANGGAL_LAHIR","ALAMAT","PANGKAT_GOL","NAMA_SEKOLAH","ALAMAT_SEKOLAH","STATUS_PEGAWAI","STATUS_SEKOLAH"};
    private Object[][] data=null;
    private String idpeserta,nip,nuptk,namapeserta,tempat,tanggal,alamat,pangkat,namasekolah,alamatsekolah,statuspegawai,statussekolah;
    public entrypeserta() {
        initComponents();
        konnek();
        bacadt();
    }
    public void setdata() {
        int row=jTable1.getSelectedRow();
        jTextField1.setText((String)jTable1.getValueAt(row, 0));
        jTextField2.setText((String)jTable1.getValueAt(row, 1));
        jTextField3.setText((String)jTable1.getValueAt(row, 2));
        jTextField4.setText((String)jTable1.getValueAt(row, 3));
        jTextField5.setText((String)jTable1.getValueAt(row, 4));
        jTextField6.setText((String)jTable1.getValueAt(row, 5));
        jTextField7.setText((String)jTable1.getValueAt(row, 6));
        jTextField9.setText((String)jTable1.getValueAt(row, 8));
        jTextField10.setText((String)jTable1.getValueAt(row, 9));
       }
    public void konnek() {
       try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sertifikasi","root","");
            //System.out.println("Koneksi Berhasil");
       } catch (ClassNotFoundException ex) {
            //System.out.println("Driver Error");
       }
       catch(SQLException e) {
            //System.out.println("Koneksi Gagal");
       }
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
    public void kosong() {
     jTextField1.setText("");   
     jTextField2.setText("");
     jTextField3.setText("");
     jTextField4.setText("");
     jTextField5.setText("");
     jTextField6.setText("");
     jTextField7.setText("");
     jTextField9.setText("");
     jTextField10.setText("");
    }
    public void aktif(boolean x) {
      jTextField1.setEditable(x);  
      jTextField2.setEditable(x);
      jTextField3.setEditable(x);
      jTextField4.setEditable(x);
      jTextField5.setEditable(x);
      jTextField6.setEditable(x);
      jTextField7.setEditable(x);
      jTextField9.setEditable(x);
      jTextField10.setEditable(x);
      }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bacground11 = new bgr.bacground1();
        jTextField9 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        jTextField9.setEditable(false);

        jLabel3.setText("NIP_PESERTA");

        jTextField3.setEditable(false);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Swasta", "Negeri" }));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3A", "3B", "3C", "3D", "4A", "4B", "4C", "4D", "4E" }));

        jLabel12.setText("Tulis dd/mm/yyyy");

        jLabel6.setText("TEMPAT_LAHIR");

        jLabel10.setText("NAMA_SEKOLAH");

        jLabel16.setText("Tidak Bisa Diedit");

        jLabel14.setText("STATUS PESERTA");

        jTextField1.setEditable(false);

        jLabel15.setText("STATUS SEKOLAH");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pegawai Negeri", "Guru Swasta", "Gutu Tetap Yayasan", "Guru Bantu", "Guru Tidak Tetap" }));

        jLabel2.setText("ID_PESERTA");

        jLabel8.setText("ALAMAT");

        jTextField7.setEditable(false);

        jLabel9.setText("PANGKAT_GOL");

        jTextField5.setEditable(false);

        jLabel13.setText("Jika PNS (Tidak Bisa Diedit)");

        jTextField6.setEditable(false);

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setText("NUPTK_PESERTA");

        jTextField2.setEditable(false);

        jLabel7.setText("TANGGAL_LAHIR");

        jTextField10.setEditable(false);

        jLabel5.setText("NAMA_PESERTA");

        jLabel11.setText("ALAMAT_SEKOLAH");

        jTextField4.setEditable(false);

        jButton1.setText("Buka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Simpan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("Edit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Hapus");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setText("Keluar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bacground11Layout = new javax.swing.GroupLayout(bacground11);
        bacground11.setLayout(bacground11Layout);
        bacground11Layout.setHorizontalGroup(
            bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(bacground11Layout.createSequentialGroup()
                .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bacground11Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(99, 99, 99)
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bacground11Layout.createSequentialGroup()
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12))
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bacground11Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13))
                            .addGroup(bacground11Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)))
                        .addGap(32, 32, 32)
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel8))
                        .addGap(90, 90, 90)
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField7)
                            .addComponent(jTextField9)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, 252, Short.MAX_VALUE)
                            .addComponent(jTextField10)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(bacground11Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bacground11Layout.setVerticalGroup(
            bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bacground11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bacground11Layout.createSequentialGroup()
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(bacground11Layout.createSequentialGroup()
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Batang", 1, 14)); // NOI18N
        jLabel1.setText("ENTRY DATA GURU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bacground11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bacground11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1123, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        kosong();
        aktif(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     idpeserta=jTextField1.getText();
     nip=jTextField2.getText();
     nuptk=jTextField3.getText();
     namapeserta=jTextField4.getText();
     tempat=jTextField5.getText();
     tanggal=jTextField6.getText();
     alamat=jTextField7.getText();
     pangkat=(String)jComboBox1.getSelectedItem();
     namasekolah=jTextField9.getText();
     alamatsekolah=jTextField10.getText();
     statuspegawai=(String)jComboBox2.getSelectedItem();
     statussekolah=(String)jComboBox3.getSelectedItem();
     try{
         stm=conn.createStatement();
         stm.executeUpdate("INSERT INTO peserta VALUES('"+idpeserta+"','"+nip+"','"+nuptk+"','"+namapeserta+"','"+tempat+"','"+tanggal+"','"+alamat+"','"+pangkat+"','"+namasekolah+"','"+alamatsekolah+"','"+statuspegawai+"','"+statussekolah+"')");
         kosong();
         aktif(false);
     } catch(SQLException es) {
         JOptionPane.showMessageDialog(null,es); }
    }//GEN-LAST:event_jButton2ActionPerformed
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
        MenuUtama v=new MenuUtama();
        v.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     idpeserta=jTextField1.getText();
     nip=jTextField2.getText();
     nuptk=jTextField3.getText();
     namapeserta=jTextField4.getText();
     tempat=jTextField5.getText();
     tanggal=jTextField6.getText();
     alamat=jTextField7.getText();
    pangkat=(String)jComboBox1.getSelectedItem();
     namasekolah=jTextField9.getText();
     alamatsekolah=jTextField10.getText();
     statuspegawai=(String)jComboBox2.getSelectedItem();
     statussekolah=(String)jComboBox3.getSelectedItem();
     try{
         stm=conn.createStatement();
         stm.executeUpdate("UPDATE peserta set NUPTK_PESERTA='"+nuptk+"',NAMA_PESERTA='"+namapeserta+"',TEMPAT_LAHIR='"+tempat+"',TANGGAL_LAHIR='"+tanggal+"',ALAMAT='"+alamat+"',PANGKAT_GOL='"+pangkat+"',NAMA_SEKOLAH='"+namasekolah+"',ALAMAT_SEKOLAH='"+alamatsekolah+"',STATUS_PESERTA='"+statuspegawai+"',STATUS_SEKOLAH='"+statussekolah+"' where ID_PESERTA='"+idpeserta+"' and NIP_PESERTA='"+nip+"'");
         kosong();
         aktif(false);
     } catch(SQLException ess) {
         JOptionPane.showMessageDialog(null,ess);     }
    }//GEN-LAST:event_jButton5ActionPerformed
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     idpeserta=jTextField1.getText();
     nip=jTextField2.getText();
     try{
         stm=conn.createStatement();
         stm.executeUpdate("DELETE from peserta where ID_PESERTA='"+idpeserta+"' and NIP_PESERTA='"+nip+"'");
         kosong();
         aktif(false);
     } catch(SQLException ess) {
         JOptionPane.showMessageDialog(null,ess);   }
    }//GEN-LAST:event_jButton6ActionPerformed
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        setdata();
    }//GEN-LAST:event_jTable1MouseClicked
     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new entrypeserta().setVisible(true);
            }
        });
    }  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private bgr.bacground1 bacground11;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}