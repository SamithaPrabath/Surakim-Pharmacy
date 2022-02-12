
package Payment;

import Home.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PaymentReports extends javax.swing.JFrame {


    public PaymentReports() {
        initComponents();
        showTableContents();
    }

    public static String row[]=new String[5];
    public void showTableContents(){
        DefaultTableModel dt =(DefaultTableModel)billTable.getModel();
        dt.setRowCount(0);
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            String query="select * from payment;";
            ResultSet rs=st.executeQuery(query);
            for(int i=0;rs.next();i++){
                row[0]=rs.getString("pid");
                row[1]=rs.getString("bid");
                row[2]=rs.getString("recived");
                row[3]=rs.getString("amount");
                row[4]=rs.getString("date");
                dt.addRow(row);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't Add Payment \n Please Try Again!");
            System.out.println(e.getMessage());
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        billTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        backbtn2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(57, 96, 179));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setBackground(new java.awt.Color(0, 153, 255));
        jButton9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jButton9.setText("Bill Records");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 330, 100));

        jButton8.setBackground(new java.awt.Color(0, 153, 255));
        jButton8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jButton8.setText("Patients Payment");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 330, 100));

        jButton7.setBackground(new java.awt.Color(0, 153, 255));
        jButton7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jButton7.setText("Genarate Bill");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 330, 110));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/power-icon.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, 80, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 760));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255,200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Payment Reports");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 390, 110));

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        billTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Payment Id", "Bill Id", "Recived By", "Amount", "date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        billTable.setRowHeight(30);
        billTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                billTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(billTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 760, 380));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Payment ID   :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, -1));

        pid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });
        jPanel3.add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 180, -1));

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Generate Monthly Report");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 200, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Generate Daily Report");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 180, -1));

        backbtn2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backIcon.png"))); // NOI18N
        backbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn2ActionPerformed(evt);
            }
        });
        jPanel3.add(backbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 630, 80, 70));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(110, 10, 820, 730);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204,80));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 10, 1000, 700);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 1000, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void billTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billTableMousePressed
        
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            String query="select pid,date,amount,status from bill where bid=;";
            ResultSet rs=st.executeQuery(query);
            rs.next();

        }
        catch(Exception e){
            showTableContents();
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_billTableMousePressed

    private void pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel dt =(DefaultTableModel)billTable.getModel();
        dt.setRowCount(0);
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            String query="select * from payment where pid="+Integer.valueOf(pid.getText())+";";
            ResultSet rs=st.executeQuery(query);
            for(int i=0;rs.next();i++){
                row[0]=rs.getString("pid");
                row[1]=rs.getString("bid");
                row[2]=rs.getString("recived");
                row[3]=rs.getString("amount");
                row[4]=rs.getString("date");
                dt.addRow(row);
            }
            
        }
        catch(Exception e){
            showTableContents();
            System.out.println(e.getMessage());
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MonthlyPaymentReport mr=new MonthlyPaymentReport();
        mr.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       DailyPaymentReport dp=new DailyPaymentReport();
       dp.setVisible(true);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Payment p=new Payment();
        this.dispose();
        p.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
        GenerateBill t=new GenerateBill();
        t.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        this.dispose();
        Login login=new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void backbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn2ActionPerformed
        //BACK BUTTON
        PaymentManagement r=new PaymentManagement();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbtn2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn2;
    private javax.swing.JTable billTable;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pid;
    // End of variables declaration//GEN-END:variables
}
