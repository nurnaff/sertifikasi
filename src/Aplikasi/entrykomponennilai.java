package Aplikasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.*;
public class entrykomponennilai extends javax.swing.JFrame {
private Connection conn;
    private ResultSet rsl;
    private Statement stm;
    private String[] header={"ID_PESERTA","ID_KOMPONEN","NILAI"};
    private Object[][] data=null;
    private String id,nama,bobot;
    public entrykomponennilai() {
        initComponents();
        konnek();
        bacadt();
        isicombo1();
        isicombo2();
        klikombo1();
        klikombo2();
    }
    public void klikombo1(){
    jComboBox1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             try{
             stm=conn.createStatement();
          rsl=stm.executeQuery("SELECT * FROM peserta WHERE ID_PESERTA='"+jComboBox1.getSelectedItem().toString()+"'");
          ResultSetMetaData meta=rsl.getMetaData();
          rsl.beforeFirst();
          while(rsl.next()) {
              jLabel5.setText(rsl.getString("NAMA_PESERTA"));
              }
             } catch(SQLException ev) {
            JOptionPane.showMessageDialog(null, ev);        }
          }  
        });
}
    public void klikombo2(){
    jComboBox2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             try{
             stm=conn.createStatement();
          rsl=stm.executeQuery("SELECT * FROM komponen_kriteria WHERE ID_KOMPONEN='"+jComboBox2.getSelectedItem().toString()+"'");
          ResultSetMetaData meta=rsl.getMetaData();
          rsl.beforeFirst();
          while(rsl.next()) {
              jLabel6.setText(rsl.getString("Kriteria"));
              }
             } catch(SQLException ev) {
            JOptionPane.showMessageDialog(null, ev);        }
          }  
        });
}
    public void kosong() {
     jTextField3.setText(""); 
    jLabel6.setText(" ");}
    public void aktif(boolean x) {
      jTextField3.setEditable(x);     }
    public void isicombo1() {
        try {
          stm=conn.createStatement();
          rsl=stm.executeQuery("SELECT * FROM peserta");
          ResultSetMetaData meta=rsl.getMetaData();
          rsl.beforeFirst();
          while(rsl.next()) {
              jComboBox1.addItem(rsl.getString("ID_PESERTA"));
              }
          } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);        }
    }
    public void isicombo2() {
        try {
          stm=conn.createStatement();
          rsl=stm.executeQuery("SELECT * FROM komponen_kriteria");
          ResultSetMetaData meta=rsl.getMetaData();
          rsl.beforeFirst();
          while(rsl.next()) {
              jComboBox2.addItem(rsl.getString("ID_KOMPONEN"));
              }
          } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);        }
    }
    public void bacadt() {
        try {
          stm=conn.createStatement();
          rsl=stm.executeQuery("SELECT * FROM komponen");
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
              data[x][1]=rsl.getString("ID_KOMPONEN");
              data[x][2]=rsl.getString("NILAI");
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

        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bacground11 = new bgr.bacground1();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jButton4.setText("Tutup");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(146, 146, 146))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(681, 681, 681)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Batang", 1, 14)); // NOI18N
        jLabel1.setText("DATA KOMPONEN PENILAIAN");

        jLabel2.setText("ID_PESERTA");

        jLabel3.setText("ID_KOMPONEN");

        jLabel4.setText("NILAI_KOMPONEN");

        jTextField3.setEditable(false);

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

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setText("Tutup");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bacground11Layout = new javax.swing.GroupLayout(bacground11);
        bacground11.setLayout(bacground11Layout);
        bacground11Layout.setHorizontalGroup(
            bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bacground11Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bacground11Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1))
                    .addGroup(bacground11Layout.createSequentialGroup()
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(162, 162, 162)
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField3)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bacground11Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        bacground11Layout.setVerticalGroup(
            bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bacground11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(bacground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bacground11Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bacground11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bacground11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(674, 673));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     //   setdata();
    }//GEN-LAST:event_jTable1MouseClicked
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        kosong();
        aktif(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     id=(String)jComboBox1.getSelectedItem();
     nama=(String)jComboBox2.getSelectedItem();
     bobot=jTextField3.getText();
     try{
         stm=conn.createStatement();
         stm.executeUpdate("INSERT INTO komponen VALUES('"+id+"','"+nama+"','"+bobot+"')");
         bacadt();
         kosong();
         aktif(false);
     } catch(SQLException es) {
         JOptionPane.showMessageDialog(null,es); }
    }//GEN-LAST:event_jButton2ActionPerformed
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     dispose();
     MenuUtama vi=new MenuUtama();
     vi.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        id=(String)jComboBox1.getSelectedItem();
        try{
            stm=conn.createStatement();
            stm.executeUpdate("DELETE from komponen where ID_PESERTA='"+id+"' and ID_KOMPONEN='"+(String)jComboBox2.getSelectedItem()+"'");
            bacadt();
            kosong();
            aktif(false);
        } catch(SQLException ess) {
            JOptionPane.showMessageDialog(null,ess);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new entrykomponennilai().setVisible(true);
            }
        });
    }   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private bgr.bacground1 bacground11;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
    
}
