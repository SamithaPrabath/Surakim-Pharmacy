
package Payment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class Receipt extends javax.swing.JFrame {

    public Receipt() {
        initComponents();
        showReceipt();
    }
   
    public void showReceipt(){
        String row[]=new Payment().row;
        paymentNo.setText(row[0]);
        date.setText(row[4]);
        amount.setText(row[3]);
        rAmount.setText(row[5]);
        tobe.setText(row[6]);
        rby.setText(row[2]);
        balance.setText(new Payment().b);
        try {
            DefaultTableModel dt =(DefaultTableModel)testType.getModel();
            dt.setRowCount(0);
            String r[]=new String[2];
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            Statement st1=con.createStatement();
            String query="select pid from bill where bid="+Integer.valueOf(row[1])+";";
            ResultSet rs=st.executeQuery(query);
            rs.next();
            patientNo.setText(rs.getString("pid"));
            query="select first_name,last_name,doctor_name,pid from patient where pid="+Integer.valueOf(patientNo.getText())+";";
            rs=st.executeQuery(query);
            rs.next();
            pname.setText(rs.getString("first_name")+" "+rs.getString("last_name"));
            doctor.setText(rs.getString("doctor_name"));
            query="select test_type from test where pid="+rs.getString("pid")+";";
            rs=st.executeQuery(query);
                
            while(rs.next()){
                //System.out.println(rs.getString("test_id"));
                r[0]=rs.getString("test_type");
                query="select price from test_types where acronym='"+rs.getString("test_type")+"';";
                ResultSet rs1=st1.executeQuery(query);
                rs1.next();
                r[1]=rs1.getString("price");
                System.out.println(rs1.getString("price"));

                dt.addRow(r);

            }
                        
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        paymentNo = new javax.swing.JTextField();
        patientNo = new javax.swing.JTextField();
        pname = new javax.swing.JTextField();
        doctor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rAmount = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        balance = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        testType = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rby = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tobe = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Amount(Rs)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Reciept");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 170, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Patient No");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Patient Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Doctor");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        amount.setEditable(false);
        jPanel1.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 600, 160, -1));

        date.setEditable(false);
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 160, -1));

        paymentNo.setEditable(false);
        paymentNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentNoActionPerformed(evt);
            }
        });
        jPanel1.add(paymentNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 110, -1));

        patientNo.setEditable(false);
        jPanel1.add(patientNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 110, -1));

        pname.setEditable(false);
        jPanel1.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 340, -1));

        doctor.setEditable(false);
        jPanel1.add(doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 340, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Recived Amount (Rs)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, -1, -1));

        rAmount.setEditable(false);
        rAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(rAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 160, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Balance (Rs)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, -1, -1));

        balance.setEditable(false);
        balance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 160, -1));

        testType.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Test Type", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(testType);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 450, 80));

        jLabel8.setText("Signature -: ..........................................");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 770, 230, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Recived By");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 680, 80, -1));

        rby.setEditable(false);
        jPanel1.add(rby, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 680, 230, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Amount to be paid (Rs)");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 640, 160, -1));

        tobe.setEditable(false);
        jPanel1.add(tobe, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 640, 160, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-2.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 420, 210));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Address : 223 c,Galahitiyawa,\nGanemulla\nTelephone :033-226644516\nEmail :surakim@live.com");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 280, 110));

        jProgressBar1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 720, 10));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Payment No");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 720, 830));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void paymentNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentNoActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JTextField balance;
    private javax.swing.JTextField date;
    private javax.swing.JTextField doctor;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField patientNo;
    private javax.swing.JTextField paymentNo;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField rAmount;
    private javax.swing.JTextField rby;
    private javax.swing.JTable testType;
    private javax.swing.JTextField tobe;
    // End of variables declaration//GEN-END:variables
}
