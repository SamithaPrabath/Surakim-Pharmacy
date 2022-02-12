
package Payment;

import Home.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Payment extends javax.swing.JFrame {

    public Payment() {
        initComponents();
        showTableContents();
        recived.setText(new Login().name);
    }
    public static String b="0.0";
    public static String row[]=new String[8];
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
                row[5]=rs.getString("ramount");
                
              
                row[6]=rs.getString("balance");
               
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
        jLabel3 = new javax.swing.JLabel();
        bid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        recived = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        billTable = new javax.swing.JTable();
        pid = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();
        rAmount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        balance = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tobe = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(57, 96, 179));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setBackground(new java.awt.Color(0, 153, 255));
        jButton9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jButton9.setText("Payment Records");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 290, 90));

        jButton8.setBackground(new java.awt.Color(0, 153, 255));
        jButton8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jButton8.setText("Patients Payment");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 290, 90));

        jButton7.setBackground(new java.awt.Color(0, 153, 255));
        jButton7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jButton7.setText("Genarate Bill");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 290, 90));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/power-icon.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 640, 80, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 760));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255,200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Payment");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 390, 110));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("To be Paid(Rs)");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 140, 30));

        bid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bidActionPerformed(evt);
            }
        });
        bid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bidKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bidKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bidKeyTyped(evt);
            }
        });
        jPanel3.add(bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 110, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Patient Id");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 100, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Total Amount(Rs)");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 160, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Date");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 70, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Received By");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 120, 30));

        recived.setEditable(false);
        recived.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        recived.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recivedActionPerformed(evt);
            }
        });
        jPanel3.add(recived, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 220, 30));

        jButton4.setBackground(new java.awt.Color(153, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 110, 40));

        jButton5.setBackground(new java.awt.Color(153, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 110, 40));

        jButton6.setBackground(new java.awt.Color(153, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 110, 40));

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        billTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Payment Id", "Bill Id", "Received By", "Amount (Rs)", "last payment date", "Received amount(Rs)", "To be paid (Rs)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 810, 230));

        pid.setEditable(false);
        jPanel3.add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 70, 30));

        date.setEditable(false);
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        jPanel3.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 150, 30));

        amount.setEditable(false);
        jPanel3.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 180, 30));

        backbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backIcon.png"))); // NOI18N
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        jPanel3.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 680, 80, 60));

        rAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rAmountActionPerformed(evt);
            }
        });
        rAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rAmountKeyReleased(evt);
            }
        });
        jPanel3.add(rAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 180, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Bill Id");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 120, 30));

        balance.setEditable(false);
        jPanel3.add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 180, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Received amount (Rs)");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 180, 30));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 80, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Balance(Rs.)");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 140, 30));

        tobe.setEditable(false);
        jPanel3.add(tobe, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 180, 30));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(110, 10, 860, 740);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204,80));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 10, 1000, 700);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 1000, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bidActionPerformed

    private void bidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bidKeyPressed

    }//GEN-LAST:event_bidKeyPressed

    private void bidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bidKeyReleased
        
    }//GEN-LAST:event_bidKeyReleased

    private void bidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bidKeyTyped

    }//GEN-LAST:event_bidKeyTyped

    private void recivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recivedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recivedActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    
        try {

            int input = JOptionPane.showConfirmDialog(this, "Do you want to make a payment?");
            if(input == JOptionPane.YES_OPTION){
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();
                String s="";
                if(Double.valueOf(tobe.getText())<=0){
                    s="Full";
                    
                }
                else{
                    s="Half";
                }
                
                String query="select bid from payment where bid="+bid.getText()+";";
                ResultSet rs1=st.executeQuery(query);
                if(!rs1.next()){
                    query="insert into payment(bid,amount,date,recived,ramount,balance,status) values("+bid.getText()+","+amount.getText()+",now(),'"+recived.getText()+"',"+rAmount.getText()+","+tobe.getText()+",'"+s+"');";
                    int rs=st.executeUpdate(query);


                    query="update bill set status='"+s+"' where bid="+bid.getText()+";";
                    rs=st.executeUpdate(query);
                    query="select pid from bill where bid="+bid.getText()+";";
                    ResultSet rr=st.executeQuery(query);
                    rr.next();
                    query="update test set paid_date=curdate() where pid="+rr.getString("pid")+";";
                    rs=st.executeUpdate(query);
                    showTableContents();
                    b=balance.getText();
                    Receipt r=new Receipt();
                    r.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(this,"Tis bill already added");
                }
                
            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't Add payment \n Please Try Again!");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            int input = JOptionPane.showConfirmDialog(this, "Do you want to update Payment?");
            if(input == JOptionPane.YES_OPTION){
                if(!row[6].equals("0.0")){
                    
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                    Statement st=con.createStatement();

                    String s="";
                    if(Double.valueOf(tobe.getText())==0){
                        s="Full";

                    }
                    else{
                        s="Half";
                    }
                    double r=Double.valueOf(row[5])-Double.valueOf(tobe.getText())+Double.valueOf(amount.getText());
                    String query="update payment set bid="+Integer.valueOf(bid.getText())+",recived='"+recived.getText()+"',date=now(),status='"+s+"',balance="+tobe.getText()+",ramount="+r+" where pid="+Integer.valueOf(row[0])+";";
                    int rs=st.executeUpdate(query);
                    query="update bill set status='"+s+"' where bid="+Integer.valueOf(bid.getText())+";";
                    rs=st.executeUpdate(query);
                    showTableContents();
                    b=balance.getText();
                    Receipt rr=new Receipt();
                    rr.setVisible(true);
                    
                }
                else{
                   JOptionPane.showMessageDialog(this,"Bill Fully Paid!"); 
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't Update Payment \n Please Try Again!");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        bid.setText("");
        amount.setText("");
        //recived.setText("");
        pid.setText("");
        date.setText("");
        rAmount.setText("");
        balance.setText("");
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void billTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billTableMousePressed
        
        
        //recived.setText("");
        for(int i=0;i<billTable.getColumnCount();i++){
            row[i]=(String)billTable.getValueAt(billTable.getSelectedRow(),i);
        }
        pid.setText(row[0]);
        bid.setText(row[1]);
        recived.setText(row[2]);
        amount.setText(row[6]);
        date.setText(row[4]);
        tobe.setText(row[6]);
        
        
        
    }//GEN-LAST:event_billTableMousePressed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        PaymentReports pr=new PaymentReports();
        this.dispose();
        pr.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        GenerateBill t=new GenerateBill();
        this.dispose();
        t.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        PaymentManagement r=new PaymentManagement();
        this.dispose();
        r.setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        this.dispose();
        Login login=new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void rAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rAmountActionPerformed
        
    }//GEN-LAST:event_rAmountActionPerformed

    private void rAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rAmountKeyReleased
        if(!rAmount.getText().equals("")){
            try{
              if(!rAmount.getText().equals("0")){
                  if(!rAmount.getText().equals("-")){
                    double r=Double.valueOf(rAmount.getText());
                    if((r-Double.valueOf(amount.getText()))>=0){
                        balance.setText(String.valueOf(r-Double.valueOf(amount.getText())));
                        tobe.setText("0.0");
                    }
                    else{
                        tobe.setText(String.valueOf(Double.valueOf(amount.getText())-r));
                        balance.setText("0.0");
                    }
                  }
              }
              else{
                  JOptionPane.showMessageDialog(this,"Invalid amount");
                  rAmount.setText("");
              }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,"Please Enter Integers Only");
                rAmount.setText("");
            }
        }
       
    }//GEN-LAST:event_rAmountKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            pid.setText("");
            date.setText("");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            String query="select pid,date,amount,status from bill where bid="+Integer.valueOf(bid.getText())+";";
            ResultSet rs=st.executeQuery(query);
            rs.next();
            pid.setText(rs.getString("pid"));
            date.setText(rs.getString("date"));
            amount.setText(rs.getString("amount"));
            tobe.setText(rs.getString("amount"));
            if(rs.getString("status").equals("Paid")){
                JOptionPane.showMessageDialog(this,"This bill already paid");
            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Invalid Bill Id \n Please Try Again!");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField balance;
    private javax.swing.JTextField bid;
    private javax.swing.JTable billTable;
    private javax.swing.JTextField date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField rAmount;
    private javax.swing.JTextField recived;
    private javax.swing.JTextField tobe;
    // End of variables declaration//GEN-END:variables
}
