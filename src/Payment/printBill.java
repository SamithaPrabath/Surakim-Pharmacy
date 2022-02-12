
package Payment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class printBill extends javax.swing.JFrame {

    public printBill() {
        initComponents();
        showBill();
    }

    public void showBill(){
        String rp[]=new GenerateBill().row;
        bid.setText(rp[0]);
        pid.setText(rp[1]);
        amount.setText(rp[2]);
        issuedby.setText(rp[3]);
        date.setText(rp[4]);
        type.setText("");
        System.out.println(rp[0]);
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            String query="select first_name,last_name from patient where pid="+Integer.valueOf(rp[1])+";";
            ResultSet rs=st.executeQuery(query);
            rs.next();
            pname.setText(rs.getString("first_name")+" "+rs.getString("last_name"));
            query="select test_type from test where pid="+Integer.valueOf(rp[1])+";";
            rs=st.executeQuery(query);
            while(rs.next()){
                type.setText(type.getText()+rs.getString("test_type")+",");
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Invalid Patient Id \n Please Try Again!");
            System.out.println(e.getMessage());
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pid = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pname = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        issuedby = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        bid = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Bill No           :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Patient Id       :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 140, -1));

        pid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pid.setText("Bill No           :");
        jPanel2.add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 210, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Patient Name  :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 140, -1));

        pname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pname.setText("Bill No           :");
        jPanel2.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 260, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Test Type      :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 140, -1));

        type.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        type.setText("Bill No           :");
        jPanel2.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 380, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Amount (Rs)      :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 170, -1));

        amount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        amount.setText("Bill No           :");
        jPanel2.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 240, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Date :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 60, -1));

        issuedby.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        issuedby.setText("Bill No           :");
        jPanel2.add(issuedby, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 240, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText(".............................");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 150, 10));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Issued By      :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 140, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Signature");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, 100, -1));

        jLabel5.setText(".............................");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, 120, 20));

        date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        date.setText("jLabel16");
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 150, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-2.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 370, 210));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Address : 223 c,Galahitiyawa,\nGanemulla\nTelephone :033-226644516\nEmail :surakim@live.com");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 250, 110));

        bid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bid.setText("Bill No           :");
        jPanel2.add(bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 220, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 630, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Bill");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 206, 120, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amount;
    private javax.swing.JLabel bid;
    private javax.swing.JLabel date;
    private javax.swing.JLabel issuedby;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel pid;
    private javax.swing.JLabel pname;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}
