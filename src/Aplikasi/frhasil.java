package Aplikasi;
import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.*;
public class frhasil extends javax.swing.JFrame {
    private Connection conn;
    private ResultSet rsl;
    private Statement stm;
    private String[] header={"ID_DATA","ID_PESERTA","NIP_PESERTA","KRITERIA1","KRITERIA2","KRITERIA3","KRITERIA4","KRITERIA5","KRITERIA6","KRITERIA7","KRITERIA8","KRITERIA9","KRITERIA10","HASIL"};
    private Object[][] data=null;
    private frdatauji anak;
    public frhasil() {
        initComponents();
        konnek();
        bacadt();
    }
    public void bacadt() {
        try {
          stm=conn.createStatement();
          rsl=stm.executeQuery("SELECT * FROM data_uji where HASIL='LULUS'");
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
              data[x][0]=rsl.getString("ID_DATA");
              data[x][1]=rsl.getString("ID_PESERTA");
              data[x][2]=rsl.getString("NIP_PESERTA");
              data[x][3]=rsl.getString("KRITERIA1");
              data[x][4]=rsl.getString("KRITERIA2");
              data[x][5]=rsl.getString("KRITERIA3");
              data[x][6]=rsl.getString("KRITERIA4");
              data[x][7]=rsl.getString("KRITERIA5");
              data[x][8]=rsl.getString("KRITERIA6");
              data[x][9]=rsl.getString("KRITERIA7");
              data[x][10]=rsl.getString("KRITERIA8");
              data[x][11]=rsl.getString("KRITERIA9");
              data[x][12]=rsl.getString("KRITERIA10");
              data[x][13]=rsl.getString("HASIL");
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
            //System.out.println("Driver Error");
       }
       catch(SQLException e) {
       //     System.out.println("Koneksi Gagal");
       }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frhasil().setVisible(true);
            }
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Batang", 1, 14)); // NOI18N
        jLabel1.setText("HASIL PESERTA SERTIFIKASI");

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

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(580, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(722, 504));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        MenuUtama v=new MenuUtama();
        v.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
}