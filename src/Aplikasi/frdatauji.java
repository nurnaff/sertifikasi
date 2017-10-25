package Aplikasi;
import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.*;
public class frdatauji extends javax.swing.JFrame {
private Connection conn;
    private ResultSet rsl;
    private Statement stm;
    private String iddata,idpeserta,nippeserta,krite1,krite2,krite3,krite4,krite5,krite6,krite7,krite8,krite9,krite10,hasil;
    private double a1,a2,a3,a4,a5;
    public frdatauji() {
        initComponents();
        konnek();
        isicombo();
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
       //     System.out.println("Koneksi Gagal");
       }
    }
    public void isicombo() {
        try {
          stm=conn.createStatement();
          rsl=stm.executeQuery("SELECT * FROM peserta");
          ResultSetMetaData meta=rsl.getMetaData();
          rsl.beforeFirst();
          while(rsl.next()) {
              jComboBox1.addItem(rsl.getString("ID_PESERTA"));
              jComboBox2.addItem(rsl.getString("NIP_PESERTA"));
              }
          } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);        }
    }
    public void kosong() {
     jTextField1.setText("");   
     jLabel16.setText("");  
     jTextField3.setText("");
     jTextField4.setText("");
     jTextField9.setText("");
     jTextField12.setText("");
     }
    public void aktif(boolean x) {
      jTextField1.setEditable(x);  
      jTextField3.setEditable(x);  
      jTextField4.setEditable(x);  
      jTextField9.setEditable(x);  
      jTextField12.setEditable(x);  
     }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bacground11 = new bgr.bacground1();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        jButton1.setText("Buka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Proses");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("Simpan");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setText("Tutup");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Batang", 1, 14)); // NOI18N
        jLabel1.setText("PENENTUAN SERTIFIKASI");

        jLabel2.setText("ID_DATA");

        jLabel3.setText("ID_PESERTA");

        jLabel4.setText("NIP_PESERTA");

        jLabel5.setText("KRITERIA_1");

        jLabel6.setText("KRITERIA_2");

        jLabel7.setText("KRITERIA_3");

        jLabel8.setText("KRITERIA_4");

        jLabel9.setText("KRITERIA_5");

        jLabel10.setText("KRITERIA_6");

        jLabel11.setText("KRITERIA_7");

        jLabel12.setText("KRITERIA_8");

        jLabel13.setText("KRITERIA_9");

        jLabel14.setText("KRITERIA_10");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("HASIL");

        jTextField1.setEditable(false);

        jTextField3.setEditable(false);

        jTextField4.setEditable(false);

        jTextField9.setEditable(false);

        jTextField12.setEditable(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("jLabel16");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "S1", "S2", "SMA", "D1", "D2", "D3", "D4" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RPP", "Tidak" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Peserta", "Tidak", "Juara 1", "Juara 2", "Juara 3" }));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Diktat", "Media Pembelajaran", "Modul", "Buku", "Majalah", "Jurnal" }));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ketua MGMP", "Wali Kelas", "Wakil Kepala Sekolah", "Tidak", "Kepala Lab", "Kepala Perpus", "Ketua Jurusan", "Kepala Koperasi" }));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ada", "Tidak" }));

        javax.swing.GroupLayout bacground11Layout = new javax.swing.GroupLayout(bacground11);
        bacground11.setLayout(bacground11Layout);
        bacground11Layout.setHorizontalGroup(
            bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bacground11Layout.createSequentialGroup()
                .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bacground11Layout.createSequentialGroup()
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bacground11Layout.createSequentialGroup()
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField3)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, 186, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(140, 140, 140)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bacground11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(224, 224, 224))
            .addGroup(bacground11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(569, 569, 569))
        );
        bacground11Layout.setVerticalGroup(
            bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bacground11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16))
                    .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bacground11Layout.createSequentialGroup()
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bacground11Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(200, 200, 200))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bacground11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bacground11, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(656, 475));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
        MenuUtama vi=new MenuUtama();
        vi.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     iddata=jTextField1.getText();
     idpeserta=(String)jComboBox1.getSelectedItem();
     nippeserta=(String)jComboBox2.getSelectedItem();
     krite1=(String)jComboBox3.getSelectedItem();
     a1=Double.parseDouble(jTextField3.getText());
     if(a1<=7) {krite2="Sedikit";}
     else if((a1>7) && (a1<=15)) {krite2="Sedang";}
     else if(a1>15) {krite2="Banyak";}
     a2=Double.parseDouble(jTextField4.getText());
     if(a2<=7) {krite3="Sedikit";}
     else if((a2>7) && (a2<=15)) {krite3="Sedang";}
     else if(a2>15) {krite3="Lama";}
     krite4=(String)jComboBox4.getSelectedItem();
     a3=Double.parseDouble(jTextField9.getText());
     if(a3<=70) {krite5="Cukup";}
     else if((a3>70) && (a3<=84)) {krite5="Baik";}
     else if(a3>84) {krite5="Sangat Baik";}
     krite6=(String)jComboBox5.getSelectedItem();
     krite7=(String)jComboBox6.getSelectedItem();
     a4=Double.parseDouble(jTextField12.getText());
     if(a4<1) {krite8="Tidak";}
     else if(a4>=1) {krite8="Ada";}
     krite9=(String)jComboBox7.getSelectedItem();
     krite10=(String)jComboBox8.getSelectedItem();
     hasil=jLabel16.getText();
     try{
         stm=conn.createStatement();
         stm.executeUpdate("INSERT INTO data_uji VALUES('"+iddata+"','"+idpeserta+"','"+nippeserta+"','"+krite1+"','"+krite2+"','"+krite3+"','"+krite4+"','"+krite5+"','"+krite6+"','"+krite7+"','"+krite8+"','"+krite9+"','"+krite10+"','"+hasil+"')");
         kosong();
         aktif(false);
     } catch(SQLException es) {
         JOptionPane.showMessageDialog(null,es); }
    }//GEN-LAST:event_jButton5ActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        kosong();
        aktif(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     krite1=(String)jComboBox3.getSelectedItem();
     a1=Double.parseDouble(jTextField3.getText());
     if(a1<=7) {krite2="Sedikit";}
     else if((a1>7) && (a1<=15)) {krite2="Sedang";}
     else if(a1>15) {krite2="Banyak";}
     a2=Double.parseDouble(jTextField4.getText());
     if(a2<=7) {krite3="Sedikit";}
     else if((a2>7) && (a2<=15)) {krite3="Sedang";}
     else if(a2>15) {krite3="Lama";}
     krite4=(String)jComboBox4.getSelectedItem();
     a3=Double.parseDouble(jTextField9.getText());
     if(a3<=70) {krite5="Cukup";}
     else if((a3>70) && (a3<=84)) {krite5="Baik";}
     else if(a3>84) {krite5="Sangat Baik";}
     krite6=(String)jComboBox5.getSelectedItem();
     krite7=(String)jComboBox6.getSelectedItem();
     a4=Double.parseDouble(jTextField12.getText());
     if(a4<1) {krite8="Tidak";}
     else if(a4>=1) {krite8="Ada";}
     krite9=(String)jComboBox7.getSelectedItem();
     krite10=(String)jComboBox8.getSelectedItem();
     
     if((krite1=="S1") && (krite3=="Sedikit")) {jLabel16.setText("Tidak Lulus");}
     else if((krite1=="S1") && ((krite3=="Sedang") ||(krite3=="Banyak"))) {jLabel16.setText("Lulus");}
     else if ((krite1!="S1") && (krite1=="D4") && (krite3=="Sedikit")) {jLabel16.setText("Tidak Lulus");}
     else if ((krite1!="S1") && (krite1=="D4") && ((krite3=="Sedang") || (krite3=="Banyak"))) {jLabel16.setText("Lulus");}
     else if ((krite1!="S1") && (krite1!="D4") && (krite1=="S2") && (krite3=="Sedikit")) {jLabel16.setText("Tidak Lulus");}
     else if ((krite1!="S1") && (krite1!="D4") && (krite1=="S2") && ((krite3=="Sedang") || (krite3=="Banyak"))) {jLabel16.setText("Lulus");}
     else if ((krite1!="S1") && (krite1!="D4") && (krite1!="S2")) {jLabel16.setText("Tidak Lulus");}
     else {jLabel16.setText("Tidak Lulus");}
    }//GEN-LAST:event_jButton2ActionPerformed
      public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frdatauji().setVisible(true);
            }
        });
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private bgr.bacground1 bacground11;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
   }